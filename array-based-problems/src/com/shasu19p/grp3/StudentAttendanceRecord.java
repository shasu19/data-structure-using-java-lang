package com.shasu19p.grp3;

/*
 * https://leetcode.com/problems/student-attendance-record-i/description/
 * You are given a string representing an attendance record for a student. 
 * The record only contains the following three characters:
	'A' : Absent.
	'L' : Late.
	'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) 
or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
*/
public class StudentAttendanceRecord {

	// TC: O(n) SC:O(1)
	public static boolean checkRecord1(String s) {

		char[] record = s.toCharArray();
		int absentCount = 0;
		int contineousLeaveCount = 0;

		for (int i = 0; i < record.length; i++) {
			if (record[i] == 'A' && ++absentCount > 1) { // absent record found and more than 1 absent record
				return false;
			}

			if (record[i] == 'L' && ++contineousLeaveCount > 2) {
				return false;
			} else {
				contineousLeaveCount = 0;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(checkRecord1("PPALLP"));
		System.out.println(checkRecord1("PPAALLP"));
		System.out.println(checkRecord1("PPALLLP"));
		System.out.println(checkRecord1("PPPPP"));
		System.out.println(checkRecord1("ALLA"));
	}
}
