package com.shasu19p.grp3;

import java.util.Arrays;

public class CheckSubarraySum {

	// TC:O(n^3) SC: O(1)
	public static boolean checkSubarraySum(int[] nums, int k) {

		System.out.println(Arrays.toString(nums));

		for (int i = 2; i <= nums.length; i++) {
			if (sum(nums, i, k)) {
				return true;
			}
		}

		return false;
	}

	private static boolean sum(int[] nums, int end, int k) {

		int sum = 0;
		for (int i = 0; i < nums.length - end; i++) {
			for (int j = i; j < end + i; j++) {
				sum += nums[j];
			}

			System.out.println(sum);
			if (sum == k || sum % k == 0) {
				return true;
			} else {
				sum = 0;
			}
		}

		return false;

	}

	public static void main(String[] args) {

		int[] nums = { 23, 2, 4, 6, 7 };
		boolean value = checkSubarraySum(nums, 6);
		System.out.println(value);
	}
}
