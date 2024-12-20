package com.example.demomvntut;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lengthOfNums1 = nums1.length;
        int nums1Pointer = 0;
        int nums2Pointer = 0;

        int[] finalArray = new int[lengthOfNums1];
        if (nums2.length > 0) {
            for (int finalArrPosition = 0; finalArrPosition < lengthOfNums1; finalArrPosition++) {
                if (nums1[nums1Pointer] <= nums2[nums2Pointer] && m != 0) {
                    finalArray[finalArrPosition] = nums1[nums1Pointer];
                    nums1Pointer++;
                    if (nums1Pointer >= m) {
                        nums1Pointer--;
                        nums1[nums1Pointer] = 99999999;
                    }
                } else {
                    finalArray[finalArrPosition] = nums2[nums2Pointer];
                    nums2Pointer++;
                    if (nums2Pointer >= n) {
                        nums2Pointer--;
                        nums2[nums2Pointer] = 999999999;
                    }
                }
            }
            System.arraycopy(finalArray, 0, nums1, 0, lengthOfNums1);
        }
    }

    public void improvedMerge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m+n-1;
        int pointer1 = m-1;
        int pointer2 = n-1;

        for (int finalArrPos = totalLength; finalArrPos >= 0; finalArrPos--) {
            if (pointer1 < 0) {
                nums1[finalArrPos] = nums2[pointer2];
                pointer2--;
            } else if (pointer2 < 0) {
                nums1[finalArrPos] = nums1[pointer1];
                pointer1--;
            } else {
                if (nums1[pointer1] >= nums2[pointer2]) {
                    nums1[finalArrPos] = nums1[pointer1];
                    pointer1--;
                } else {
                    nums1[finalArrPos] = nums2[pointer2];
                    pointer2--;
                }
            }
        }
    }
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 2, new int[]{2,5,6}, 3);
        mergeSortedArray.improvedMerge(new int[]{1,2,3,0,0,0}, 2, new int[]{2,5,6}, 3);
    }
}
