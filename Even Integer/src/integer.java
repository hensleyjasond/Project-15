import java.util.Scanner;

/*
Jason Hensley
COP 3330 
eveninteger

6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. 

The method should take an integer argument and return true if the integer is even and false 
otherwise. Incorporate this method into an application that inputs a sequence of integers 
(one at a time) and determines whether each is even or odd.
 */

public class integer {

	
	public static boolean evenInt(int numberCheck){
		if (numberCheck % 2 == 0){
			return true;
			}
		else{
			return false;
			}
		
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a number: ");

		while (input.hasNext())
		{
			int userInputNumber = input.nextInt();
			if (evenInt(userInputNumber) == true)
			{
				System.out.printf("%d is even.\n", userInputNumber);
				System.out.printf("Enter another number: ");
			}	
			else if(evenInt(userInputNumber) == false)
			{
				System.out.println("Enter another number: ");
				System.out.println("The number entered wasn't an even number.");
			}	
			
		}	
	}
}
