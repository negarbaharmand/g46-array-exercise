package com.baharmand;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        System.out.println("Array Exercises");
        ex1();
        indexOf();
        sortArray();
    }

    public static void ex1() {
        System.out.println("Exercise 1:");
        int[] numbers = new int[]{11, 23, 39, 47};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
    public static void indexOf() {
        System.out.println("Exercise 2:");
        int[] numbers = {11, 23, 5, 39, 8};
        //First we need to sort the array in order to use binary search method
        Arrays.sort(numbers);

        int target = 39;
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Index position of number " + target + " is: " + index + ".");
        } else System.out.println("Index position of number " + target + " is: " + -1 + ".");
    }
    public static void sortArray() {
        System.out.println("Exercise 3:");
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("Sorted string array: " + Arrays.toString(cities));
    }
    }

