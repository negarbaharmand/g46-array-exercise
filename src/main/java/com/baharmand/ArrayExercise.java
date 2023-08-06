package com.baharmand;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        System.out.println("Array Exercises");
        ex1();
        indexOf();
        sortArray();
        copyArray();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
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

    public static void copyArray() {
        System.out.println("Exercise 4:");
        int[] firstArray = {1, 15, 20};
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);
        System.out.println("Elements from first array: ");
        for (int num : firstArray) {
            System.out.println(num + " ");
        }

        System.out.println("Elements from second array: ");
        for (int num : secondArray) {
            System.out.println(num + " ");
        }
    }

    public static void ex5() {
        System.out.println("Exercise 5:");
        String[][] capitalCities = new String[2][2];
        capitalCities[0][0] = "France";
        capitalCities[0][1] = "Paris";
        capitalCities[1][0] = "Sweden";
        capitalCities[1][1] = "Stockholm";
        for (int i = 0; i < capitalCities.length; i++) {
            for (int j = 0; j < capitalCities[i].length; j++) {
                System.out.print(capitalCities[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void ex6() {
        System.out.println("Exercise 6:");
        int[] numbers = {43, 5, 23, 17, 2, 14};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average is: " + average);
    }

    public static void ex7() {
        System.out.println("Exercise 7:");
        int[] numbers = {1, 2, 4, 7, 9, 12, 15, 18, 20, 23};
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.print("\nOdd Array: ");
        for( int num : numbers) {
            if (num % 2 != 0){
                System.out.println(num + " ");
            }
        }
    }
    public static void ex8() {
        System.out.println("Exercise 8:");
        int[] arr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int[] arrWithoutDuplicates = removeDuplicates(arr);
        System.out.print("\nArray without duplicate values: ");
        for (int num : arrWithoutDuplicates) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        // Count the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array containing the unique elements
        int[] resultArray = new int[uniqueCount];
        resultArray[0] = arr[0];

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultArray[index] = arr[i];
                index++;
            }
        }

        return resultArray;
    }

    public static void ex9() {
        System.out.println("Exercise 9:");
        int[] originalArray = {2, 32, 62, 5, 0, 9};
        int[] expandedArray = addElements(originalArray, 98, 75, 8);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Expanded Array: " + Arrays.toString(expandedArray));
    }
        public static int[] addElements ( int[] arr, int...elements){
            int[] newArray = Arrays.copyOf(arr, arr.length + elements.length);

            for (int i = 0; i < elements.length; i++) {
                newArray[arr.length + i] = elements[i];
            }

            return newArray;
        }
         public static void ex10() {
             System.out.println("Exercise 10:");
             int[][] multiplicationTable = new int[10][10];

             for (int i = 0; i < 10; i++) {
                 for (int j = 0; j < 10; j++) {
                     multiplicationTable[i][j] = (i + 1) * (j + 1);
                 }
             }

             for (int i = 0; i < 10; i++) {
                 for (int j = 0; j < 10; j++) {
                     System.out.print(multiplicationTable[i][j] + "\t");
                 }
                 System.out.println();
             }
         }
         }



