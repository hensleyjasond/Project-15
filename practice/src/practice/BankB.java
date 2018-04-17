package practice;

public class BankB extends Bank{		// Second class, needs to extend Bank class, so that you can use the method there. 
	int getInterestRate() {
		return 5;						// for video 27, when you have a parent class that is intielized to 0, and you call the child class this "overrides" the 0, and makes the parent method call 
	}									// getInterestRate method and return 5.
	
	
//	--------------for method overloading----------------- Video 27 explaining the differences of overloading vs overriding.
					// if the method of a child class has another method, that is similar, but has an additional argument, then it is this is method overloading
					// the below method is overloading the above method. overloading happens in the same class., the return type can be different, the argument 
					//can be different, it just has to have the same method name.
	
//	double getInterestRate(int a) {
//		return 5;						 
//	}
	
//	-------------for method overriding------------------ the return type or number of arguments cannot be different. 
}
