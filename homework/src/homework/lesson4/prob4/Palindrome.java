package homework.lesson4.prob4;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String b = scan.next();
		System.out.printf("\nString given is %s", p.isPalindrome(b)?"Palindrome":"Not Palindrome");	
		scan.close();
	}

	public  boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1)))
			return isPalindrome(s.substring(1, s.length() - 1));

		return false;
	}
}
