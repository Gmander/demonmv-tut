package com.example.demomvntut;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int currentIndex = 0; currentIndex < arr.length-1; currentIndex++) {
            if (arr[currentIndex] == 0) {
                for (int innerIndex = arr.length-1; innerIndex > currentIndex; innerIndex--) {
                    arr[innerIndex] = arr[innerIndex-1];
                }
                arr[currentIndex+1] = 0;
                currentIndex++;
            }
        }
    }
    public static void main(String[] args) {
        DuplicateZeros dz = new DuplicateZeros();

        int[] arrayToTest = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(arrayToTest));
        dz.duplicateZeros(arrayToTest);
        System.out.println(Arrays.toString(arrayToTest));

    }
}
