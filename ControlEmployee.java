package inheritenceandpolymorphism;

public class ContractEmployee extends employee {

	String WorkingHours;
	 
	void CalculateSalary() {
	  System.out.println("Employee salary= " + Salary);
	}
}