package com.shasu19p.grp5;

/**
 * Given an array of alpha-numeric characters with the length appended to the
 * string, write an efficient function to remove the length part of it. Function
 * Prototype: void removeLength(char[ ] s) Example: Input: JamesBond00712 where,
 * 12 is length of string JamesBond007 Output: JamesBond007
 */
public class RemoveMysteryLength {

	public static void main(String[] args) {

		removeLength("JamesBond00712".toCharArray());
	}

	public static void removeLength(char[] s) {

		int length = s.length;

		String lengthStr = "";

		for (int i = 1; i < length; i++) {
			lengthStr = s[length - i] + lengthStr;

			try {
				int value = Integer.parseInt(lengthStr);
				if (value == length - i) {
					System.out.println("Value:" + value);
					break;
				}
			} catch (Exception ex) {
				System.out.println("String is wrong");
				break;
			}
		}
	}
}
