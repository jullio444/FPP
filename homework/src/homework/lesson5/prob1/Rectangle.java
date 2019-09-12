package homework.lesson5.prob1;

public class Rectangle extends Shape {
	protected double width;
	protected double height;

	Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return width * 2 + height * 2;
	}
	
}
