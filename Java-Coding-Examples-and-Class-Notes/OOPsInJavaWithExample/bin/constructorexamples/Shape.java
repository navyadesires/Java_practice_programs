package inheritenceandpolymorphism;

import java.util.Scanner;

public class Shape {
	String color;
	String filled;
	
	Scanner sc = new Scanner(System.in);
	public void shape(){
		System.out.println("please enter shape details..");
		System.out.println("Enter color");
		color = sc.next();
		System.out.println("Enter filled");
		filled = sc.next();
		
	}
	public void viewShapDetails(){

        System.out.println("employee Id =" + color);

		System.out.println("Enter Employee name=" + filled);

		}
}
