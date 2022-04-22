package com.cracker.leetcodes.search;

/**
 * This is Leetcode number 704: Binary Search.
 */
public class BinarySearch {

    public int search(final int[] nums, final int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
