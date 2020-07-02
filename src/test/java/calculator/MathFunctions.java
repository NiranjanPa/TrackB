package calculator;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MathFunctions {

	// Exponent

	@Test(dataProvider = "Doubledata", groups = { "Regression" })
	public static void exp(double a, double b, double d) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		double c = Math.pow(a, b);
		Assert.assertEquals(c, d);
		Reporter.log("The power value is : " + c, true);
	}
    @Test(dataProvider = "IntegerData")
    public static int addd(int a, int b,int d) {
    	int c = a+b;
    	System.out.println("The add is "+ c);
		return c;
    	
    }
	// Modulus
	@Test(dataProvider = "IntegerData", groups = { "smoke" }, dependsOnMethods ="exp")
	public static void mod(int a, int b, int d) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		
		int c = a % b;
		Assert.assertEquals(c, d);
		Reporter.log("The modulus value is: " + c, true);
	}

	// Inverse
	@Parameters({ "num1", "operation" })
	@Test(groups = { "Regression" })
	public static void inverse(int num1, String operation) {

		switch (operation) {

		case "inverse":
			if (num1 == 0) {
				throw new IllegalArgumentException("Cannot divide by 0!");
			}
			Reporter.log("The Inverse value is : " + (double) 1 / num1, true);

			break;

		case "negate": // This will fail
			if (num1 == 0) {
				throw new IllegalArgumentException("Cannot divide by 0!");
			}
			int c = (-1) * num1;
			Assert.assertNotEquals(c, -5);
			Reporter.log("The negative value is : " + c, true);
		}
	}

	@Parameters({ "num1" })
	@AfterClass
	public static void positiveOrNegative(int num1) {

		if (num1 > 0) {
			//Assert.assertEquals()
			Reporter.log(num1 + " is a positive number", true);
		} else if (num1 < 0) {
			Reporter.log(num1 + " is a negative number", true);
		} else {
			Reporter.log(num1 + " is neither positive nor negative", true);
		}
		 
	}
	@Parameters({ "num2" })
	@AfterTest //(dependsOnMethods ="poitiveOrNegative")
	public static void OddorEven(int num2) {
		if ( num2 % 2 == 0 )
			Reporter.log("Entered number:" +num2+" is even",true);
	     else
	    	 Reporter.log("Entered number:"+num2+" is odd",true);
	  
	}

	@DataProvider(name = "Doubledata")
	public Object[][] getData() {
		return new Object[][] {

				{ 30.56, 8.98, 2.1710862763428168E13 }, { 45.45, 2.1, 3025.6672459330484 },
				{ 97.89, 23.34, 2.909595305722029E46 } };
	}

	@DataProvider(name = "IntegerData")
	public Object[][] IntegerData() {
		return new Object[][] {

				{ 6, 34, 6 }, { 70, 2, 0 }, { 9, 23, 9 } };
	}

}
