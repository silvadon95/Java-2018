package problem7FixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FixEmails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, String> emails = new LinkedHashMap<>();
		fillMap(scanner, emails);
		printMap(emails);
		
		scanner.close();
	}

	private static void printMap(Map<String, String> emails) {
		for (Entry<String, String> entry : emails.entrySet()) {
			System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
		}
	}

	private static void fillMap(Scanner scanner, Map<String, String> emails) {
		while (true) {
			String name = scanner.nextLine();
			if ("stop".equals(name)) break;
			String mail = scanner.nextLine();
			String domain = mail.substring(mail.length()-3);
			
			if ((".us".equals(domain) || ".uk".equals(domain) || "com".equals(domain)) == false) {
				emails.put(name, mail);
			}
		}
	}

}
