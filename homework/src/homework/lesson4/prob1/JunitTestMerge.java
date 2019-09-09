package homework.lesson4.prob1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestMerge {

	@Test
	public void test() {
		String a = "dca";
		String b = "had";
		String exp = "aacddh";
		String result = new MergeSortedStrings().merge(a, b);
		assertEquals(result, exp);
	}

}
