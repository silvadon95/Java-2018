package p7characterMultiplier;

import java.util.Scanner;

public class P7CharacterMultiplier {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string1 = scanner.next("\\w+");
		String string2 = scanner.next("\\w+");
		scanner.nextLine();
		
		long sum = 0L;
		
		int iterations = string1.length() < string2.length() ? string1.length() : string2.length();
		
		for (int i = 0; i < iterations; i++) {
			sum += string1.charAt(i) * string2.charAt(i);
		}
		
		if (string1.length() > string2.length()) {
			for (int i = iterations; i < string1.length(); i++) {
				sum += string1.charAt(i);
			}
		}
		
		if (string2.length() > string1.length()) {
			for (int i = iterations; i < string2.length(); i++) {
				sum += string2.charAt(i);
			}
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
