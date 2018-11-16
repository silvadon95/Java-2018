package problem11LogsAggregator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LogsAggregator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Map<String, Integer>> logs = new TreeMap<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int countLogs = Integer.parseInt(reader.readLine());
		fillLogs(logs,reader,countLogs);
		printLogs(logs);

	}

	private static void printLogs(Map<String, Map<String, Integer>> logs) {
		for (Entry<String, Map<String, Integer>> logsEntry : logs.entrySet()) {
			System.out.printf("%s: %d [%s]%n", logsEntry.getKey(), // takes the String name From Map
					logsEntry.getValue()
							.values()
							.stream()
							.mapToInt(Integer::valueOf)
							.sum(), // takes the sum of all logs for that String name (the nested map Integer)
					String.join(", ", logsEntry.getValue()
							.keySet())); // takes the IP from the nester maps (getValue gives the nested Map -> .keySet gets the key which is the String IP
		}
		
	}

	private static void fillLogs(Map<String, Map<String, Integer>> logs, BufferedReader reader, int countLogs) throws IOException {
		for (int i = 0; i < countLogs; i++) {
			// 192.168.0.11 peter 33
			String[] inputs = reader.readLine().split("\\s+");
			String ip = inputs[0];
			String currentName = inputs[1];
			int countCurrentLogs = Integer.parseInt(inputs[2]);
			putLogs(logs, ip, currentName, countCurrentLogs);
		}
		
	}

	private static void putLogs(Map<String, Map<String, Integer>> logs, String ip, String currentName,
			int countCurrentLogs) {
		logs.putIfAbsent(currentName, new TreeMap<>());
		logs.get(currentName).putIfAbsent(ip, 0);
		logs.get(currentName).put(ip, logs.get(currentName).get(ip) + countCurrentLogs);
		
	}

}
