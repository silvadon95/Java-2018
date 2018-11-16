package p4MaximalSum;

import java.util.Scanner;

public class MaximalSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dimensions = scanner.nextLine().split(" ");
		
		int rows = Integer.parseInt(dimensions[0]);
		int cols = Integer.parseInt(dimensions[1]);
		Integer[][] matrix = new Integer[rows][cols];
		int bestSum = Integer.MIN_VALUE;
		int rowIndex = 0;
		int colIndex = 0;
		
		fillMatrix(scanner, rows, cols, matrix);
		
		for (int row = 0; row < rows-2; row++) {
			for (int col = 0; col < cols-2; col++) {
				int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col+2] +
						matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2] +
						matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];
				if (sum > bestSum) {
					bestSum = sum;
					rowIndex = row;
					colIndex = col;
				}
			}
		}
		
		System.out.println("Sum = " + bestSum);
		for (int i = rowIndex; i < rowIndex+3; i++) {
			for (int j = colIndex; j < colIndex+3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

	private static void fillMatrix(Scanner scanner, int rows, int cols, Integer[][] matrix) {
		for (int row = 0; row < rows; row++) {
			String[] values = scanner.nextLine().split(" ");
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = Integer.parseInt(values[col]);
			}
		}
	}

}
