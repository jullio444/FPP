package homework.lesson3.prob4;

public final class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getAriaOfCircle() {
		return Math.PI * radius * radius;
	}
}
