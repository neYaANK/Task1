package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * Finds the largest closest value to zero and returns it.
     * @param arr Array to search a value
     * @return Closest largest value
     */
    public static int findClosestToZero(int [] arr){
        if (arr.length == 0) return 0;
        int minDistance = Arrays.stream(arr).map(Math::abs).min().getAsInt();
        int[] results = Arrays.stream(arr).filter(value -> Math.abs(value) == minDistance).toArray();
        return Arrays.stream(results).max().getAsInt();
    }
}