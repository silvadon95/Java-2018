package p3DiagonalDifference;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());
		Integer [][] matrix = new Integer[size][size];
		int sumFirstDiag = 0;
		int sumSecondDiag = 0;
		
		fillMatrix(scanner, size, matrix);
		
		sumFirstDiag = calculateFirstD(matrix, sumFirstDiag);
		sumSecondDiag = calculateSecondD(size, matrix, sumSecondDiag);
		int  diff = Math.abs(sumFirstDiag - sumSecondDiag);
		System.out.println(diff);
		
		scanner.close();
	}

	private static int calculateSecondD(int size, Integer[][] matrix, int secondDiag) {
		for (int i = 0; i < matrix.length; i++) {
			int col = size - 1 - i;
			secondDiag += matrix[i][col];
		}
		return secondDiag;
	}

	private static int calculateFirstD(Integer[][] matrix, int sumFirstDiag) {
		for (int i = 0; i < matrix.length; i++) {
			sumFirstDiag += matrix[i][i];
		}
		return sumFirstDiag;
	}

	private static void fillMatrix(Scanner scanner, int size, Integer[][] matrix) {
		for (int i = 0; i < size; i++) {
			String[] values = scanner.nextLine().split(" ");
			for (int j = 0; j < size; j++) {
				matrix[i][j] = Integer.parseInt(values[j]);
			}
		}
	}

}
