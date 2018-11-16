package softUniParty;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<String> guests = new TreeSet<>();
		
		String line = scanner.nextLine();
		
		while (!"PARTY".equals(line)) {
			guests.add(line);
			
			line = scanner.nextLine();
		}
		
		line = scanner.nextLine();
		
		while (!"END".equals(line)) {
			guests.remove(line);
			
			line = scanner.nextLine();
		}
		
		
		System.out.println(guests.size());
		//[7IK9Yo0h, tSzE5t0p]
		//System.out.println(guests);
		
		System.out.println((guests + " ").replaceAll("[\\[\\]]", ""));
		
		scanner.close();
	}
}
