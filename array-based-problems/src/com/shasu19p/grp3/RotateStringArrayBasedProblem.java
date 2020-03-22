package com.shasu19p.grp3;

import java.util.Arrays;

/*
Problem Detailed URL: https://www.lintcode.com/problem/rotate-string/description
====================================================================================
Input: str="abcdefg", offset = 3
Output: str = "efgabcd"	
Explanation: Note that it is rotated in place, that is, after str is rotated, it becomes "efgabcd".
*/

public class RotateStringArrayBasedProblem {

	/*
	 * Adhoc solution Take offset minus from length. It will give how many
	 * characters from start, we can have in some temporary variable. And in next
	 * loop, will put in correct position from temporary character array.
	 * 
	 * TC: n times iterate + n times iterate : O(n) SC: n times space for new
	 * character array: O(n)
	 */
	public static void rotateString1(char[] str, int offset) {
		if (offset != 0) {
			int toMove = str.length - offset;

			char[] temp = new char[toMove];
			int start = 0;
			for (int i = toMove; i < str.length; i++) {
				temp[start] = str[start];
				str[start++] = str[i];
			}
			temp[start] = str[start];
			start = 0;
			for (int i = toMove - 1; i < str.length; i++) {
				str[i] = temp[start++];
			}
		}
	}

	public static void rotateString2(char[] str, int offset) {
		if (offset != 0) {

			int diff = str.length - offset; // offset will never be more than length
			if (diff == offset) {
				for (int i = 0; i < diff; i++) {
					char temp = str[i + diff];
					str[i + diff] = str[i];
					str[i] = temp;
				}
			} else {
				int k = 0;
				for (int i = diff; i < str.length; i++) {
					char temp = str[i];

					int j = i;
					while (j > k) {
						str[j] = str[j - 1];
						j--;
					}
					str[k++] = temp;
				}
			}

			System.out.println(Arrays.toString(str));
		}
	}

	public static void main(String[] args) {

		rotateString1("abcdefg".toCharArray(), 3);
		rotateString2("abcdef".toCharArray(), 3);
	}
}
