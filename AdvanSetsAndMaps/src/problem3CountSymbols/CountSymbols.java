package problem3CountSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		Map<Character, Integer> charMap = new TreeMap<>();
		
		for (int i = 0; i < text.length(); i++) {
			if (!charMap.containsKey(text.charAt(i))) {
				charMap.put(text.charAt(i), 1);
			} else {
				charMap.put(text.charAt(i), charMap.get(text.charAt(i)) + 1);
			}
			
		}
		for (char ch : charMap.keySet()) {
			System.out.printf("%s : %d time/s%n", ch, charMap.get(ch));
		}
		
		scanner.close();
	}

}
