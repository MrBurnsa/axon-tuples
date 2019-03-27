package com.axon.util.tuples;

import java.util.Objects;

public final class Nonuple<A, B, C, D, E, F, G, H, I> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;
    private final F itemSix;
    private final G itemSeven;
    private final H itemEight;
    private final I itemNine;

    public Nonuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                   final F itemSix, final G itemSeven, final H itemEight, final I itemNine) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
        this.itemSix = itemSix;
        this.itemSeven = itemSeven;
        this.itemEight = itemEight;
        this.itemNine = itemNine;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Nonuple<?, ?, ?, ?, ?, ?, ?, ?, ?> nonuple = (Nonuple<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, nonuple.itemOne) &&
                Objects.equals(itemTwo, nonuple.itemTwo) &&
                Objects.equals(itemThree, nonuple.itemThree) &&
                Objects.equals(itemFour, nonuple.itemFour) &&
                Objects.equals(itemFive, nonuple.itemFive) &&
                Objects.equals(itemSix, nonuple.itemSix) &&
                Objects.equals(itemSeven, nonuple.itemSeven) &&
                Objects.equals(itemEight, nonuple.itemEight) &&
                Objects.equals(itemNine, nonuple.itemNine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine);
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

    public I getItemNine() {
        return itemNine;
    }
}