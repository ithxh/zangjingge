package com.hxh.search;

public class LinearSearch {

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return  -1;
    }
}
