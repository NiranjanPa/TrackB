package javaBasics;

public class Constructor {
	   int c;
	   int e= 6;
	static int d;
	 Constructor()
	{
	 System.out.println("i m in default constructor");	
		
	}
	 
	 Constructor(int a, int b)
	 {
		 c= a +b;
		 System.out.println("i am in parametrized constructor" +c);
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Constructor C = new Constructor(100, 67);
		//ChildConstructor D = new ChildConstructor("I am Niranjan");
		//ChildConstructor  c = new ChildConstructor();
		//Constructor E = new Constructor();
    	//Constructor.d = 300;
		//System.out.println(Constructor.d);
//		
	Constructor con = new Constructor();
		System.out.println(con);
				
		
		
	}

}
