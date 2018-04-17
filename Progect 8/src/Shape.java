//import java.util.Scanner;// no user input, was testing



//Jason Hensley
//COP3330
/*Implement the Shape hierarchy shown in Fig. 9.3 of the textbook. --Done
 * 
Each TwoDimensionalShape should contain method getArea to calculate the area of the two-dimensional shape. --Done

Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume, 
respectively, of the three-dimensional shape.--Done

Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy.--Done
 
The program should print a text description of the  object to which each array element refers. Also, in the loop that processes all the shapes in the array, 
determine whether each shape is a TwoDimensionalShape or a ThreeDimensionalShape. --Done

If a shape is a TwoDimensionalShape, display its area. --Done

If a shape is a ThreeDimensionalShape, display its area and volume.--Done
*/


//Comments will be added now to all my programs. not sure if you read these, but after the effort I've put in to making up the ground 
//I've lost, moving forward I've seen putting in comments helps me understand more, makes me ask myself questions, and think more clearly. 
//with no spell check, i can't promise you wont cringe a little though. but at least i can read and understand it.

public class Shape {												//Main Class
	
	public static void main(String[] args) {						//main method
		
		TwoDimensionalShape circle = new TwoDimensionalShape();		//circle pulled from the two-dem class and given a new object of that class
		circle.setRadius(2);										//no user input given, so calls radius and given 2 as argument
		circle.circleShape();										//calling the circle shape from twodem class
//		System.out.println("For the Two-dimensional shape circle the area is: "+ circle.getArea());//prints to screen
//		
		TwoDimensionalShape square = new TwoDimensionalShape();		//square pulled from the two-dem class
		square.setLength(3);										//no user input given, so calls length and given 3 as argument
		square.setHeight(5);										//no user input given, so calls height and given 5 as argument
		square.squareShape();										//calling the square shape from twodem class
//		System.out.println("For the Two-dimensional shape square the area is: "+ square.getArea());//prints to screen
//		
		TwoDimensionalShape triangle = new TwoDimensionalShape();	//triangle pulled from the two-dem class  and given a new object of that class
		triangle.setLength(3);										//no user input given, so calls length and given 3 as argument
		triangle.setHeight(5);										//no user input given, so calls height and given 5 as argument
		triangle.triangleShape();									//calling the triangle shape from twodem class
//		System.out.println("For the Two-dimensional shape triangle the area is: "+ triangle.getArea());//prints to screen
//		
		ThreeDimensionalShape sphere = new ThreeDimensionalShape();	//sphere pulled from the three-dem class  and given a new object of that class
		sphere.setRadius(3);										//no user input given, so calls radius and given 2 as argument
		sphere.sphereShape();										//calling the sphere shape from three-dem class
//		System.out.println("For the Three-dimensional shape Sphere the area is: "+ sphere.getArea());//prints to screen
//		System.out.println("For the Three-dimensional shape Sphere the volume is: "+ sphere.getVolume());//prints to screen
//		
		ThreeDimensionalShape cube = new ThreeDimensionalShape();	//cube pulled from the three-dem class  and given a new object of that class
		cube.setLength(4);											//no user input given, so calls length and given 4 as argument
		cube.setBredth(4);											//no user input given, so calls bredth and given 4 as argument
		cube.setHeight(2);											//no user input given, so calls height and given 2 as argument
		cube.cubeShape();											//calling the cube shape from three-dem class
//		System.out.println("For the Three-dimensional shape Cube the area is: "+ cube.getArea());//prints to screen
//		System.out.println("For the Three-dimensional shape Cube the volume is: "+ cube.getVolume());//prints to screen
		
		ThreeDimensionalShape tetrahedron = new ThreeDimensionalShape();//tetrahedron pulled from the three-dem class  and given a new object of that class
		tetrahedron.setLength(4);										//no user input given, so calls length and given 4 as argument
		tetrahedron.tetrahedronShape();									//calling the tetrahedron shape from three-dem class
//		System.out.println("For the Three-dimensional shape tetrahedron the volume is: "+ tetrahedron.getVolume());//prints to screen
//		System.out.println("For the Three-dimensional shape tetrahedron the area is: "+ tetrahedron.getArea());//prints to screen
		
		Shape shapeArray[] = {circle, square, triangle, sphere, cube, tetrahedron};//my shape array
		
		for(int s = 0; s<shapeArray.length; s++){					//calling all elements of the array, and itirates through
			if(shapeArray[s] instanceof TwoDimensionalShape){		//conditional statement to check if the shape name is in two or three dimensional shpae class
				System.out.println("The class retrieved is "+((TwoDimensionalShape)shapeArray[s]).name+ " and is a  "+shapeArray[s].getClass());//prints the class type to screen
				System.out.println("For the Two-dimensional shape "+((TwoDimensionalShape)shapeArray[s]).name+ " the area is: "+ ((TwoDimensionalShape)shapeArray[s]).getArea());//prints to screen
				System.out.println();								// to give a space for read ability
			}
			else if(shapeArray[s] instanceof ThreeDimensionalShape){//looks through the extended class for the name, then concatenates the name, class and area/volume or both
				System.out.println("The class retrieved is "+((ThreeDimensionalShape)shapeArray[s]).name+ " and is a "+shapeArray[s].getClass());
			
				System.out.println("For the Three-dimensional shape "+((ThreeDimensionalShape)shapeArray[s]).name+ " the volume is: "+ ((ThreeDimensionalShape)shapeArray[s]).getVolume());//prints to screen
				System.out.println("For the Three-dimensional shape "+((ThreeDimensionalShape)shapeArray[s]).name +" the area is: "+ ((ThreeDimensionalShape)shapeArray[s]).getArea());//prints to screen
				System.out.println();								// to give a space for read ability
			}
		}
	}
	
	
			
			
						
// Cube shape below was for testing an idea, went in another direction
						
//			Cube cube2 = new Cube(100, 200, 300);
//			System.out.println(cube2.getCubeVolume());
		

//	private static void cubeShape() {
//		
//						Cube cube1 = new Cube();//cube 1 will be called from the Cube class file
//						
//						System.out.println("Enter the length: ");//prompting for input				// the 3 input calls below, were an attempt to define my own peremeters. 
//						Scanner scan8 = new Scanner (System.in);//scanner is intiilzied 
//						int l = scan8.nextInt();//int is declared and prepared
//						
//						System.out.println("Enter the bredth: ");//prompting for input
//						Scanner scan9 = new Scanner (System.in);//scanner is intiilzied 			//scanner has to be closed after use, such as the end of the method
//						int b = scan9.nextInt();//int is declared and prepared
//						
//						System.out.println("Enter the heigth: ");//prompting for input
//						Scanner scan10 = new Scanner (System.in);//scanner is intiilzied 
//						int h = scan10.nextInt();//int is declared and prepared
//						
//						System.out.println(cube1.getCubeVolume());
//						
//						System.out.println("------------------------------------------------");//letting me know it's done with the above method call.
//						scan8.close();
//						scan9.close();
//						scan10.close();
//	}
}	














// First attempt at creating this program below



//import java.util.Scanner;
//
//
//
////Jason Hensley
///*Implement the Shape hierarchy shown in Fig. 9.3 of the textbook. 
// * 
//Each TwoDimensionalShape should contain method getArea to calculate the area of the two-dimensional shape. 
//
//Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume, respectively, of the three-dimensional shape.
//
//Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy.
// 
//The program should print a text description of the  object to which each array element refers. Also, in the loop that processes all the shapes in the array, 
//determine whether each shape is a TwoDimensionalShape or a ThreeDimensionalShape. 
//
//If a shape is a TwoDimensionalShape, display its area. 
//
//If a shape is a ThreeDimensionalShape, display its area and volume.
//*/
//public class Shape {
//	
//	public static void main(String[] args) {
//		TwoDimensionalShape circle = new TwoDimensionalShape();
//		circle.setRadius(2);
//		circle.circleShape();
//		System.out.println("the circle radius is: "+ circle.getArea());
//		
//		TwoDimensionalShape square = new TwoDimensionalShape();
//		square.setLength(3);
//		square.setHeight(5);
//		square.squareShape();
//		System.out.println("the square area is: "+ square.getArea());
//		
//		TwoDimensionalShape triangle = new TwoDimensionalShape();
//		triangle.setLength(3);
//		triangle.setHeight(5);
//		triangle.triangleShape();
//		System.out.println("the triangle area is: "+ triangle.getArea());
//	}
//	
//	
//			
			
						

						
//			Cube cube2 = new Cube(100, 200, 300);
//			System.out.println(cube2.getCubeVolume());
		

//	private static void cubeShape() {
//		
//						Cube cube1 = new Cube();//cube 1 will be called from the Cube class file
//						
//						System.out.println("Enter the length: ");//prompting for input				// the 3 input calls below, were an attempt to define my own peremeters. 
//						Scanner scan8 = new Scanner (System.in);//scanner is intiilzied 
//						int l = scan8.nextInt();//int is declared and prepared
//						
//						System.out.println("Enter the bredth: ");//prompting for input
//						Scanner scan9 = new Scanner (System.in);//scanner is intiilzied 			//scanner has to be closed after use, such as the end of the method
//						int b = scan9.nextInt();//int is declared and prepared
//						
//						System.out.println("Enter the heigth: ");//prompting for input
//						Scanner scan10 = new Scanner (System.in);//scanner is intiilzied 
//						int h = scan10.nextInt();//int is declared and prepared
//						
//						System.out.println(cube1.getCubeVolume());
//						
//						System.out.println("------------------------------------------------");//letting me know it's done with the above method call.
//						scan8.close();
//						scan9.close();
//						scan10.close();
//	}
//	}

