package homework.lesson4.prob3;

public class BinarySearch {

	public int checkRecursiveBinarySearch(String str, char charCheck) {
		BinarySearch b = new BinarySearch();
		String sortedStr =  b.sort(str);
		return recursiveBinarySearch(b.sort(sortedStr), 0, sortedStr.length(), charCheck);
	}

	private int recursiveBinarySearch(String sortedStr, int beginIndex, int endIndex, char charCheck) {
		if (beginIndex < endIndex) {
			int midIndex = beginIndex + (endIndex - beginIndex) / 2;
			if (charCheck < Character.toLowerCase(sortedStr.charAt(midIndex))) {
				return recursiveBinarySearch(sortedStr, beginIndex, midIndex, charCheck);
			} else if (charCheck > Character.toLowerCase(sortedStr.charAt(midIndex))) {
				return recursiveBinarySearch(sortedStr, midIndex + 1, endIndex, charCheck);
			} else {
				return midIndex;
			}
		}
		return -1;
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
