package com.axon.util.tuples;

import java.util.Objects;

public final class Triplet<A, B, C> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;

    public Triplet(final A itemOne, final B itemTwo, final C itemThree) {
        super(itemOne, itemTwo, itemThree);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;
        return Objects.equals(itemOne, triplet.itemOne) &&
                Objects.equals(itemTwo, triplet.itemTwo) &&
                Objects.equals(itemThree, triplet.itemThree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree);
    }

    public A getItemOne() {
        return itemOne;
    }

    public B getItemTwo() {
        return itemTwo;
    }

    public C getItemThree() {
        return itemThree;
    }
}