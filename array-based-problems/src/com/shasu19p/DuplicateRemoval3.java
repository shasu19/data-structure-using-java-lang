package com.learning.dsalgo.assignment;

// https://leetcode.com/problems/remove-element/description/

public class DuplicateRemoval3 {

	public static void main(String[] args) {

		int length = removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 }, 1);
		System.out.println(length);
	}

	// TC: O(n) SC: O(1)
	public static int removeDuplicates(int[] nums, int value) {

		int slowIndex = -1;

		for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
			if (nums[fastIndex] != value) {
				nums[++slowIndex] = nums[fastIndex];
			}
		}

		return slowIndex + 1;
	}
}