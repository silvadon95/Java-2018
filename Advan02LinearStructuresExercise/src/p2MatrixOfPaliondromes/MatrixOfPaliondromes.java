package p2MatrixOfPaliondromes;

import java.util.Scanner;

public class MatrixOfPaliondromes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		String [][] matrix = new String[rows][cols];
		char startChar = 'a';
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = startChar + "" + (char) (startChar+col) + "" + startChar;
				System.out.print(matrix[row][col] + " ");
				
			}
			startChar++;
			System.out.println();
		}
		
		scanner.close();
	}

}
