package com.learning.dsalgo.assignment;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {

	// TC: nlogn + n
	// TC: nlogn SC:O(1)
	public boolean containsDuplicate(int[] nums) {

		// n.logn
		Arrays.sort(nums);

		// n times loop
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}

		return false;

	}

	public static void main(String[] args) {

	}
}