/*
3. Write a program to check if elements of an array are same or not it read from front or back.
*/

package com.array;

public class ElementSame {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 50, 22, 70, 30, 70, 22, 50};
		int lastIndex = arr.length - 1;
		
		for (int i = 0, j = lastIndex; i < j; i++, j--) {
			if (arr[i] != arr[j]) {
				System.out.println("Not same");
				return;
			}
		}

		System.out.println("Same");
		
	}

}