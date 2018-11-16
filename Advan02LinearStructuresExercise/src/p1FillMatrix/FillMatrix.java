package p1FillMatrix;

import java.util.Scanner;

public class FillMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 String[] input = scanner.nextLine().split(", ");
		 int size = Integer.parseInt(input[0]);
		 int [][] matrix = new int[size][size];
		 int counter = 1;	
		 
		 if (input[1].equals("A")) {
			 for (int col = 0; col < size; col++) {
				for (int row = 0; row < matrix.length; row++) {
					matrix[row][col] = counter;
					counter ++;
				}
			}
		 } else if (input[1].equals("B")) {
			 for (int col = 0; col < size; col++) {
				if (col % 2 == 0) {
					for (int row = 0; row < size; row++) {
						matrix[row][col] = counter;
						counter++;
					}
				} else {
					for (int row = size - 1; row >= 0; row--) {
						matrix[row][col] = counter;
						counter++;
					}
				}
			}	
		 }
		
		for (int row = 0; row < size; row++) {
			for (int i = 0; i < size; i++) {
				System.out.print(matrix[row][i] + " ");
			}
			System.out.println();
		} 
		 
		scanner.close();
	}
}
