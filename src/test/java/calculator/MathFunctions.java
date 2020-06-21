package calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathFunctions {

	// Exponent
	 
	   @Test
	    public static void exp(double a, double b) {
	      if (b == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      System.out.println("The power value is : "+ Math.pow(a, b));
	   }
	   
	   
	   // Modulus
	   @Test (dataProvider="Data", groups= {"smoke"})
	   public static void mod(int a, int b) {
	      if (b == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      System.out.println( "The modulus value is: "+a%b);
	   }
	       
	     
	   // Inverse
	   @Test
	   public static void inverse(int a) {
	      if (a == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      System.out.println("The Inverse value is : "+ (double) 1 / a);
	   }
	         
	   
	   
	   @Test
	   public static void negate(int a) {
	      if (a == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      System.out.println("The negative value is : "+ (-1) * a);
	   }   
	   
	   @DataProvider
		public Object[][]  Data() {
			Object[][] data = new Object[3][2];
			data[0][0] = 2;
			data[0][1] = 3;
			data[1][0] = 4;
			data[1][1] = 6;
			data[2][0] = 8;
			data[2][1] = 10;
			return data;
		}
	   
}
