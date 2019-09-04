package homework.lessontwo;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "horse", "dog", "cat", "horse", "dog" ,"monkey", "gorilla"};


		for (int j = 0; j < str.length; j++) {
			for (int k = j+1; k < str.length; k++) {
		
					if (str[j] == str[k]) {
						str[k] = " ";
					}
			}
		}
		int sizeOfArray = 0;
		for(String i: str) {
			if(i!=" ")
				++sizeOfArray;
		}
		String[] strCopy = new String[sizeOfArray];
		for(int i= 0, j=0;  i<str.length && j<strCopy.length; i++) {
			if(str[i]!=" ") {
				strCopy[j] = str[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(strCopy));
		
	}

}
