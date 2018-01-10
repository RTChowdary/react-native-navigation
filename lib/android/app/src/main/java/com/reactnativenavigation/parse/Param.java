package com.reactnativenavigation.parse;

public abstract class Param<T> {
    protected T value;

    public Param(T value) {
        this.value = value;
    }

    public T get() {
        if (hasValue()) {
            return value;
        }
        throw new RuntimeException("Tried to get null value!");
    }

    public boolean hasValue() {
        return value != null;
    }
}