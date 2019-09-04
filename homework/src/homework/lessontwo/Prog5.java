package homework.lessontwo;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumbers rn = new RandomNumbers();
		int[][] board = new int[4][4];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; ++j) {
				board[i][j] = rn.getRandomInt(1, 99);
				if (i == 1 || i == 3) {
					System.out.printf("+%d \t", board[i][j]);
					if (i == 1 && j == 3 || i == 3 && j == 3) {
						System.out.println("\n");
						for (int l = 0; l < 4; l++)
							System.out.print("___\t");
						System.out.println("\n");
					}
				} else {
					System.out.print(" " + board[i][j] + "\t");
				}

			}
			System.out.println();
		}
	}
	/*
	 * Sample Output
	 * 
	 *   96	     1	     52	      45
	 *  +84 	+70 	+40 	 +7 
	 *  
	 *  ___		___		___		 ___	
	 *  
	 *  
	 *   58	 	 94	 	 79	 	  40
	 *  +88     +1 		+86 	 +87 
	 *  
	 *  ___	 	___	 	___	 	 ___	
	 */
}
