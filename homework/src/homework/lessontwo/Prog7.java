package homework.lessontwo;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (String j : args) {
			System.out.println(j.length());
			if (j.toLowerCase().startsWith("A".toLowerCase()))
				count++;
		}
		System.out.println("Number of Arguments that start with A = " + count);
	}
	/*
	 * Sample passed console arguments: 
	 * Uganda is the pearl of Africa and a Ugandan is loving.
	 * 6
	 * 2
	 * 3
	 * 5
	 * 2
	 * 6
	 * 3
	 * 1
	 * 7
	 * 2
	 * 7
	 * Number of Arguments that start with A = 3
	 */
}
