package p5MatrixShuffling;

import java.util.Scanner;

public class MatrixShuffling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] dimensions = scanner.nextLine().split(" ");
		int rows = Integer.parseInt(dimensions[0]);
		int cols = Integer.parseInt(dimensions[1]);
		
		String[][] matrix = new String[rows][cols];
		
		for (int row = 0; row < rows; row++) {
			String [] values = scanner.nextLine().split(" ");
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = values[col];
			}
		}
		
		String request = scanner.nextLine();
		
		while (!request.contains("END")) {
			int initRow = Integer.parseInt(request.split(" ")[1]);
			int initCol = Integer.parseInt(request.split(" ")[2]);
			int wantedRow = Integer.parseInt(request.split(" ")[3]);
			int wantedCol = Integer.parseInt(request.split(" ")[4]);
			
			String temp = matrix[initRow][initCol];
			matrix[initRow][initCol] = matrix[wantedRow][wantedCol];
			matrix[wantedRow][wantedCol] = temp;
			
			System.out.println();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			
			request = scanner.nextLine();
		}
		
		
		
		scanner.close();
	}

}
