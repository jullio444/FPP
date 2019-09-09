package homework.lesson4.prob3;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestBinary {

	@Test
	public void test() {
		String check = "abcdefghijklmn";
		char c = 'g';
		int exp = 6;
		int result = new BinarySearch().checkRecursiveBinarySearch(check, c);
		assertEquals(result, exp);
	}

}
