package com.axon.util.tuples;

import java.util.Objects;

public final class Duodecuple<A, B, C, D, E, F, G, H, I, J, K, L> extends AbstractTuple {
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
    private final L itemTwelve;

    public Duodecuple(final A itemOne, final B itemTwo, final C itemThree, final D itemFour, final E itemFive,
                      final F itemSix, final G itemSeven, final H itemEight, final I itemNine, final J itemTen,
                      final K itemEleven, final L itemTwelve) {
        super(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen, itemEleven, itemTwelve);
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
        this.itemTwelve = itemTwelve;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Duodecuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Duodecuple<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(itemOne, that.itemOne) &&
                Objects.equals(itemTwo, that.itemTwo) &&
                Objects.equals(itemThree, that.itemThree) &&
                Objects.equals(itemFour, that.itemFour) &&
                Objects.equals(itemFive, that.itemFive) &&
                Objects.equals(itemSix, that.itemSix) &&
                Objects.equals(itemSeven, that.itemSeven) &&
                Objects.equals(itemEight, that.itemEight) &&
                Objects.equals(itemNine, that.itemNine) &&
                Objects.equals(itemTen, that.itemTen) &&
                Objects.equals(itemEleven, that.itemEleven) &&
                Objects.equals(itemTwelve, that.itemTwelve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix, itemSeven, itemEight, itemNine, itemTen, itemEleven, itemTwelve);
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

    public L getItemTwelve() {
        return itemTwelve;
    }
}