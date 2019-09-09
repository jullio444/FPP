package homework.lesson4.prob1;

import java.util.Scanner;

public class TestProb1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String A:");
		String a = scan.nextLine();
		System.out.println("Enter String B:");
		String b = scan.next();
		MergeSortedStrings m = new MergeSortedStrings();
		System.out.println("RECURSIVELY SORTED MERGED STRING: "+m.merge(a,b));
		scan.close();
	}
}
