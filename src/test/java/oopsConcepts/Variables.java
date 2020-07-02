package oopsConcepts;

public class Variables {
    int age = 20;  //Global variable or Class variable
    String name = "Niranjan";
    static String company = "Maveric";
	public static void main(String[] args) {
		int i = 10;  //Local Variable
		System.out.println("This is a local variable: "+i);
		Variables var = new Variables();
		System.out.println("This is a global variable: "+var.age);
		System.out.println("This is a global variable: "+var.name);
		System.out.println("This is a static variable: "+ company);
		
	}
	public void Employee() {
		int i = 8; // local variable
		int age = 25;
		
	}

}
