package calculator;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Arithmetic {

	// Passing the 3 sets of data from data provider

	@Test(dataProvider = "testData", groups = { "smoke" }, dependsOnMethods = "subtract")
	public void add(int a, int b, int d) {
		int c = a + b;
		Assert.assertEquals(c, d);
		Reporter.log("Numbers added successfully and The sum is : " + c, true); // to see the logs on index.html report and console																		 
	}
	
	@Test(dataProvider = "intData", groups = { "smoke" }, dependsOnMethods = "subtract")
	public int add(int a, int b) {
		int c = a + b;
		return c;																		 

	}
	

	// Passing the 3 sets of data from data provider

	@Test(dataProvider = "dataManager", groups = { "smoke" })
	public void subtract(int a, int b, int c) {
		int d = a - b;
		Assert.assertEquals(c, d);
		Reporter.log("Numbers subtaracted successfully and The difference is : " + c, true);

	}

	// Passing the data from XML file
	@Test // no matter you include the method in xml file(inside class) it will execute
				// once before the tests
	@Parameters({ "num1", "num2" })
	public void Multiplication(int num1, int num2) {
		int num3 = num1 * num2;
		Assert.assertTrue(true, "Multiplied");
		Reporter.log("Numbers multiplied successfully and The Multiplication is :" + num3, true);
	}
	
	
	// Passing the data from XML file
	@Test // no matter you include the method in xml file(inside class) it will execute
				// once before the tests
	@Parameters({ "num1", "num2" })
	public void MultiplicationUsingAdd(int num1, int num2) {
		
		int result = 0;
		
		for(int i = 0; i < num1; i++) {
		result = add(result, num2);
		}
		//int num3 = num1 * num2;
		//Assert.assertTrue(true, "Multiplied");
		Reporter.log("Numbers multiplied successfully and The Multiplication is :" + num2, true);
	}	

	@Test(dataProvider = "dataManager", groups = { "smoke" }) // This method will fail
	public static void DivReal(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		Assert.assertFalse(false, "Test case failed");
		Reporter.log("Numbers divided successfully andThe real division is :" + (double) a / b, true);

	}

	@Test(dataProvider = "intData", groups = { "Regression" })
	public static void DivInt(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		Reporter.log("Numbers divided successfully and The Integer division value is " + a / b, true);
	}

	@DataProvider(name = "dataManager")
	public Object[][] getData() {
		return new Object[][] {

				{ 67, 34, 33 }, { 6, 2, 4 }, { 997, 23, 974 } };
	}

	@DataProvider(name = "testData")
	public Object[][] Data() {
		return new Object[][] {

				{ 10, 20, 30 }, { 6, 2, 8 }, { 99, 1, 100 } };
	}

	@DataProvider(name = "intData")
	public Object[][] intData() {
		return new Object[][] {

				{ 10, 20 }, { 60, 2 }, { 50, 30 } };
	}
	

	
}
