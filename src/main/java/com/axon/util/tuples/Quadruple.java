package com.axon.util.tuples;

import java.util.Objects;

public final class Quadruple<A, B, C, D> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;

    public Quadruple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour) {
        super(itemOne, itemTwo, itemThree, itemFour);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Quadruple<?, ?, ?, ?> quadruple = (Quadruple<?, ?, ?, ?>) o;
        return Objects.equals(itemOne, quadruple.itemOne) &&
                Objects.equals(itemTwo, quadruple.itemTwo) &&
                Objects.equals(itemThree, quadruple.itemThree) &&
                Objects.equals(itemFour, quadruple.itemFour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour);
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

    public D getItemFour() {
        return itemFour;
    }
}