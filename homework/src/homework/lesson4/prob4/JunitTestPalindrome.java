package homework.lesson4.prob4;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestPalindrome {

	@Test
	public void test() {
		String check = "Madam";
		boolean exp = true;
		boolean result =new Palindrome().isPalindrome(check);
		assertEquals(result, exp);
	}
}
