package com.codegans.sql.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class FakeAutoCloseable implements AutoCloseable {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    protected final AtomicBoolean active = new AtomicBoolean(true);

    protected void invokeOpened(Object... args) throws SQLException {
        invokeAny(args);
        assertOpen();
    }

    protected void invokeAny(Object... args) {
        if (log.isDebugEnabled()) {
            List<ClassWrapper> argsType = Arrays.stream(args).map(ClassWrapper::new).collect(Collectors.toList());

            String method = StackWalker.getInstance()
                    .walk(s -> s.filter(e -> e.getDeclaringClass() != getClass())
                            .filter(e -> {
                                Class<?>[] params = e.getMethodType().parameterArray();

                                if (argsType.size() != params.length) {
                                    return false;
                                }

                                for (int i = 0; i < argsType.size(); i++) {
                                    if (!argsType.get(i).isCompartible(params[i])) {
                                        return false;
                                    }
                                }

                                try {
                                    Method me = e.getDeclaringClass().getMethod(e.getMethodName(), params);

                                    return (me.getModifiers() & Modifier.PUBLIC) != 0;
                                } catch (NoSuchMethodException e1) {
                                    return false;
                                }
                            }).findFirst().map(e -> e.getMethodName() + Arrays.toString(args)))
                    .orElse("UNKNOWN");

            log.debug("Invoked: {}", method);
        }
    }

    public boolean isClosed() {
        return !active.get();
    }

    @Override
    public void close() throws SQLException {
        if (active.compareAndSet(false, true)) {
            log.debug("{} is successfully closed", this);
        } else {
            throw new SQLException("Cannot close " + this + ". It has been already closed.");
        }
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        assertOpen();
        throw new SQLException("Cannot unwrap");
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        assertOpen();
        log.debug("Invoked: ResultSet.isWrapperFor(Class<?>)");
        return false;
    }

    protected void assertOpen() throws SQLException {
        if (!active.get()) {
            throw new SQLException(this + " has been already closed.");
        }
    }

    private static final class ClassWrapper {
        private final Object value;

        ClassWrapper(Object value) {
            this.value = value;
        }

        boolean isCompartible(Class<?> type) {
            return value == null || value.getClass() == type || type.isInstance(value);
        }
    }
}
