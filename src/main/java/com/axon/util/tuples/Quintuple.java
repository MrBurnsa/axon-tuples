package com.axon.util.tuples;

import java.util.Objects;
import java.util.Set;

public final class Quintuple<A, B, C, D, E> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;

    public Quintuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Quintuple<?, ?, ?, ?, ?> quintuple = (Quintuple<?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, quintuple.itemOne) &&
                Objects.equals(itemTwo, quintuple.itemTwo) &&
                Objects.equals(itemThree, quintuple.itemThree) &&
                Objects.equals(itemFour, quintuple.itemFour) &&
                Objects.equals(itemFive, quintuple.itemFive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive);
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
}