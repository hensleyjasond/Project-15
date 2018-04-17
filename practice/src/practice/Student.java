package practice;

public class Student {//new class created to call for my practice class -----< public, private or protected is know as a access modifier>------
																			//Access modifier levels
																			//Modifier		class	package	subclass	world
																			//1. public	  		Y		  Y		  Y		 Y
																			//2. protected		Y		  Y		  Y		 N
																			//3. private		Y		  N		  N		 N
																			//4. no modifier	Y		  Y		  N   	 N
	
// Access modifier examples:	
	public int height;			//Since this has a public access modifier of class, package, subclass and world 
	private int weight;			//this is private do this is ONLY accessable to the class Student named above. and good practice is this way. if the information isnt to be shared to other files.
	String lastName; 			//this has no modifier, which allows it to be used by the package, and class. 
	protected double handSize;	//public access modifier of class, package, subclass
	
	
	
	
	
	int id;	//  three "things" of many that a student can have to show some attributes
		String name;
		int age;
		static int numberOfStudents = 0;// intialized to zero
		
		
		
		
		
		Student (){//main method which has the properties above attached to it, id, age, name, and numberOfStudents
			numberOfStudents++;// incraments the numberOfStudents by 1 for each instance of the method when this method is called
		}
		public static int getNumberStudents() {
			//System.out.println("Yup");
			return numberOfStudents;
		}
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;//this on a setter indicates that id = id is a member of the Student class, so it will look in the delcareations for it
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {//created getters and setters by selecting the declaration, and going to source, and selecting getters and setters
			this.name = name;				// this auto generates a type for each decleration chosen, so that you can call each attribute indiviually so you can set with the set, and retrive
											// with the get method ie getName gets, and setName sets " this is ecapulation of a varible"
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		
	
	
	public static void main(String[] args) {
		
		
	}

}
