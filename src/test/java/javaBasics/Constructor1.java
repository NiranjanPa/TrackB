package javaBasics;

public class Constructor1 {
    int ID;
    String Name;
    double salary;
    static String company = "Maveric"; // Static variable created as the company value will not change(Common property) or else all the instance variables will get memory each time when the object is created
    // Static variables will get memory only once in the class area at the time of class loading
    
	public Constructor1(int i, String n) { //Parameterized constructor is created
		ID = i;
		Name = n;
	}
	
	public Constructor1(int i, String n, double s) {  //Constructor Overloading
		ID = i;
		Name = n;
		salary = s;
	}
	
	public void display() {        //Display method created to display the employee information
		System.out.println(ID + " " + Name + " " + salary + " " + company );
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 E1 = new Constructor1(100, "Niranjan"); //Object Created to call the Constructor
		E1.display();
		Constructor1 E2 = new Constructor1(101, "Balaji", 30000.00);
		E2.display();
    
	
	}

}
