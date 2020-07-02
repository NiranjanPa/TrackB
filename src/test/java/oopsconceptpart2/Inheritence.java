package oopsconceptpart2;

public class Inheritence {

	public static void main(String[] args) {
		//Static polymorphism --- compile time polymorphism because the method is invoked during object creation
		HDFC hd = new HDFC();
		hd.savingsAccount();
		hd.personalLoan();
		hd.homeLoans();
		hd.Loans();
		//Types of Inheritence- Single, Multi-level, Hierarchy, Multiple
		System.out.println("***************************");
		
		Bank ba = new Bank();
		ba.savingsAccount();
		ba.Loans();
		ba.InterestRate();
		
		//Child class object can be referenced by parent class reference variable--dynamic polymorphism or runtime Polymorphism
		//Top casting
		Bank b =new HDFC();
		b.InterestRate();
		b.savingsAccount();
		b.Loans();
		//Down Casting
		//HDFC h =(HDFC) new Bank();--Class cast exception
		
        
	}

}
	