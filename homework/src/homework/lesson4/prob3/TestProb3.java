package homework.lesson4.prob3;

import java.util.Scanner;

public class TestProb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch binary = new BinarySearch();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		System.out.println("\nEnter Character to Search in the parsed String");
		char c = scan.nextLine().charAt(0);
		System.out.printf("Char %s in the given String is at index "+binary.checkRecursiveBinarySearch(s, c), c);		
		scan.close();
	}

}
