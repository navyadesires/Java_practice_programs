package com.basicpractice;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args)
	{
	//scanner class declaration
	Scanner sc = new Scanner(System.in);
	//input from user
	System.out.print("Enter a number : ");
	int number = sc.nextInt();
	int fac,sum = 0;
	int n = number;
	while(n != 0)
	{
	fac = 1;
	int r = n % 10;
	//calculating factorial of r
	for(int i = r ; i >= 1 ; i--)
	fac = fac * i;
	//storing sum of factorial of all digits of the number
	sum = sum + fac;
	n=n/10;
	}
	//condition for strong number
	if(sum == number)
	System.out.println("Strong Number");
	else
	System.out.println("Not a Strong Number");

	sc.close();
	}
	}
