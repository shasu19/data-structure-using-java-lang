package com.learning.dsalgo.assignment.group2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

	public static void main(String[] args) {

		int[] result = findErrorNums1(new int[] { 1, 2, 1, 2 });
		System.out.println(Arrays.toString(result));
	}

	// SC: O(n) if othing match, we need to store all elements in set
	// TC: O(n) n times iterate
	public static int[] findErrorNums1(int[] nums) {

		Set<Integer> integers = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (integers.contains(nums[i])) {
				return new int[] { nums[i], nums[i] + 1 };
			} else {
				integers.add(nums[i]);
			}
		}

		return null;
	}

	// TC: O(n^2) SC: O(1) Constant
	public static int[] findErrorNums2(int[] nums) {
		int dup = -1, missing = -1;
		for (int i = 1; i <= nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == i)
					count++;
			}
			if (count == 2)
				dup = i;
			else if (count == 0)
				missing = i;
		}
		return new int[] { dup, missing };
	}
}
