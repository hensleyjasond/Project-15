
import java.lang.Math;

public class ThreeDimensionalShape extends Shape{				//extending shape to allow for use of instanceof, to call the string name for loops.
	
	double length;												//intiilizing the attritutes
	double height;
	double radius;
	double area;
	double volume;
	double bredth;
	String name;
	
	
	public double getBredth() {
		return bredth;
	}
	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {						//getters and setters made, but given double type as to make calculations more accurate
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
		public void sphereShape() {
			area = getSphereArea();
			volume = getSphereVolume();
			name = "sphere";
		}
		
		public void cubeShape() {
			volume = getCubeVolume();
			area = getCubeArea();
			name = "cube";
		}
		
		public void tetrahedronShape() {
			volume = getTetrahedronVolume();
			area = getTetrahedronArea();
			name = "tetrahedron";
		}
		
			private double getSphereArea() {					//method to return what the area attributes are
				return (double) (4 *  Math.PI * (radius*radius));		
			}
			private double getSphereVolume(){					//method to return what the volume attributes are
				return (double) ((4/3)*  Math.PI * (radius*radius*radius));
			}
			private double getCubeVolume() {					//method to return what the volume attributes are
				return (double) (length * height * bredth);		
			}
			private double getCubeArea() {						//method to return what the area attributes are
				return (double) ((length * length)*6);		
			}
			private double getTetrahedronVolume() {				//method to return what the volume attributes are
				return (double) ((length*length*length)/ 6*Math.sqrt(2));		
			}
			private double getTetrahedronArea() {				//method to return what the area attributes are
				return (double) ((length*length)*Math.sqrt(3));		
			}
	
}















//First attempt at creating this program below




//
//import java.lang.Math;
//
//public class ThreeDimensionalShape {
//	
//	int length;//intiilizing the attritutes
//	int height;
//	int radius;
//	double area;
//	int volume;
//	
//	
//	public int getLength() {
//		return length;
//	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public int getRadius() {
//		return radius;
//	}
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//	public double getArea() {
//		return area;
//	}
//	public void setArea(double area) {
//		this.area = area;
//	}
//	public int getVolume() {
//		return volume;
//	}
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//			private double getSphereArea() {//method to return what attributes
//				return (double) (2 *  Math.PI * radius);		
//		}
//		private double getSphereVolume() {//method to return what attributes
//			return (double) (length * height);		
//		}
//		private double getTriangleArea() {//method to return what attributes
//			return (double) ((length * height) / 2);		
//		}
//	
//}
