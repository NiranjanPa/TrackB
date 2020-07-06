package javaBasics;
import java.util.Scanner;
public class PrimeTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp; 
		 
    Scanner Console = new Scanner(System.in);
    System.out.println("Please enter the number:");
    int num = Console.nextInt();
    for(int i=2;i<=num/2;i++)
    {
    temp = num% i;
    if ( temp == 0) 
    {
    	System.out.println("its prime number");
    	break;
    }
    else 
    {
    System.out.println("not a prime number");
    
    }
    }	
    	  
	}}
    
    	


