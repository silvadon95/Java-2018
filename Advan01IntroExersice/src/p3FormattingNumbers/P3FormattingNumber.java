package p3FormattingNumbers;

import java.util.Scanner;

public class P3FormattingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		String aBin = String.format("%10s",Integer.toBinaryString(a)).replace(" ", "0");
		
		System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|", a, aBin, b, c);
		
		scanner.close();
	}

}
