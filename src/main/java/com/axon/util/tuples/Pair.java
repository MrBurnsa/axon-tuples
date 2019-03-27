package com.axon.util.tuples;

import java.util.Objects;

public final class Pair<A, B> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;

    public Pair(final A itemOne, final B itemTwo) {
        super(itemOne, itemTwo);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(itemOne, pair.itemOne) &&
                Objects.equals(itemTwo, pair.itemTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo);
    }

    public A getItemOne() {
        return itemOne;
    }

    public B getItemTwo() {
        return itemTwo;
    }
}