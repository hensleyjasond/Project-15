
import java.lang.Math;

public class TwoDimensionalShape extends Shape{					//extending shape to allow for use of instanceof, to call the string name for loops.
		
		int length;												//intiilizing the attritutes
		int height;
		int radius;
		double area;
		String name;
		
		
		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {							//getters and setters made
			this.radius = radius;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}

		public void circleShape() {
			area = getCircleArea();
			name = "circle";
			
		}

		public void squareShape() {
			area = getSquareArea();
			name = "square";
			
		}
		
		public void triangleShape() {
			area = getTriangleArea();
			name = "triangle";
			
		}
			private double getCircleArea() {							//method to return what attributes
					return (double) (2 *  Math.PI * radius);		
			}
			private double getSquareArea() {							//method to return what attributes
				return (double) (length * height);		
		}
			private double getTriangleArea() {							//method to return what attributes
				return (double) ((length * height) / 2);		
		}



}











//First attempt at creating this program below







//
//import java.lang.Math;
//
//public class TwoDimensionalShape {
//		
//		int length;//intiilizing the attritutes
//		int height;
//		int radius;
//		double area;
//		
//		
//		public int getLength() {
//			return length;
//		}
//
//		public void setLength(int length) {
//			this.length = length;
//		}
//
//		public int getHeight() {
//			return height;
//		}
//
//		public void setHeight(int height) {
//			this.height = height;
//		}
//
//		public int getRadius() {
//			return radius;
//		}
//
//		public void setRadius(int radius) {
//			this.radius = radius;
//		}
//
//		public double getArea() {
//			return area;
//		}
//
//		public void setArea(double area) {
//			this.area = area;
//		}
//
//		public void circleShape() {
//			area = getCircleArea();
//			
//		}
//
//		public void squareShape() {
//			area = getSquareArea();
//			
//		}
//		
//		public void triangleShape() {
//			area = getTriangleArea();
//			
//		}
//			private double getCircleArea() {//method to return what attributes
//					return (double) (2 *  Math.PI * radius);		
//			}
//			private double getSquareArea() {//method to return what attributes
//				return (double) (length * height);		
//		}
//			private double getTriangleArea() {//method to return what attributes
//				return (double) ((length * height) / 2);		
//		}
//
//

//}
