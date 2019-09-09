package homework.lesson4.prob2;

public class LinearSearch {

	public char checkLinearSearch(String str) {
		return recursiveLinearSearch(str,'z', 0, 0);
	}
	
	private char recursiveLinearSearch(String str, char minChar, int pos, int indexOfMin) {
		if (str.length() == 1) {
			return str.charAt(0);
		}else if (pos == str.length()) {
			return str.charAt(indexOfMin);
		} else if (Character.toLowerCase(minChar) > Character.toLowerCase(str.charAt(pos))) {
			indexOfMin = pos;
			minChar = str.charAt(pos);
		}
		return recursiveLinearSearch(str, minChar, pos + 1, indexOfMin);
	}
}
