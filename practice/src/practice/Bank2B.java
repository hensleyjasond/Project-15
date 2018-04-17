package practice;

public class Bank2B implements Bank2{		// this inherits from Bank2, by the word implements, and since the interface is abstract, 
	public int getInterestRate() {			// public needs to be included on the method call, this defines the method call as something that
											// "overrides" the orginal interface method. 
		return 5;
	}
}
