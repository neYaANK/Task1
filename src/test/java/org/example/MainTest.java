package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void findClosestToZero() {
        int[] arr1 = {-3,1,2,3,4,5};
        int[] arr2 = {1,-3,3,4,5};
        int[] arr3 = {3,-3,3,4,5};
        int[] arr4 = {4,3,3,3,-2};
        int[] arr5 = {};
        Assert.assertEquals(1, Main.findClosestToZero(arr1));
        Assert.assertEquals(1, Main.findClosestToZero(arr2));
        Assert.assertEquals(3, Main.findClosestToZero(arr3));
        Assert.assertEquals(-2, Main.findClosestToZero(arr4));
        Assert.assertEquals(0, Main.findClosestToZero(arr5));
    }
}