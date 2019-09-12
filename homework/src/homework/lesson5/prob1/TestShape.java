package homework.lesson5.prob1;


public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = { new Rectangle("Blue", 12.5, 7.5),
				new Circle("Red", 13.6),
				new Square("Green", 8.4)
		};
		
		printTotal(shapes);

	}
	public static void printTotal(Shape[] shapes) {
		double totalArea = 0.0;
		double totalParameter = 0.0;
		
		for(Shape s: shapes) {
			totalArea += s.calculateArea();
			totalParameter += s.calculatePerimeter();
		}
		
		System.out.printf("Total Area of all Shapes = %f \n", totalArea);
		System.out.printf("Total Paramerter of all Shapes = %f", totalParameter);
	}

}
/*Sample Output

Total Area of all Shapes = 745.378977 
Total Paramerter of all Shapes = 159.051320 */