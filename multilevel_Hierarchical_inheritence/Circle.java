package inheritenceandpolymorphism;

public class Circle extends Shape{
	double radius;
	
	public void circle() {
	      System.out.println("Enter the Circle details");
	      System.out.println("Enter circle radius");
			radius = sc.nextDouble();

	   }
	public void viewCircleDetails(){

        System.out.println("radius =" + radius);

		

		}
}