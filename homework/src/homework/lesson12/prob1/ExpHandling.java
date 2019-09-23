package homework.lesson12.prob1;

import java.util.Scanner;

public class ExpHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Enter a mark");

		while (true) {
			try {
				input = sc.nextLine();
				if (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 100)
					throw new IllegalArgumentException();
				System.out.println("Your input is accepted.");
				sc.close();
				break;
			} catch (NumberFormatException e) {
				System.out.println("Only numbers are accepted. Please try again:");
			} catch (Exception e) {
				System.out.println("Your number is not in the range 0-100. Please try again:");
			}
		}

	}

}
