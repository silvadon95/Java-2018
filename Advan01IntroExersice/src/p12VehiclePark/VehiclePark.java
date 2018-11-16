	package p12VehiclePark;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VehiclePark {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] inputVehicles = scanner.nextLine().split(" ");
		List<String> vehicles = new ArrayList<>();
		for (int i = 0; i < inputVehicles.length; i++) {
			vehicles.add(inputVehicles[i]);
		}
		String request = scanner.nextLine();
		int soldCount = 0;
		
		while (!request.contains("End of customers")) {
			
			char type = Character.toLowerCase(request.split(" ")[0].charAt(0));
			int seats = Integer.parseInt(request.split(" ")[2]);
			
			if (vehicles.contains(type+""+seats)) {
				System.out.printf("Yes, sold for %d%n", type*seats);
				int index = vehicles.indexOf(type+""+seats);
				vehicles.remove(index);
				soldCount++;
			} else {
				System.out.println("No");
			}
			request = scanner.nextLine();
		}
		System.out.println();
		System.out.println("Vehicles left: " + Arrays.toString(vehicles.toArray()).replace("[", "").replace("]", ""));
		System.out.printf("Vegicles sold: %d%n", soldCount);
		
		scanner.close();
	}

}
