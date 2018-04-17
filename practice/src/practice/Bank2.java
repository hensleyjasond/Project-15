package practice;

public interface Bank2 {							// interface can only be implimented, not extended. so no return value is needed. 
	int getInterestRate();							// you cannot extend to the new class Bank2B, instead it has to be implemented, by key word implements
}
													// if one class needs to inherit from another class, you can use extends.
													// if you have insterface as a base class and you have class as a sub class, then it is implements
													// if you have interface of an interface then you can use extends
													// this will be copied to the practice file, or main method.