package homework.lesson4.prob2;

import java.util.Scanner;

public class TestProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch ls = new LinearSearch();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String A:");
		String a = scan.nextLine();
		System.out.println("MINIMUM CHAR IN STRING INPUT is \""+ls.checkLinearSearch(a)+"\"");	
		scan.close();
	}

}
