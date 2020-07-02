package interfaceConcept;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	//Only method declaration- no method body(only method prototype)
	//In interface we can declare the variables. they are by default static
	// we cannot change the value of the variable
	// no static method in interface
	//No main method
	//We can create object of interface
	//Interface is abstract in nature
	
}
