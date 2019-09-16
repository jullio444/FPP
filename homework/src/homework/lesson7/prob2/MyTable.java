package homework.lesson7.prob2;

public class MyTable {

	Entry[] entries;

	MyTable() {
		entries = new Entry[26];

	}

	public String get(char c) {
		int charNum = c;
		charNum -= 96;
		if (charNum >= 0 && charNum < 26) {
			return entries[charNum].str;
		}
		return null;
	}

	public void add(char c, String s) {
		int charNum = c;
		charNum -= 96;
		if (charNum >= 0 && charNum < 26) {
			entries[charNum] = new Entry(c, s);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder strings = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null) {
				strings.append(entry + "\n");
			}
		}
		return strings.toString();
	}

	private class Entry {
		private char c;
		private String str;

		Entry(char c, String str) {
			this.c = c;
			this.str = str;
		}

		@Override
		public String toString() {
			return c + " -> " + str;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		t.add('j', "Julius");
		System.out.println(t); //Print entire table 
		System.out.println(t.get('j')); //Get sample result
	}
}

/*	Output
 * 
 * a -> Andrew 
 * b -> Billy 
 * j -> Julius 
 * w -> Willie
 *
 * Julius
 *
 * 
 * 
 */
