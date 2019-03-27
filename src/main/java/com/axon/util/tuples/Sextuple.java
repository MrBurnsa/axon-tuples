package com.axon.util.tuples;

import java.util.Objects;

public final class Sextuple<A, B, C, D, E, F> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;
    private final F itemSix;

    public Sextuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                    final F itemSix) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
        this.itemSix = itemSix;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Sextuple<?, ?, ?, ?, ?, ?> sextuple = (Sextuple<?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, sextuple.itemOne) &&
                Objects.equals(itemTwo, sextuple.itemTwo) &&
                Objects.equals(itemThree, sextuple.itemThree) &&
                Objects.equals(itemFour, sextuple.itemFour) &&
                Objects.equals(itemFive, sextuple.itemFive) &&
                Objects.equals(itemSix, sextuple.itemSix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix);
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

    public E getItemFive() {
        return itemFive;
    }

    public F getItemSix() {
        return itemSix;
    }
}