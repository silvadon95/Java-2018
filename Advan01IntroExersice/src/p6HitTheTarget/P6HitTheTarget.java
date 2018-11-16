package p6HitTheTarget;

import java.util.Scanner;

public class P6HitTheTarget {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int target = scanner.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i + j == target) {
					System.out.printf("%d + %d = %d%n", i, j, target);
					break;
				} 
				else if (i - j == target) {
					System.out.printf("%d - %d = %d%n", i, j, target);
					break;
				}
			}
		}
		
		scanner.close();
	}

}
