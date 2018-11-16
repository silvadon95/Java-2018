package problem2SetsOfElements;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] lenghtForBoth = scanner.nextLine().split("\\s+");
		int firstLenght = Integer.parseInt(lenghtForBoth[0]);
		int secondLenght = Integer.parseInt(lenghtForBoth[1]);
		
		HashSet<Integer> firstSet = new LinkedHashSet<>();
		HashSet<Integer> secondSet = new LinkedHashSet<>();
		fillSet(scanner, firstSet, firstLenght);
		fillSet(scanner, secondSet, secondLenght);
		HashSet<Integer> result = checkIfRepeating(firstSet, secondSet);
		printSet(result);
		
		scanner.close();
	}

	private static void printSet(HashSet<Integer> result) {
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
		
	}

	private static HashSet<Integer> checkIfRepeating(HashSet<Integer> firstSet, HashSet<Integer> secondSet) {
		HashSet<Integer> result = new LinkedHashSet<>();
		for (Integer integer : firstSet) {
			if (secondSet.contains(integer)) {
				result.add(integer);
			}
		}
		return result;
		
	}

	private static void fillSet(Scanner scanner, HashSet<Integer> firstSet, int firstLenght) {
		for (int i = 0; i < firstLenght; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			firstSet.add(number);
		}
		
	}

}
