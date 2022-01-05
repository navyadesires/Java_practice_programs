package com.basicpractice;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int r, sum = 0;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		n = sc.nextInt();
		int temp = n;
		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("palidrome Number");
		} else {
			System.out.println("not palidrome");
		}

	}

