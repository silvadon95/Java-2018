package problem5Phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> phonebook = new HashMap<>();
		fillPhonebook(scanner, phonebook);
		searchPhonebook(scanner, phonebook);
		
		scanner.close();
	}

	private static void searchPhonebook(Scanner scanner, Map<String, String> phonebook) {
		while (true) {
			String line = scanner.nextLine();
			if("stop".equals(line)) {
				break;
			} else if (phonebook.containsKey(line)){
				System.out.printf("%s -> %s%n", line, phonebook.get(line));
			} else {
				System.out.printf("Contact %s does not exist.%n", line);
			}
		}
		
	}

	private static void fillPhonebook(Scanner scanner, Map<String, String> phonebook) {
		while (true) {
			String line = scanner.nextLine();
			if ("search".equals(line)) {
				break;
			} else {
				String inputs[] = line.split("-");
				phonebook.put(inputs[0], inputs[1]);
			}
		}
		
	}

}
