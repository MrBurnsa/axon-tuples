package com.axon.util.tuples;

import java.util.Objects;

public final class Decuple<A, B, C, D, E, F, G, H, I, J> extends AbstractTuple {
    private final A itemOne;
    private final B itemTwo;
    private final C itemThree;
    private final D itemFour;
    private final E itemFive;
    private final F itemSix;
    private final G itemSeven;
    private final H itemEight;
    private final I itemNine;
    private final J itemTen;

    public Decuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                   final F itemSix, final G itemSeven, final H itemEight, final I itemNine, final J itemTen) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen);
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
        this.itemThree = itemThree;
        this.itemFour = itemFour;
        this.itemFive = itemFive;
        this.itemSix = itemSix;
        this.itemSeven = itemSeven;
        this.itemEight = itemEight;
        this.itemNine = itemNine;
        this.itemTen = itemTen;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Decuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> decuple = (Decuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, decuple.itemOne) &&
                Objects.equals(itemTwo, decuple.itemTwo) &&
                Objects.equals(itemThree, decuple.itemThree) &&
                Objects.equals(itemFour, decuple.itemFour) &&
                Objects.equals(itemFive, decuple.itemFive) &&
                Objects.equals(itemSix, decuple.itemSix) &&
                Objects.equals(itemSeven, decuple.itemSeven) &&
                Objects.equals(itemEight, decuple.itemEight) &&
                Objects.equals(itemNine, decuple.itemNine) &&
                Objects.equals(itemTen, decuple.itemTen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen);
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

    public J getItemTen() {
        return itemTen;
    }
}