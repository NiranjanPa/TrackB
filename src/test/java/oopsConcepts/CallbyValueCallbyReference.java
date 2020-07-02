package oopsConcepts;

public class CallbyValueCallbyReference {
    int p;
    int q;
   
	public static void main(String[] args) {
		CallbyValueCallbyReference obj = new CallbyValueCallbyReference();
		int x = 10;
		int y =20;
		obj.sum(x, y);
		
		obj.p = 23;
		obj.q = 34;
		obj.swap(obj);
		System.out.println("After swapping p is: "+obj.p);
		System.out.println("after swapping q is : "+obj.q);
		
	}
    
	public int sum(int a, int b) {
		int c= a+b;
		return c;
	}
	
	public void swap(CallbyValueCallbyReference t) { // Call by reference
		int temp;
		temp = t.p; //temp = 23
		t.p = t.q; //t.p = 34
		t.q = temp; // t.q = 23
		
	}
}
