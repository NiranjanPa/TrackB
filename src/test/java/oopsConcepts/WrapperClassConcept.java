package oopsConcepts;

public class WrapperClassConcept {
     //to convert from string to integer it should be pure numeric - "200A" this cannot be converted to integer we will get Number format exception
	public static void main(String[] args) {
		String x ="100";
		System.out.println(x+20);
		//integer
		int i = Integer.parseInt(x); //to convert a string into integer
		System.out.println(i+20);
		
		//double
		String k = "12.67";
		double d = Double.parseDouble(k);
		System.out.println(d);
		
		//boolean
		String j = "true";
		boolean b = Boolean.parseBoolean(j);
		System.out.println(b);
		
		//integer to string
		int l = 300;
		System.out.println(l+ 56);
		
		String s = String.valueOf(l);// integer is cnverted to string
		System.out.println(s+56);
		
				
		
		

	}

}
