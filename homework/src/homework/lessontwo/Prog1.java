package homework.lessontwo;

public class Prog1 {

	public static void main(String[] args) {
		RandomNumbers rn = new RandomNumbers();
		int x = rn.getRandomInt(1, 9);
		System.out.println("Random number x computed to pi^x=" + (int) (Math.pow(Math.round(Math.PI), x)));
		int y = rn.getRandomInt(3, 14);
		System.out.println("Random number y computed to y^pi=" + (int) (Math.pow(y, Math.round(Math.PI))));
	}

}
