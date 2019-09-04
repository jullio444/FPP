package homework.lessontwo;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 0;
		int count = 0;
		
		if(args != null) len = args.length;
		for(int x = 0 ; x<len; x++) {
			System.out.println(args[x].length());
			if(args[x].charAt(0)=='A') count++;
		}
		System.out.println("Number of Arguments that start with A = "+count);
	}

}
