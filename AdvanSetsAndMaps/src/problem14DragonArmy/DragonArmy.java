package problem14DragonArmy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dragonCount = Integer.parseInt(scanner.nextLine());
		
		Map<String, TreeMap<String, ArrayList<Integer>>> dragonTypes = new LinkedHashMap<>();
		
		for (int i = 0; i < dragonCount; i++) {
			String[] dragonInfo = scanner.nextLine().split(" ");
			
			String type = dragonInfo[0];
			String name = dragonInfo[1];
			
			ArrayList<Integer> stats = new ArrayList<>();
			
			for (int j = 2; j < dragonInfo.length; j++) {
				stats.add(getValue(dragonInfo[j], j));
			}
			
			insertDragonType(dragonTypes, type);
			insertDragon(dragonTypes, type, name, stats);
			
		}
		
		LinkedHashMap<String, ArrayList<String>> typeAverageStats = new LinkedHashMap<>();
		
		for (String type : dragonTypes.keySet()) {
			double avgDamage = 0.0;
			double avgHealth = 0.0;
			double avgArmor = 0.0;
			
			for (ArrayList<Integer> stats : dragonTypes.get(type).values()) {
				avgDamage += stats.get(0);
				avgHealth += stats.get(1);
				avgArmor += stats.get(2);
			}
			
			avgDamage /= dragonTypes.get(type).values().size();
			avgHealth /= dragonTypes.get(type).values().size();
			avgArmor /= dragonTypes.get(type).values().size();
			
			ArrayList<String> averageStats = new ArrayList<>();
			averageStats.add(String.format("%.2f", avgDamage));
			averageStats.add(String.format("%.2f", avgHealth));
			averageStats.add(String.format("%.2f", avgArmor));
			
			typeAverageStats.put(type, averageStats);
		}
		
		for (String type : typeAverageStats.keySet()) {
			System.out.println(type + "::(" + String.join("/", typeAverageStats.get(type)) + ")");
			
			for (String dragon : dragonTypes.get(type).keySet()) {
				ArrayList<Integer> stats = dragonTypes.get(type).get(dragon);
				System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", dragon, 
						stats.get(0), stats.get(1), stats.get(2));
			}
		}
		
		scanner.close();
	}

	private static void insertDragon(Map<String, TreeMap<String, ArrayList<Integer>>> dragonTypes, String type,
			String name, ArrayList<Integer> stats) {
		if (!dragonTypes.get(type).containsKey(name)) {
			dragonTypes.get(type).put(name, new ArrayList<>());
		}
		
		dragonTypes.get(type).put(name, stats);
		
	}

	private static void insertDragonType(Map<String, TreeMap<String, ArrayList<Integer>>> dragonTypes, String type) {
		if (!dragonTypes.containsKey(type)) {
			dragonTypes.put(type, new TreeMap<>());
		}
		
	}

	private static Integer getValue(String typeValue, int typeIndex) {
		int value = 0;
		
		if (!"null".equals(typeValue)) {
			value = Integer.parseInt(typeValue);
			
			return value;
		}
		
		switch (typeIndex) {
		case 2:
			value = 45;
			break;
		case 3:
			value = 250;
			break;
		case 4:
			value = 10;

		}
		
		return value;
	}

}
