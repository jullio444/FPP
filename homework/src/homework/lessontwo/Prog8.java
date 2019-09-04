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
		System.out.println("Enter upto 7 numbers:");
		while (count < 7) {
			arrInt[count] = scanner.nextInt();
			count++;
		}
		int min = arrInt[0];
		for (int j = 0; j < arrInt.length; j++) {
			if (arrInt[j] < min)
				min = arrInt[j];
		}
		System.out.println("MIN number in passed Array =" + min);
	}

}
