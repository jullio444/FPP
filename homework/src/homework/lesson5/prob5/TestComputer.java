package homework.lesson5.prob5;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp1 = new Computer("Apple", "i5", 16, 3.8);
		Computer comp2 = new Computer("Apple", "i7", 16, 3.8);
		Computer comp3 = new Computer("Apple", "i5", 16, 3.8);

		System.out.println(comp1.equals(comp2));
		System.out.println(comp1.equals(comp3));
		System.out.println(comp1.hashCode());
		System.out.println(comp3.hashCode());
	}
}

/*Sample Output
false
true
63479864
63479864*/