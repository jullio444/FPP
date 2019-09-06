package homework.lesson3.prob4;

import java.util.Scanner;

public class CheckProb4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in), sc2 = new Scanner(System.in);

		double[] params = new double[4];
		System.out.println("Enter the Width:");
		params[0] = sc.nextDouble();
		System.out.println("Enter the Height:");
		params[1] = sc.nextDouble();
		System.out.println("Enter the Base:");
		params[2] = sc.nextDouble();
		System.out.println("Enter the Radius:");
		params[3] = sc.nextDouble();

		System.out.println("Enter \"R\" for Rectangle or C for Circle or T for Triangle");
		String getConsoleInput = new Scanner(System.in).nextLine();

		switch (getConsoleInput) {
		case "R":
			System.out.println("The area of Rectangle is: " + new Rectangle(params[0], params[1]).calAreaOfTriangle());
			break;
		case "T":
			System.out.println("The area of Triangle is: " + new Triangle(params[1], params[2]).calcAreaOfTriangle());
			break;
		case "C":
			System.out.println("The area of Circle is: " + new Circle(params[3]).getAriaOfCircle());
			break;
		default:
			System.out.println("Invalid inpput");
		}

	}
	/*
	 * Sample Output
	 * Enter the Width:
	 * 12
	 * Enter the Height:
	 * 10
	 * Enter the Base:
	 * 10
	 * Enter the Radius:
	 * 12
	 * Enter "R" for Rectangle or C for Circle or T for Triangle
	 * T
	 *The area of Triangle is: 50.0
	 */

}
