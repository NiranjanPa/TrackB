package interfaceConcept;

public class HSBCBank implements USBank {

	public void credit() {
		System.out.println("HSBC credit");
		
	}

	public void debit() {
		System.out.println("HSBC debit");
		
	}

	public void transferMoney() {
		
		System.out.println("HSBC transfer money");
	}
    
	public void educationLoan() {
		System.out.println("HSBC Education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
}
