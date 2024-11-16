package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    /**
     * Checks if the method works with normal case scenario
     */
    @Test
    public void findClosestToZero_NormalCase() {
        int[] arr = {-3,1,2,3,4,5};
        Assert.assertEquals(1, Main.findClosestToZero(arr));
    }
    /**
     * Checks if the method returns correct value with negative and positive closest values
     */
    @Test
    public void findClosestToZero_NegativeOrPositive() {
        int[] arr = {3,-3,3,4,5};
        Assert.assertEquals(3, Main.findClosestToZero(arr));
    }
    /**
     * Checks if the method can return negative value
     */
    @Test
    public void findClosestToZero_OnlyNegative() {
        int[] arr = {4,3,3,3,-2};
        Assert.assertEquals(-2, Main.findClosestToZero(arr));
    }
    /**
     * Checks if the method handles empty array properly
     */
    @Test
    public void findClosestToZero_EmptyArray() {
        int[] arr = {};
        Assert.assertThrows(IllegalArgumentException.class, () -> Main.findClosestToZero(arr));
    }
}