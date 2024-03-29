package homework.lesson3.prob4;

public final class Triangle {
	private double base;
	private double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double calcAreaOfTriangle() {
		return 0.5 * base * height;
	}
}
