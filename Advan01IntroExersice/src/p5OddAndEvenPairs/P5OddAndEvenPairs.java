package p5OddAndEvenPairs;

import java.util.Scanner;

public class P5OddAndEvenPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] numbAsArray = scanner.nextLine().split("\\s+");
		
		if (numbAsArray.length % 2 == 1) {
			System.out.println("Invalid lenght");
			
		} 
		
		for (int i = 0; i < numbAsArray.length; i+=2) {
			int firstNum = Integer.parseInt(numbAsArray[i]);
			int secondNum = Integer.parseInt(numbAsArray[i+1]);
			
			if (firstNum % 2 == 1 && secondNum % 2 == 1) {
				System.out.printf("%d, %d -> both are odd%n", firstNum, secondNum);
			} else if (firstNum % 2 == 0 && secondNum % 2 == 0) {
				System.out.printf("%d, %d -> both are even%n", firstNum, secondNum);
			} else {
				System.out.printf("%d, %d -> different%n", firstNum, secondNum);
			}
		}
		
		
		scanner.close();
	}

}
