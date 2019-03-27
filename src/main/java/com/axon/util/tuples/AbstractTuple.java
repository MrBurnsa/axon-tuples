package com.axon.util.tuples;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

abstract class AbstractTuple implements Iterable<Object>, Serializable, Tuple {
    private static final long serialVersionUID = 3429627828803113094L;

    private final List<Object> items;

    protected AbstractTuple(final Object ... items) {
        this.items = Arrays.asList(items);
    }

    @Override
    public String toString() {
        return items.toString();
    }

    @Override
    public Iterator<Object> iterator() {
        return items.iterator();
    }

    @Override
    public void forEach(final Consumer<? super Object> action) {
        items.forEach(action);
    }

    @Override
    public Spliterator<Object> spliterator() {
        return items.spliterator();
    }

    @Override
    public final int getSize() {
        return items.size();
    }
}