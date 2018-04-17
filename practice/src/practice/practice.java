package practice;						//main class declared
// a message

import java.util.Scanner;				//importing scanner
import java.util.ArrayList;				//importing the array list libary
import java.util.LinkedList;			//imports the linked list libary
import java.util.*;						//imports all the util namespace
public class practice {					//main class or name of the program

//		public static void main(String[] args) {//main statement, comment out video 16 main method or you'll get errors
			
//Java for beginners: https://www.youtube.com/watch?v=WZXq5_9_JDs&index=8&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al	
			
//video 6			
			//System.out.println("Enter a number: ");//prompting for input
			//Scanner scan1 = new Scanner (System.in);//scanner is intiilzied 
			//int myInput = scan1.nextInt();//int is declared and prepared if it was a string it would be scan1.nextLine
			
			//System.out.println("The number entered is: " +myInput);//output is output to screen
//video 7			
//			int x = 10;//a int is declared
//			
//			System.out.println(x);//printing x to the screen
//			System.out.println(++x);//incrimenting before the x, so that the output is 10 + 1, and 11 is printed to the screen
//			System.out.println(x++);//incrimenting after x is given so that the next iteration of x will be added
//	
			
//video 8	(if statements)		
//			if(x == 11) {//checking to see if x was the right value
//				System.out.println("Declared it right!");// lets you know the dependant statement is right
//			}
//			else 
//				System.out.println("nope it's wrong.");// lets you know its wrong
			
			
//video 9 (if statements with conditions)
//			
//			System.out.println("Enter a number: ");//prompting for a number
//			Scanner scan2 = new Scanner(System.in);//intilizliing the scanner for the number input
//			int x = scan2.nextInt();//getting that number
//					
//			if(x >=10) {//setting a condition for the print statment
//				System.out.println("Yes, the number is 10 or greater, and that number is " +x);//yup it's good
//			}
//			else
//				System.out.println("The number was not 10 or greater");// lower that 10 entered
			
			
//video 10( logical operators)			
//			System.out.println("Enter a number for comparision: ");//prompting for a number
//			Scanner scan3 = new Scanner(System.in);//scanner is used to get a number
//			int cond1 = scan3.nextInt();//number is stored
//			
//			System.out.println("Enter another number for comparision: ");//prompting for another number
//			Scanner scan4 = new Scanner(System.in);//scanner is used to get the second number
//			int cond2 = scan4.nextInt();//second number is stored.
//			
//			if((cond1 == 40) && (cond2 <= 41)) {
//				System.out.println("Right number guessed");//letting you know the condition is true
//			}
//			else {
//				System.out.println("wrong number guessed");//otherwise the return is nope wrrong number
//				}
//video 10(switch statements)
//			System.out.println("Enter the students GPA: ");//prompting for a GPA
//			Scanner scan5 = new Scanner(System.in);//scanner is used to get the GPA
//			int gpa = scan5.nextInt();//GPAnumber is stored.
//			
//			switch(gpa) {
//			case (100) :
//			case (99) :
//			case (98) :
//			case (97) :
//			case (96) :
//			case (95) :
//			case (94) :
//			case (93) :
//			case (92) :
//			case (91) :
//			case (90) :
//				System.out.println("Top of the class");
//				break;
//			case (89) :
//			case (88) :
//			case (87) :
//			case (86) :
//			case (85) :
//			case (84) :
//			case (83) :
//			case (82) :
//			case (81) :
//			case (80) :
//				System.out.println("Top 80% ");// as long as the case statements are before this, this is the print statement that will be displayed
//				break;
//			case (70) :
//				System.out.println("Top 70% ");
//				break;
//			case (60) :
//				System.out.println("Top 60% ");
//				break;
//			case (50) :
//				System.out.println("Top 50% ");
//				break;
//			case (40) :
//				System.out.println("failing");
//				break;
//			default :
//				System.out.println("not defined");
//				break;
//			}
//video 11	(while Loops)
//			System.out.println("Enter a number: ");//prompting for input
//			Scanner scan6 = new Scanner (System.in);//scanner is intiilzied 
//			int myInput = scan6.nextInt();//int is declared and prepared
//			
//			while (myInput <=27) {
//				System.out.println(myInput);
//				myInput++;
//			}
//video 12 (do while loops)
//			System.out.println("Enter a number: ");//prompting for input
//			Scanner scan7 = new Scanner (System.in);//scanner is intiilzied 
//			int myInput = scan7.nextInt();//int is declared and prepared
//			
//			while (myInput <=27) {
//				System.out.println(myInput);//does the condition while the while argument is true.
//				myInput++;//incriments by one until condition is met
//			}
//			System.out.println("------------------------------------------------");//letting me know it's broken out of the loop
//			int myInput2=0;//inout is declared, and intilized
//			do {//does the condition first then checks the condition are met
//				System.out.println(myInput2);
//				myInput2++;
//			}while(myInput2<=28);
			
//video 13 (Java- Arrays in Java)			
//			int intArray[] = {1,2,3,4,5,6,7,8,9,10};//array of 10 integers
//			int intArray2[] = new int[10];//another array of integers to show a few ways to declare an array, but all 10 numbers are inilized to 0.
//			System.out.println("Enter an array postion number(1-10): ");//prompting for input
//			Scanner scan8 = new Scanner (System.in);//scanner is intiilzied 
//			int myInt = scan8.nextInt();//int is declared and prepared
//			
//			System.out.println(intArray[myInt]);
//			System.out.println(intArray2[myInt]);
//			
//video 14 Java (The for Statement in Java (for loops)
//			int intArray3[] = {1,2,3,4,5,6,7,8,9,10};//array of 10 integers starting at 0, so 0 being postion 1, 1, is postion 2, and so on
////			int intArray4[] = new int[10];//another array of integers to show a few ways to declare an array, but all 10 numbers are inilized to 0.
//			System.out.println("Enter an array postion number(1-10): ");//prompting for input
//			Scanner scan9 = new Scanner (System.in);//scanner is intiilzied 
//			int myInt2 = scan9.nextInt();//int is declared and stored
//			
//			for(int intArray1=0; intArray1 <10; intArray1++) {// a new int is declared, and incrimented so that the for loop can run till the condition is met
//				System.out.println("the array is at: " +intArray3[intArray1]);// the statement prints and pulls the array postion, and goes through the loop till the condition is met, intArray1 is less that 10
//			}
//				System.out.println("------------------------------------------------");//letting me know it's broken out of the loop after the condition has been met.
//			
//			for(int element : intArray3) {// a different way to use the for loop with an array, declare it, with a type, then :(colon) and then the array
//				System.out.println("the array is at: " +element);// prints out the array with a statement "the array is at" before the array position.
//			
//			}
//video 15 (Java tort- Java Strings)	
//			String myString="hello java is making sense now";//basic string is declared, intilized
//			int myStringLength = myString.length();//puts a number value on the characters used on myString, and gives it back
//			String myStringinLowerCasel = myString.toLowerCase();// makes the string lower case, can be done to upper as well by typing myString.toUpperCase();
//			System.out.println(myString);//prints out the statement that is myString
//			System.out.println("total length is " + myStringLength + " characters long");//prints the number of characters to the screen and concatenates the string together
//			System.out.println("you can replace the e in hello like this " +myString.replace('e', 'a') +" --it now has an a --" );//you can replace characters like this.
//			System.out.println(myString.indexOf('j'));//index of lists the character of the number selected, by starting at 0, myString is 30 long, so 6, is j
//
//video 16 (Introduction to Methods)
//	public static void main(String[] args) {//main statement-- moving through, need to comment out video 17's main method	
//		myMethod();//the created method can be called to the main method like this. this can be called over and over 	
//		myMethod();// like this
//		}//you have to put methods outside the main method, because there can only be one main.
//		
//			public static void myMethod() {// a created method
//				System.out.println("My Method");
//			}
	
//video 17 (Parameter passing and Returning a Value from a Method)
//	public static void main(String[] args) {//main statement --> comment out video 18 before using	
//		myMethod("Jason");//the created method can be modified to call that method over with the arguments given.	
//		myMethod("Daniel");//by replacing the argument, you can call that method again, and again with an alteration with the argument given
//		
////		Add(21, 22);// calling the add method and giving the arguments for the method to be used a is given 21, and b is given 22 then adds the 
//		//numbers together, this is commented out to show the return type when changing public static void Add(int a, int b), that doesn't return anything, to 
//		//public static int Add(int a, int b) which can be called and returns a value that is stored, as long as its the same type that is declared in the method
//		
//		int sum = Add(21, 22);// the method is called, and then arguments given. 
//		System.out.println(sum);// prints out the stored value of sum, which is the return value of the Add method below. 
//		
////		Add(23, 24);// and called again, you can add other numbers, and call the method again.
//		}//you have to put methods outside the main method, because there can only be one main.
//		
//			public static void myMethod(String name) {// a created method, with an arguments in the ()
//				System.out.println("the name " + name +" can be called again");
//			}//ends the myMethod method
//			
//			public static int Add(int a, int b) {//by declaring a method Add, and using the arguments of integers a, and b intilized and declared
////				System.out.println(a + b);// by adding more int types, you can add more numbers such as Add(int a, int b, int c, int d), then print them out
//			return (a+b);
//			}// this can be done another way, by making the method return a value, you can just store the type, like int, change the void out, for int and 
//			//then store the value in the main function. like below
//			
	
//video 18 (Classes and Objects in Java)
//				public static void main(String[] args) {//main method--on to video 19
//	
//				student jason = new student();// the student or "an object" called from another file to compact the code and make it easier to use
//				
////				jason.id = 1;// you would declare this and intialize the object like this if access to the varible wasn't a big deal, but to restrict access to this varible look below
////				jason.name = "Jason";
////				jason.age = 41;
//				
//				jason.setId(1);//we set the id, which is setId, then we use the argument 1, to intialize it.
//				jason.setName("Jason");// again, access is restricted, but varible is declared and initilized.
//				jason.setAge(41);
//				
//				
//				student jj = new student();// the student or "an object" called from another file to compact the code and make it easier to use
//				
//				jj.id = 2;// access can be accessed by any user, not like above, when the data is protected. in the jason example
//				jj.name = "JJ";
//				jj.age = 7;
//				System.out.println(jason.getName() + " is " + jason.getAge() + " years old, and his id number is " + jason.getId());// printing out that the 3 attributes that is called and declared
//																																	//the arguments are left blank but this example calls the getters
//																																	//and prints them out to the screen.this can be done because the 
//																																	// student class is in the same package as the main class.
//				System.out.println(jj.name + " is " + jj.age + " years old, and his id number is " + jj.id);
//				
//	
//	
//				}
//video 19 (Class Constructor in Java)	
	
//				public static void main(String[] args) {//main method --> to video 20
//					Cube cube1 = new Cube();//cube 1 will be called from the Cube class file
//					
//					System.out.println("Enter the length: ");//prompting for input				// the 3 input calls below, were an attempt to define my own peremeters. 
//					Scanner scan8 = new Scanner (System.in);//scanner is intiilzied 
//					int l = scan8.nextInt();//int is declared and prepared
//					
//					System.out.println("Enter the bredth: ");//prompting for input
//					Scanner scan9 = new Scanner (System.in);//scanner is intiilzied 			//scanner has to be closed after use, such as the end of the method
//					int b = scan9.nextInt();//int is declared and prepared
//					
//					System.out.println("Enter the heigth: ");//prompting for input
//					Scanner scan10 = new Scanner (System.in);//scanner is intiilzied 
//					int h = scan10.nextInt();//int is declared and prepared
//					
//					System.out.println(cube1.getCubeVolume());
//					
//					System.out.println("------------------------------------------------");//letting me know it's done with the above method call.
//					scan8.close();
//					scan9.close();
//					scan10.close();
					
//					Cube cube2 = new Cube(100, 200, 300);
//					System.out.println(cube2.getCubeVolume());
//				}
	
//video 20  (Method Overloading in Java)
//					public static void main(String[] args) {		// basic logic of method overloading, is you can utilize the method to return different 
//																	//types so that utilize the code more efffecitly.
//						System.out.println(Add(1,3));				// java sees this as the int method call. 
//						System.out.println(Add(1.5,3.5));			// java sees this as the double method call
//						System.out.println(Add("Jason ", " Daniel"));// java sees this as the String method call
//					}
//	
//					public static int Add(int a, int b) {		//the same method call, can be named the same, if the arguments that given are diffent. here its int, String and double
//						return( a + b);
//					}
//					
//					public static double Add(double a, double b) {
//						return( a + b);
//					}
//					
//					public static String Add(String a, String b) {
//						return( a + b);
//					}
	
	
//video 21  ('static' keyword in Java)
//					public static void main(String[] args) {// static means that it only belongs to the specific instance.
//
//					
//					Hello hello = new Hello();//makes a new instance of the class Hello, stored in another file, which allows you to make more than one -- like below--
//					Hello.doSomething("Hello");
//					Hello.doSomething("Hello again");
//					Hello.age = 10;
//					System.out.println(hello.age);
//					
//					Hello hello1 = new Hello();    				//<--- like this, still using the class Hello, and the variables declared there, and string, but has a new name hello1>
//					Hello.age = 50;
//					System.out.println(hello1.age);
//					}

					
//video 22 ('static' keyword Example in Java)
//					public static void main(String[] args) {// static means that it only belongs to the specific instance.
//					Student Tom = new Student();// Tom is a new instance of Student. and being declared
//					System.out.println(Tom.getNumberStudents());    // 			<--- like here, but when the print line is specific then it has to follow the name declared. 
//					Student Dick = new Student();
//					System.out.println(Dick.getNumberStudents());	// 			<--- and here, the code grabs the name before it, AND the name after and inciments that. 
//					Student Harry = new Student();
//					
//					
//					//System.out.println(Student.getNumberStudents());		//calls the method getNumberStudents method of the class Student. however after you make the new 
//																			//instance of that student class and declare it, such as Dick, you can use it to call the method as well, --like above--
//					
//					
//					}
//video 23 (Public, Private, Protected and this (Java Access Modifiers))
					
//					public static void main(String[] args) {
//						
//						// the notes for this is all in the students file
//					}
//			
//					
	
//video 24 (The final keyword in Java)
//					public static void main(String[] args) {
//					Hello hel = new Hello();
//					//hel.number = 20;										// cannot compile, because its been given 10 in the hello file
//	
//					}
	
	
//video 25 (Inheritance in Java)
//			public static void main(String[] args) {
//				Rectangle rec = new Rectangle();							// setting up a new method call, by intiilizing rec for rectangle, the shape polygon has
//				Triangle tri = new Triangle();								//extended to the 2 other shapes, triangle, and rectangle. this make them the child classes
//				
//				rec.values(10, 10);
//				tri.values(5, 5);											// the values of int a, and int b, which are in polygon class, but extended to triangle through inheritance. 
//				
//				System.out.println("Area of the Rectangle " +rec.area());	//printing out the values of the new rectangle that is on line 328
//				System.out.println("Area of the Triangle " +tri.area());	//same as above, but line 329
//			}
	
	
//video 26 (Polymorphism in Java)// Polymorphism - the ablity of an object to have different forms.
//		public static void main(String[] args) {
//			Bank b = new BankB();											//since bankB has the property of Bank, we make a new instance of Bank B and call it b
//			Bank c = new BankC();											// the same goes for c, and d. by extending the class Bank, to b, c, an d, they are called child classes
//			Bank d = new BankD();											//When calling the child class the parent class is included, as seen in these 3 calls. 
//			
//			
//			System.out.println(b.getInterestRate());
//			System.out.println(c.getInterestRate());
//			System.out.println(d.getInterestRate());
//		}
	
	
//video 27 (Method Overriding in Java)
//			public static void main(String[] args) {						//only using bankB in this example.
//				Bank b = new BankB();										//when you have a parent class that is intielized to 0, and you call the child class this "overrides" 
//																			//the 0, and makes the parent method call getInterestRate method and return 5, which is the return of BankB
//				
//				System.out.println("The interest rate of Bank B is: " +b.getInterestRate()+"%");
//			}
//			
			
			
//video 28 (Abstract Methods and Classes)
//		public static void main(String[] args) {							
//		
//			
//
//			so this:
//					public class Bank {							
//						int getInterestRate() {					
//							return 0;							
//						}
																	// when adding abstract infront of a class such as bank, the {} can go away because the inheritance is limited 
																	//to just the method, like this instead of the as in the bank class in this package.
//			would look like this:
			// abstract public class Bank {     					 //<-- this would be what Bank super class in this package (or parent class)																
			// 		int getInterestRate() 							
//			//	} 													
//			
//			
//		}
	
////video 29 (Java Interfaces) - same as an abstract class. All interface is abstract by nature. 
					
						
//						public interface Bank {		// cannot be in a "main" method, this needs to be in a separate class, and called through a method call of a child class, 					
//							int getInterestRate();	// or multiple method calls, NOte: it is abstract by nature. 
//						}				
					
		//------------------------------This is from video 29, the previous videos the instructions go into inheritance and abstract methods interface when added to a method------------------------
		//------------------------------such as above, makes the method abstract by nature, so here he (the speaker) deletes the previous classes made, I wont do this instead ----------------------
		//------------------------------I'll create a new base method, (super class, or parent class which at this time of my understanding is all the same thing.) called Bank2.-------------------- 
		//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//------------------------------To create a interface, right click on package, and go to new, then interface.--------------------------------------------------------------------------------
										// if one class needs to inherit from another class, you can use extends.
										// if you have interface as a base class and you have class as a sub class, then it is implements
										// if you have interface of an interface then you can use extends
										// this was copied from the Bank2 interfaces file.
	
//Example below	
//			public static void main(String[] args) {
//				
//				Bank2 bank = new Bank2(); 					// since Bank2 is abstract, you cannot intilize this
//			}
	
//video 30 (Recursion in java)
//	
//	
//					//Factorial explanations:
//	
//					// 	ie. N! = N x (N-1) x (N-2) x .... x 2 x 1
//					//	example: 5! = 5 x 4 x 3 x 2 x 1
//		
////			public static int add(int a, int b) {			// using this and trying to explain a method call from itself, also know as recursion
////					return( a + b);
////			}
////			public static void main(String[] args) {		// so add is called, and the output is sum. 
////				int sum = add(23, 10);
////			}
//																				// we change it to below so to show an example. 
//				public static int factorial (int N) {							// creating a method to create a factorial of a number:
//					if (N<=1)													//says if the factorial is less than or equal to 1 then it has to be 1
//						return 1;												//returns 1
//					else return (N * factorial(N-1));							//else return the number N, * the next number (the previous number -1) and keep doing that until 1 is reached.
//				}																//this method is called to the system out in main method, it recursively recalls the same method until 1 is reached
//				
//				public static void main(String[] args) {												//main method
//					System.out.println("Enter a number for the factorial: ");							//prompting for a number
//					Scanner scan9 = new Scanner(System.in);												//sets the scanner up
//					int b = scan9.nextInt();															//scan9 is initialized, of the nextInt type, and given b is the name
//					System.out.println("The factorial of the entered number is " +factorial(b));		//calls the factorial method, of int type, where N, redone as (b) is that integer. 
//																										
//					scan9.close();																		// closes the scanner
//				}
				
////video 31 (Arraylist in Java)
//				public static void main(String[] args) {
////					int simple_array[] = new int[5];						// simple array that is 5 int's long or {1, 2, 3, 4, 5} - not used, just an example
//				
//					ArrayList<Integer> myList = new ArrayList<Integer>(6);	//making a array list, of integer type, named myList and is equal to new array list 5 int's 
//					myList.add(1);					//adding a number to the array, 1 which is in the 0 spot of the array
//					myList.add(5);					//adding another number to the array, this one is 5, which is in spot 1 of the array
//					myList.add(3);					// and finally 3 is being added to the spot 2 of the array
//					myList.add(6);					// spot 3 is being used by the integer 6
//					myList.add(93);					// and the 4th and final spot is being used by the integer 93
//					
//					for(Integer x: myList)			// making a modified for loop, that grabs my array myList, assigns it to int x for each iteration
//						System.out.println(x);		// and prints that number out to the screen
//						
//					System.out.println(myList);		// if you needed to print out hte numbers in the array then this would be a way
//				System.out.println(myList.size());	// if you needed the size of that array list then this would be a way to print that out
//													//note: this "size is not the number in the array as above, 5, you can add any number up to that and it would print that number out. 
//					System.out.println("----------------------------------------------------");// to show the next line
//	//example of changing an element of the array, at a certain index.
//				
//					for(Integer x: myList)			
//						System.out.println(x);		
//						
//					System.out.println(myList);		
//				System.out.println(myList.size());
//						myList.set(0, 41);			//in this part the array, at index 0, which is 1, will now become 41
//						myList.trimToSize();		// this is a way to "trim" an array to the size of elements it contains, for example if lelemtns 6, and 93 were delete, it would trim to 3.
//													// however since it has 5, it would be 5.
//					System.out.println("----------------------------------------------------");// to show the next line
//					
//	//example of remove, copied the for loop to show the size of the array, then when remove is used, and again to show how this can be reused
//				
//					for(Integer x: myList)			
//						System.out.println(x);		
//						myList.remove(2);				// this is how you would remove an index value, in this case index value 2, so number 3
//						
//					System.out.println(myList);		
//				System.out.println(myList.size());	
//					
//				
//					System.out.println("----------------------------------------------------");// to show the next line
//				
//					for(Integer x: myList)			
//						System.out.println(x);		
//						myList.remove(2);				// this is how you would remove an index value, in this case index value 2, so number 3
//						
//					System.out.println(myList);		
//				System.out.println(myList.size());		// after this loop is run, it has taken out, or removed the 2nd arry item, or number 6 this time.
//				
//				
//	//example of remove, copied the for loop to show the size of the array, then when clear is used.	
//				
//					System.out.println("----------------------------------------------------");// to show the next line
//					myList.clear();						// or finally you can clear all the elements of the array
//					System.out.println(myList);			//outputs the no numbered array in []
//					System.out.println(myList.size());	// and gives a 0 value from the array
//					
//	
//					}
		
//video 32 (LinkedList in Java)
//					public static void main(String[] args) {
//						LinkedList<String> myLinked = new LinkedList<String>(); // LInked List set up
//						
//						myLinked.add("Jason");				//adds names to the linked list
//						myLinked.add("Steve");
//						myLinked.add("Kevin");
//						myLinked.add("Derek");
//						myLinked.add("Jared");
//						myLinked.add("Justin");
//						myLinked.addFirst("Summer");		//adds this to the first spot in the list
//						myLinked.addLast("Last");			//adds this to the last spot in the list
//						myLinked.removeFirst();				//removes first name in list
//						myLinked.removeLast();				//removes last name in list
//						myLinked.add(0, "Index0 replaced");	//replaces the first index of the array
//						myLinked.remove(4);					//removes the 4th spot which is 5th index, and is name: Derek
////						myLinked.clear();				//removes all
//						System.out.println(myLinked.size());//outputs size of the list
//						System.out.println(myLinked);		//lists the array that is left
//						for(String x : myLinked)
//						System.out.println(x);
//					}
	
//video 33 (Difference between LinkedList vs ArrayList in Java)	
//						//Major differences
//						//LinkedList element insertion is faster compared to ArrayList 
//						
//						//ArrayList search operation is pretty fast compared to the LinkedList search.
//						//LinkedList doesn't provide a Random or index based access, and you need to iterate over the linked lsit to retrieve any element.
//						//LInked list element (frequent) deletion is faster compare to ArrayList
//						//LInkedListhas more memory overhead than ArrayList because in the ArrayList each index only holds an actual object, but in the case of LinkedList, 
//						//each node holds both data and the address of the next and previous node
//	
//						public static void main(String[] args) {
//							long n=(long) 1E7;							//a long int n, is equal to 1 to the power 7
//							
//							ArrayList arrayList =new ArrayList();		// the array list is given a new iteration
//							long milis = System.currentTimeMillis();	//system, or the current time on the pc is set to the long milis
//							for(int i=0;i<n;i++){
//							    arrayList.add(i);						//the new arrayList adds the value of i
//							}
//						    System.out.println("Insert ArrayList Takes "+(System.currentTimeMillis()-milis)+" ms");
//						    
//						    LinkedList linkedList=new LinkedList();
//						    milis = System.currentTimeMillis();
//						    for(int i=0;i<n;i++){
//						        linkedList.add(i);						//the new linkedList adds the value of i
//						    }
//						    System.out.println("Insert LinkedList Takes "+(System.currentTimeMillis()-milis)+" ms");
//						    
//						    milis=System.currentTimeMillis();
//						    arrayList.remove(0);
//						    System.out.println("Del front ArrayList takes "+(System.currentTimeMillis()-milis)+" ms");
//						    
//						    milis=System.currentTimeMillis();
//						    linkedList.remove(0);
//						    System.out.println("Del front LinkedList takes "+(System.currentTimeMillis()-milis)+" ms");
//						    
//						    milis=System.currentTimeMillis();
//						    arrayList.get((int)n/2);
//						    System.out.println("Get front ArrayList takes "+(System.currentTimeMillis()-milis)+" ms");
//						    
//						    milis=System.currentTimeMillis();
//						    linkedList.get((int)n/2);
//						    System.out.println("Get front LinkedList takes "+(System.currentTimeMillis()-milis)+" ms");
//									
//								}	

//video 34 (ListIterator in Java)
	/*
	public boolean hasNext();
	public Object next();
	public boolean hasPrevious();
	public Object previous();
	*/
//	 
//	    public static void main(String[] args) {
//	        ArrayList<String> names = new ArrayList<String>();	// creates a arraylist names
//	        
//	        names.add("Mark");									//Adding the string names to the arraylist names
//	        names.add("tom");
//	        names.add("john");
//	        names.add("jack");
//	        names.add("patrik");
//	        
//	        ListIterator<String> itr = names.listIterator();	//takes the strings of the array list names, and assigns them to the list itr
//	        
//	        while (itr.hasNext())								//a while loop that takes the ListIterator and 
//	            System.out.println(itr.next());					//prints out the array list, in order from index 0, as long as there is a next iteration.
//	        
//	        System.out.println("");								//provides spaces
//	        System.out.println("");
//	        
//	        
//	        while (itr.hasPrevious())							//a while loop that takes the ListIterator and
//	            System.out.println(itr.previous());				//prints out the array list, in order from the last index, as long as there is a previous iteration.
//	    }
//	
//	
//video 35 (HashSet in Java)
	    				// similar to linkedLink and array list, however HashSet can only contain unique elements
	
	
						public static void main(String[] args) {
							 HashSet<String> name = new HashSet<String>();	// can be string , int type, but is declared the same way as the linked and array list
							 
						        name.add("Mark");					//adding strings to the hashset, exactly list the array list
						        name.add("Mark");					//java sees this as the same as above with the HashSet list chosen, and will not print it out
						        name.add("tom");
						        name.add("jack");
						        name.add("july");
						        name.add("patrik");
						        
//						        name.remove(0);						//has the abiltiy to remove, and clear items
						        Iterator<String> itr = name.iterator();	//used with hashset, and same type in this case String assigned to itr once again
						        
						        while(itr.hasNext())					//moves on to the next value of the iterator string
						            System.out.println(itr.next());
						    }
							

//video 36 (Catching and Handling Exceptions in Java using Try Catch Blocks)

	// An exception is an event which occurs during the execution of the program that disrupts the normal flow of the programs instructions

//
//					public static void main(String[] args) {
//				//example of a exception occurring
//						
//						try {
//							int a = 100/0;						//tries to run 100 devided by 0, which is a ArithmeticException, so the catch is looking for that, and assigning it to e
//						}catch(ArithmeticException e) {			//catches the exception, and moves on through the program
//							System.out.println(e);				//prints out that e exception was caught
//						}
//						try {
//							int b = 50/0;						
//						}catch(ArithmeticException d) {			
//							System.out.println(d);				
//						}
//						System.out.println("passed through the prgram to output");
//					}
					
//video 53 (How to build a Calculator in JavaFX Part-1)
//					public static void main(String[] args) {
//					
//							
//						}
	
}//public class method from line 5 closing bracket
		
		
		
		
	
	

