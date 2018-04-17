package practice;

public class Hello {
	public final int number;// 0 can only be used once here because of the "final" keyword
	Hello(){
		number = 10;
	}
	
	/*
	 * Final keyword has numerous ways to be used, below are the stipulations:
	 * final class cannot be sub-classed
	 * final method cannot be overridden by a subclass
	 * a final variable can only be intialized once.
	 */
	
	public static int age;
	public static String doSomething(String message) {
		return message;
	}
	
	public String doSomethingElse(String message) {
		return message;
	}

	
}
