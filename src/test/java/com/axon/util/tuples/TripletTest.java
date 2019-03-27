package com.axon.util.tuples;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public final class TripletTest {
    @Test
    public void getItemOne_whenMultipleObjectsAreProvidedThenTheFirstOneShouldBeReturned() {
        final Object item = new Object();
        final Triplet<Object, Object, Object> classUnderTest = new Triplet<>(item, new Object(), new Object());

        assertEquals(item, classUnderTest.getItemOne());
    }

    @Test
    public void getItemTwo_whenMultipleObjectsAreProvidedThenTheSecondOneShouldBeReturned() {
        final Object item = new Object();
        final Triplet<Object, Object, Object> classUnderTest = new Triplet<>(new Object(), item, new Object());

        assertEquals(item, classUnderTest.getItemTwo());
    }

    @Test
    public void getItemThree_whenMultipleObjectsAreProvidedThenTheThirdOneShouldBeReturned() {
        final Object item = new Object();
        final Triplet<Object, Object, Object> classUnderTest = new Triplet<>(new Object(), new Object(), item);

        assertEquals(item, classUnderTest.getItemThree());
    }

    @Test
    public void getSize_whenTheMethodIsCalledThenOneShouldBeReturned() {
        final Triplet<Object, Object, Object> classUnderTest = new Triplet<>(new Object(), new Object(), new Object());

        assertEquals(3, classUnderTest.getSize());
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithDifferentObjectsThenFalseShouldBeReturned() {
        final Triplet<Object, Object, Object> classUnderTestOne = new Triplet<>(new Object(), new Object(), new Object());
        final Triplet<Object, Object, Object> classUnderTestTwo = new Triplet<>(new Object(), new Object(), new Object());

        assertFalse(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void equals_whenTwoInstancesAreCreatedWithOneEqualAndMultipleDifferentObjectsThenFalseShouldBeReturned() {
        final Object itemOne = new Object();

        final Triplet<Object, Object, Object> classUnderTestOne = new Triplet<>(itemOne, new Object(), new Object());
        final Triplet<Object, Object, Object> classUnderTestTwo = new Triplet<>(itemOne, new Object(), new Object());

        assertFalse(classUnderTestOne.equals(classUnderTestTwo));
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithDifferentObjectsThenDifferentHashesShouldBeReturned() {
        final Triplet<Object, Object, Object> classUnderTestOne = new Triplet<>(new Object(), new Object(), new Object());
        final Triplet<Object, Object, Object> classUnderTestTwo = new Triplet<>(new Object(), new Object(), new Object());

        assertNotEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }

    @Test
    public void hashCode_whenTwoInstancesAreCreatedWithTheSameObjectThenTheSameHashesShouldBeReturned() {
        final Object itemOne = new Object();
        final Object itemTwo = new Object();
        final Object itemThree = new Object();

        final Triplet<Object, Object, Object> classUnderTestOne = new Triplet<>(itemOne, itemTwo, itemThree);
        final Triplet<Object, Object, Object> classUnderTestTwo = new Triplet<>(itemOne, itemTwo, itemThree);

        assertEquals(classUnderTestOne.hashCode(), classUnderTestTwo.hashCode());
    }
}