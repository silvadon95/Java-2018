package problem6AMinerTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AMinerTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Integer> resources = new HashMap<>();
		fillMap(scanner,resources);
		printMap(resources);
		
		scanner.close();
	}

	private static void printMap(Map<String, Integer> resources) {
		for (Entry<String, Integer> entry : resources.entrySet()) {
			System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
		}
		
	}

	private static void fillMap(Scanner scanner, Map<String, Integer> resources) {
		while (true) {
			String resource = scanner.nextLine();
			if ("stop".equals(resource)) break ;
			
			int quantity = Integer.parseInt(scanner.nextLine());
			if (resources.containsKey(resource)) {
				int sumResource = resources.get(resource)+quantity;
				resources.put(resource, sumResource);
			} else {
				resources.put(resource, quantity);
			}
			
			
		}
	}
}
