package practice;

public class Rectangle extends Polygon{// polygon is "derived" class and retangle class is which deriving so polygon is base class that is inheriting
										// when inheriting all types are accessable. protected, and private 
		public double area() {
			return (height * width);
		}
}
