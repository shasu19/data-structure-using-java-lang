package com.learning.dsalgo.assignment.group2;

import java.util.Arrays;

// Find smallest positive missing integer
public class SmallestPositiveInteger {

	public static void main(String[] args) {

		System.out.println(firstMissingPositive(new int[] { 1, 2, 0, 4 }));
	}

	public static int firstMissingPositive(int[] nums) {

		Arrays.sort(nums);

		// 2 4 6 ....
		int i;
		for (i = 0; i < nums.length - 1; i++) {

			if (nums[i] < 0) {
				continue;
			}

			if (nums[i] + 1 < nums[i + 1]) {
				return nums[i] + 1;
			}
		}

		return nums[i] + 1;
	}
}
