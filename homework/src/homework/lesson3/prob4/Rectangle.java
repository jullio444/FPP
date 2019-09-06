package homework.lesson3.prob4;

public final class Rectangle {
	private double width;
	private double length;

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double calAreaOfTriangle() {
		return width * length;
	}
}
