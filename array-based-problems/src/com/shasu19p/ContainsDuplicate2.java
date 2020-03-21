package com.learning.dsalgo.assignment;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate2 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

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