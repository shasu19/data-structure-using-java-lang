package com.learning.dsalgo.assignment.group2;

import java.util.Arrays;

public class String1Problem {

	public static char findTheDifference(String s, String t) {

		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Arrays.sort(sArr);
		Arrays.sort(tArr);

		int i = 0;

		for (i = 0; i < s.length(); i++) {
			if (sArr[i] != tArr[i])
				return tArr[i];
		}

		if (i < t.length()) {
			return tArr[i];
		}

		return '-';
	}

	public static void main(String[] args) {
		char result = findTheDifference("abcd", "abfcde");
		System.out.println(result);
	}
}
