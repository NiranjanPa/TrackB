package javaBasics;
import java.util.Scanner;

public class EvenOrOdd {
 private static Scanner sc;
	public static void main(String[] args) {
     int i,j;
     //to get input from the user
     sc= new Scanner(System.in);
      System.out.println("Please enter any integer value:");
      i= sc.nextInt();
      
     //formula
	j=i%2;
	
	//logic
	if (j == 0){
	System.out.println("I is even");
	}
	else{
	System.out.println("I is odd");
		
	}

}

}