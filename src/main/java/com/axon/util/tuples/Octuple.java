package com.axon.util.tuples;

import java.util.Objects;

public final class Octuple<A, B, C, D, E, F, G, H> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;
    private final F itemSix;
    private final G itemSeven;
    private final H itemEight;

    public Octuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                   final F itemSix, final G itemSeven, final H itemEight) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
        this.itemSix = itemSix;
        this.itemSeven = itemSeven;
        this.itemEight = itemEight;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Octuple<?, ?, ?, ?, ?, ?, ?, ?> octuple = (Octuple<?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, octuple.itemOne) &&
                Objects.equals(itemTwo, octuple.itemTwo) &&
                Objects.equals(itemThree, octuple.itemThree) &&
                Objects.equals(itemFour, octuple.itemFour) &&
                Objects.equals(itemFive, octuple.itemFive) &&
                Objects.equals(itemSix, octuple.itemSix) &&
                Objects.equals(itemSeven, octuple.itemSeven) &&
                Objects.equals(itemEight, octuple.itemEight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight);
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

    public H getItemEight() {
        return itemEight;
    }
}