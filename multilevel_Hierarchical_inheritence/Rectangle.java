package inheritenceandpolymorphism;

public class Rectangle extends Circle {
	
double width;
double length;
public void rectangle() {
	   System.out.println("Enter the Rectangle details");
	      System.out.println("Enter  Rectangle width");
			width = sc.nextDouble();
			System.out.println("Enter Rectangle length");
			length = sc.nextDouble();

}
	public void viewCircleDetails(){

        System.out.println("radius =" + width);
        System.out.println("radius =" + length);

		

		}
}