package javaBasics;

public class EmployeeDetails {
	
	String Name;
	int EmployeeID;
	String Designation;
	double Salary;
	
	
	public EmployeeDetails(String Name) {
		this.Name = Name;
	}
	
	//Assign the employee id to the variable EmployeeID
	public void EmployeeID(int empID) {
		EmployeeID = empID;
	}
	
	//Assign the designation to the variable Designation
	public void Designation(String Design) {
		Designation = Design;
	}
	
	public void Salary(Double Sal) {
		Salary = Sal;
	}
	public void printEmployee()
	{
	 System.out.println("Name :" + Name);
	 System.out.println("EmployeeID :" + EmployeeID);
	 System.out.println("Designation :" + Designation);
	 System.out.println("Salary is: " + Salary);
	}

}
