package calculator;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Arithmetic {
    
    // Passing the 3 sets of data from data provider
	@Test (dataProvider="dataManager", groups= {"smoke"})
	public void add(int a, int b) {
	  	int c = a+b;
	  	System.out.println("The sum is : "+c);
	  	Reporter.log("Numbers added successfully"); // to see the logs on index.html report
	  	Reporter.log("Numbers added successfully", true); // to see the logs in console
	}
	
	  // Passing the 3 sets of data from data provider
	@Test (dataProvider="dataManager")
	public void subtract(int a, int b) {
		int c = a-b;
		System.out.println("The difference is : "+c);
	}
	
	// Passing the data from XML file
	@Parameters({"num1","num2"})
	@Test
	public void Multiplication(int num1, int num2) {
		int num3 = num1*num2;
		System.out.println("The Multiplication is :" +num3);
	}
	
	
	@Test (dataProvider="dataManager", groups= {"smoke"})
	public static void DivReal(int a, int b) {
		if (b == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	   System.out.println((double) a / b);
	
	}
	
	@Test (dataProvider="dataManager")
	public static void DivInt(int a, int b) {
		if (b == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	     System.out.println(a / b);
	}
	
	@DataProvider( name = "dataManager", parallel = true)
	public Object[][]  getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = 6;
		data[0][1] = 2;
		data[1][0] = 4;
		data[1][1] = 6;
		data[2][0] = 8;
		data[2][1] = 10;
		return data;
	}
	
	
}
