package com.axon.util.tuples;

import java.util.Objects;

public final class Undecuple<A, B, C, D, E, F, G, H, I, J, K> extends AbstractTuple {
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
    private final K itemEleven;

    public Undecuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                     final F itemSix, final G itemSeven, final H itemEight, final I itemNine, final J itemTen,
                     final K itemEleven) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen, itemEleven);
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
        this.itemEleven = itemEleven;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Undecuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> undecuple = (Undecuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, undecuple.itemOne) &&
                Objects.equals(itemTwo, undecuple.itemTwo) &&
                Objects.equals(itemThree, undecuple.itemThree) &&
                Objects.equals(itemFour, undecuple.itemFour) &&
                Objects.equals(itemFive, undecuple.itemFive) &&
                Objects.equals(itemSix, undecuple.itemSix) &&
                Objects.equals(itemSeven, undecuple.itemSeven) &&
                Objects.equals(itemEight, undecuple.itemEight) &&
                Objects.equals(itemNine, undecuple.itemNine) &&
                Objects.equals(itemTen, undecuple.itemTen) &&
                Objects.equals(itemEleven, undecuple.itemEleven);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen, itemEleven);
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

    public K getItemEleven() {
        return itemEleven;
    }
}