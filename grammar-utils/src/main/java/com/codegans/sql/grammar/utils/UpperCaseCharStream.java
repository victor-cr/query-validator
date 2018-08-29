package com.codegans.sql.grammar.utils;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;

public class UpperCaseCharStream implements CharStream {
    private final CharStream delegate;

    public UpperCaseCharStream(CharStream delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getText(Interval interval) {
        return delegate.getText(interval);
    }

    @Override
    public void consume() {
        delegate.consume();
    }

    @Override
    public int LA(int i) {
        return Character.toUpperCase(delegate.LA(i));
    }

    @Override
    public int mark() {
        return delegate.mark();
    }

    @Override
    public void release(int marker) {
        delegate.release(marker);
    }

    @Override
    public int index() {
        return delegate.index();
    }

    @Override
    public void seek(int index) {
        delegate.seek(index);
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public String getSourceName() {
        return delegate.getSourceName();
    }
}
