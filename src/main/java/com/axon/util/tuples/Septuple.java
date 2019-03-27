package com.axon.util.tuples;

import java.util.Objects;

public final class Septuple<A, B, C, D, E, F, G> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;
    private final F itemSix;
    private final G itemSeven;

    public Septuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                    final F itemSix, final G itemSeven) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
        this.itemSix = itemSix;
        this.itemSeven = itemSeven;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Septuple<?, ?, ?, ?, ?, ?, ?> septuple = (Septuple<?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, septuple.itemOne) &&
                Objects.equals(itemTwo, septuple.itemTwo) &&
                Objects.equals(itemThree, septuple.itemThree) &&
                Objects.equals(itemFour, septuple.itemFour) &&
                Objects.equals(itemFive, septuple.itemFive) &&
                Objects.equals(itemSix, septuple.itemSix) &&
                Objects.equals(itemSeven, septuple.itemSeven);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven);
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

    public G getItemSeven() {
        return itemSeven;
    }
}