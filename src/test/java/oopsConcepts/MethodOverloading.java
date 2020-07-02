package oopsConcepts;

public class MethodOverloading {
   //method name is same with different input parameters within the same class
   //you cannot create a method inside a method
	//Duplicate methods are not allowed(same method name with same input parameters)
	//main method can  be overloaded
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(10);
		mo.sum(20, 45);
        sum(1,3,90); //to call a static method object reference is not required - direct calling
        MethodOverloading.sum(23, 34,56);//static method can be called in two ways - calling by class name and direct calling
        mo.sum("Niranjan");
	}
	public static void main(int j) {
		System.out.println("This is  a main method with one parameter");
	
	}
    public void sum() {
    	System.out.println("This is zero input parameter method ");
    }
    
    public void sum(int i) {
    	System.out.println("This is a single parameter method: "+ i);
    }
    public void sum(int i, int j) {
    	System.out.println("This is 2 input parameter method: "+ (i+j));
    }
    
    public static void sum(int i, int j, int k) {
    	System.out.println("This is a static method: "+ ((i+k)+j));
    	
    }
    public void sum(String name) {
    	System.out.println("This is string parameter method");
    }
}
