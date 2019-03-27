package com.axon.util.tuples;

import org.junit.Test;

import static org.junit.Assert.*;

public final class SingleTest {
    @Test
    public void getItem_whenAnInstanceIsCreatedThenThatItemShouldBeReturned() {
        final Object item = new Object();
        final Single<Object> classUnderTest = new Single<>(item);

        assertEquals(item, classUnderTest.getItem());
    }

    @Test
    public void getSize_whenTheMethodIsCalledThenOneShouldBeReturned() {
        final Single<Object> classUnderTest = new Single<>(new Object());

        assertEquals(1, classUnderTest.getSize());
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithDifferentObjectsThenFalseShouldBeReturned() {
        final Single<Object> classUnderTestOne = new Single<>(new Object());
        final Single<Object> classUnderTestTwo = new Single<>(new Object());

        assertFalse(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithTheSameObjectThenTrueShouldBeReturned() {
        final Object item = new Object();
        final Single<Object> classUnderTestOne = new Single<>(item);
        final Single<Object> classUnderTestTwo = new Single<>(item);

        assertTrue(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithDifferentObjectsThenDifferentHashesShouldBeReturned() {
        final Single<Object> classUnderTestOne = new Single<>(new Object());
        final Single<Object> classUnderTestTwo = new Single<>(new Object());

        assertNotEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithTheSameObjectThenTheSameHashesShouldBeReturned() {
        final Object item = new Object();
        final Single<Object> classUnderTestOne = new Single<>(item);
        final Single<Object> classUnderTestTwo = new Single<>(item);

        assertEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }
}