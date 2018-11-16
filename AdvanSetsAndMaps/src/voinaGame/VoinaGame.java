package voinaGame;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> firstPlayer = new LinkedHashSet<>();
		Set<Integer> secondPlayer = new LinkedHashSet<>();
		
		fillNumbers(scanner, firstPlayer, secondPlayer);
		
		for (int i = 0; i < 50; i++) {
			if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
				System.out.println(firstPlayer.isEmpty() ? "Second player wins" : "First player wins");
				return;
			}
			
			int firstNum = firstPlayer.iterator().next();
			firstPlayer.remove(firstNum);
			
			int secondNum = secondPlayer.iterator().next();
			secondPlayer.remove(secondNum);
			
			if (firstNum > secondNum) {
				firstPlayer.add(firstNum);
				firstPlayer.add(secondNum);
			} else if (firstNum < secondNum) {
				secondPlayer.add(firstNum);
				secondPlayer.add(secondNum);
			}
		}
		
		printResult(firstPlayer,secondPlayer);
		
		scanner.close();
	}

	private static void printResult(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
		if (firstPlayer.size() > secondPlayer.size()) {
			System.out.println("First player wins");
		} else if (firstPlayer.size() < secondPlayer.size()) {
			System.out.println("Second player wins");
		} else {
			System.out.println("Draw");
		}
		
	}

	private static void fillNumbers(Scanner scanner, Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
		
		String[] firstPlayerNumbers = scanner.nextLine().split("\\s+");
		String[] secondPlayerNumbers = scanner.nextLine().split("\\s+");
		
		for (String firstPlayesNumber : firstPlayerNumbers) {
			firstPlayer.add(Integer.parseInt(firstPlayesNumber));
		}
		for (String secondPlayesNumber : secondPlayerNumbers) {
			secondPlayer.add(Integer.parseInt(secondPlayesNumber));
		}
	}

}
