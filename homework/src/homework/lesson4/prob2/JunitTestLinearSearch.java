package homework.lesson4.prob2;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestLinearSearch {

	@Test
	public void test() {
		String check = "qwertyuidkfjhghs";
		char exp = 'd';
		char result = new LinearSearch().checkLinearSearch(check);
		assertEquals(result, exp);
	}

}
