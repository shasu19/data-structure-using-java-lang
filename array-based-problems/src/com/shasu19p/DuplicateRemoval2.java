package com.learning.dsalgo.assignment;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class DuplicateRemoval2 {

	public static void main(String[] args) {

		int length = removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 });
		System.out.println(length);
	}

	// TC: O(n) SC: O(1)
	public static int removeDuplicates(int[] nums) {

		int slowIndex = 0;
		int count = 0;

		for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
			if (nums[slowIndex] != nums[fastIndex]) {
				slowIndex = fastIndex - count;
				nums[++slowIndex] = nums[fastIndex];
				count = 1;
			} else {
				count++;
			}
		}

		for (int i = 0; i < slowIndex; i++) {
			System.out.print(nums[i] + " ");
		}

		return slowIndex + 1;
	}
}