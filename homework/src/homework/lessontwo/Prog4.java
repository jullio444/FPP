package homework.lessontwo;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word to be reversed:");
		String str = scanner.nextLine();
		char[] arrOfStr = new char[str.length()];
		for (int k = 0, m = str.length() - 1; k < str.length(); k++, m--) {
			arrOfStr[k] = str.charAt(m);
		}
		System.out.println(new String(arrOfStr));
	}

}
