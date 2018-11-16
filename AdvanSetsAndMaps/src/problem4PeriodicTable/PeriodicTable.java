package problem4PeriodicTable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfElements = Integer.parseInt(scanner.nextLine());
		
		Set<String> elements = new TreeSet<>();
		fillSet(scanner, elements, numberOfElements);
		printSet(elements);
		
		
		scanner.close();
	}

	private static void printSet(Set<String> elements) {
		for (String element : elements) {
			System.out.print(element + " ");
		}
		
	}

	private static void fillSet(Scanner scanner, Set<String> elements, int numberOfElements) {
		
		for (int i = 0; i < numberOfElements; i++) {
			String[] line = scanner.nextLine().split("\\s+");
			for (int j = 0; j < line.length; j++) {
				elements.add(line[j]);
			}
		}
		
	}

}
