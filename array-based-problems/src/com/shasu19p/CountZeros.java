package com.shasu19p;

import java.util.Arrays;
import java.util.Random;

// Problem Statement: Find number of zeros from given input array
// Calculate time and space complexity
// Example:
// array[0, 0, 0, 0, 4, 6, 7]
//Conditions: 
// 1. Zeroes will always be in left start.
// 2.There can no zero or all zeroes in array
public class CountZeros {

	public static void main(String[] args) {

		int[] input = createTestCase1(80);
		System.out.println(Arrays.toString(input));

		// solution using brute force search
		System.out.println(count1(input));

		// taking mid and comparing
		System.out.println(count2(input));

		input = createTestCase2(80);
		System.out.println(Arrays.toString(input));
		System.out.println(count1(input));
		System.out.println(count2(input));

		input = createTestCase3(80);
		System.out.println(Arrays.toString(input));
		System.out.println(count1(input));
		System.out.println(count2(input));
	}

	// Using brute force pattern for counting zeros
	// time complexity O(n)=> TC:O(n)
	// space complexity=> SC:O(1)
	public static int count1(int[] arr) {

		int i;
		for (i = 0; i < arr.length; i++)
			if (arr[i] != 0)
				return i;

		if (arr[i - 1] == 0) {
			return i;
		}

		return 0;
	}

	// Taking mid and compare approach.
	// If element at mid is zero,
	// then compare next half only.
	// This will reduce half array in each compare.
	// Time complexity : O(log(base2).n)
	// Description: This will reduce half array in each compare.
	// Space complexity : O(1)
	// No extra space except few variables for keeping mid values.
	public static int count2(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (right - left > 1) {
			int mid = (left + right) / 2;
			if (arr[mid] == 0) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		if (arr[right] == 0) {
			return right + 1;
		} else if (arr[left] == 0) {
			return left + 1;
		}

		return 0;
	}

	// This is used to create some random array
	private static int[] createTestCase1(int size) {
		int[] arr = new int[size];
		Random random = new Random();

		int r = random.nextInt(size) + 1;
		for (int i = 0; i < r; i++) {
			arr[i] = 0;
		}

		if (r < size) {
			for (; r < size; r++) {
				arr[r] = random.nextInt(size) + 1;
			}
		}

		return arr;
	}

	public static int[] createTestCase2(int size) {
		return new int[size];
	}

	public static int[] createTestCase3(int size) {

		int[] arr = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(size) + 1;
		}

		return arr;
	}
}