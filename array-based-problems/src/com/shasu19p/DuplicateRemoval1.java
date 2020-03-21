package com.learning.dsalgo.assignment;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class DuplicateRemoval1 {

	public static void main(String[] args) {

		int length = removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
		System.out.println(length);
	}

	// TC: O(n) SC: O(1)
	public static int removeDuplicates(int[] nums) {

		int slowIndex = 0;

		for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
			if (nums[slowIndex] != nums[fastIndex])
				nums[++slowIndex] = nums[fastIndex];
		}

		return slowIndex + 1;
	}
}