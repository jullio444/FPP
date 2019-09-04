package homework.lessontwo;

import java.util.Arrays;
import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); 
		 int[] arrInt = new int[7];
		 int count = 0;
		 while(count<7) {
	        arrInt[count] = scanner.nextInt();
	        count++;
		 }
		 System.out.println(Arrays.toString(arrInt));
	}

}
