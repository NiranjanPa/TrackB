package javaBasics;

public class StaticMethod {
     static int cube(int x){  
    	 System.out.println("The cube for the number "+ x + " is");
    	  return x*x*x;  
     }  
     
     public static void main(String args[]){  
    	int c = StaticMethod.cube(5);
         System.out.println(c);
     }  
   }  