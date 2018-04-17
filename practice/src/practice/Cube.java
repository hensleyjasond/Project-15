package practice;

public class Cube {

		int length;//intiilizing the attritutes of a cube.
		int bredth;
		int height;
	
	
	public int getCubeVolume() {//method to return what attributes the cube has
		return(length * bredth * height);
		
	}
	Cube(){//setting the getCubeVolume class a starting cube, so every time a new Cube is called, this method, inside the cube class is called
		//System.out.println("Called this constructor correctly");// this is to test the method to Cube class contructor
		length = 10;
		bredth = 20;
		height = 30;//giving the Cube contructor some attibutes, 
		}
	
		Cube(int l, int b, int h){// now the atttributes are intialised, im going to set some input statements in the main class that will be calling this method
			length = l;
			bredth = b;
			height = h;
		}
		
		
		}
