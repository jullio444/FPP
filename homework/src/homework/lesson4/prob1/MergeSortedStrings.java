package homework.lesson4.prob1;

public class MergeSortedStrings {

	public String merge(String str1, String str2) {
		String mergedSortedStr = str1 + str2;
		return sort(mergedSortedStr);
	}

	private String sort(String s) {
		if (s.length() < 2) {
			return s;
		}

		int pos = 0;
		char min = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < min) {
				min = c;
				pos = i;
			}
		}

		return min + sort(s.substring(0, pos) + s.substring(pos + 1));
	}
}
