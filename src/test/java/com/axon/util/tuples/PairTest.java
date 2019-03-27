package com.axon.util.tuples;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public final class PairTest {
    @Test
    public void getItemOne_whenMultipleObjectsAreProvidedThenTheFirstOneShouldBeReturned() {
        final Object item = new Object();
        final Pair<Object, Object> classUnderTest = new Pair<>(item, new Object());

        assertEquals(item, classUnderTest.getItemOne());
    }

    @Test
    public void getItemTwo_whenMultipleObjectsAreProvidedThenTheSecondOneShouldBeReturned() {
        final Object item = new Object();
        final Pair<Object, Object> classUnderTest = new Pair<>(new Object(), item);

        assertEquals(item, classUnderTest.getItemTwo());
    }

    @Test
    public void getSize_whenTheMethodIsCalledThenOneShouldBeReturned() {
        final Pair<Object, Object> classUnderTest = new Pair<>(new Object(), new Object());

        assertEquals(2, classUnderTest.getSize());
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithDifferentObjectsThenFalseShouldBeReturned() {
        final Pair<Object, Object> classUnderTestOne = new Pair<>(new Object(), new Object());
        final Pair<Object, Object> classUnderTestTwo = new Pair<>(new Object(), new Object());

        assertFalse(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithOneEqualAndOneDifferentObjectThenFalseShouldBeReturned() {
        final Object itemOne = new Object();

        final Pair<Object, Object> classUnderTestOne = new Pair<>(itemOne, new Object());
        final Pair<Object, Object> classUnderTestTwo = new Pair<>(itemOne, new Object());

        assertFalse(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithDifferentObjectsThenDifferentHashesShouldBeReturned() {
        final Pair<Object, Object> classUnderTestOne = new Pair<>(new Object(), new Object());
        final Pair<Object, Object> classUnderTestTwo = new Pair<>(new Object(), new Object());

        assertNotEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithTheSameObjectThenTheSameHashesShouldBeReturned() {
        final Object itemOne = new Object();
        final Object itemTwo = new Object();

        final Pair<Object, Object> classUnderTestOne = new Pair<>(itemOne, itemTwo);
        final Pair<Object, Object> classUnderTestTwo = new Pair<>(itemOne, itemTwo);

        assertEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }
}