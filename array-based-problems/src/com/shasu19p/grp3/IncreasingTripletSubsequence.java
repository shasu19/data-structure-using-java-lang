package com.shasu19p.grp3;

/**
 * URL:
 * https://leetcode.com/problems/increasing-triplet-subsequence/description/
 * ==========================================================================
 * 
 */
public class IncreasingTripletSubsequence {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6 };
		System.out.println(increasingTriplet(nums));
	}

	// TC: O(n) SC:O(1)
	public static boolean increasingTriplet(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] < nums[i + 1]) && nums[i + 1] < nums[i + 2]) {
				return true;
			}
		}

		return false;
	}
}