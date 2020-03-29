package com.shasu19p.grp5;

/**
 * Given an array of size M+N in which first M numbers are sorted in
 * non-decreasing order and last N slots are empty. Also given an another array
 * of size N which is sorted in nondecreasing order. Write an efficient function
 * to merge these two arrays without using any extra space so that the array of
 * M+N size is sorted. 
 * Function Prototype: void merge(int[ ] a1, int[ ] a2, int m, int n) // array a1 is of size m+n
 * 
 */
public class MergeSortedArray {

	// consider a1={1,3,4,5} and a2={2,5,6,7}
	// result must be {1,2,2,3,4,5,5,6,7}
	public static void merge1(int[ ] a1, int[ ] a2, int m, int n) {
		
		int[] newArr = new int[m+n];
		
		int minIterate = Math.min(m, n);
		
		int j = 0;
		for (int i = 0; i < minIterate; i++) {

			if(a1[i] > a2[j]) {
				int tmp = a1[i];
				a1[i]=a2[j];
				a2[j]=tmp;
			} else {
				
			}
		}
	}
	
	public static void main(String[] args) {

	}
}
