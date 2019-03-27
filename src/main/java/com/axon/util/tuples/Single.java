package com.axon.util.tuples;

import java.util.Objects;

public final class Single<A> extends AbstractTuple {
    private final A item;

    public Single(final A item) {
        super(item);
        this.item = item;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Single<?> pair = (Single<?>) o;
        return Objects.equals(item, pair.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }

    public A getItem() {
        return item;
    }
}