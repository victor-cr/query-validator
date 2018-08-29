package com.codegans.sql.core;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public abstract class StatementValidatorWrapper extends FakeAutoCloseable implements AutoCloseable {
    private static final AtomicLong COUNTER = new AtomicLong();

    private final long id;
    protected final StatementValidator validator;

    public StatementValidatorWrapper(StatementValidator validator) {
        this.id = COUNTER.incrementAndGet();
        this.validator = validator;

        this.log.debug("Created: {}", this);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof StatementValidatorWrapper && equals((StatementValidatorWrapper) o);
    }

    public boolean equals(StatementValidatorWrapper that) {
        return that != null && that.id == this.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "#" + id;
    }
}
