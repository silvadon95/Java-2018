package problem1UniqueUsername;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsername {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashSet<String> usernames = new LinkedHashSet<>();
		int numberOfUsers = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < numberOfUsers; i++) {
			String user = scanner.nextLine();
			usernames.add(user);
		}
		
		for (String user : usernames) {
			System.out.println(user);
		}

		scanner.close();
	}

}
