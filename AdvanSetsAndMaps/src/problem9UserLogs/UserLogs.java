package problem9UserLogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UserLogs {

	public static void main(String[] args) throws IOException{
		Map<String, Map<String, Integer>> people = new TreeMap<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		fillPeople(people, reader);
		printPeople(people);
	}

	private static void printPeople(Map<String, Map<String, Integer>> people) {
		for (String user : people.keySet()) {
			System.out.println(user + ":");
			StringBuilder stringBuilder = new StringBuilder();
			makeStringBuilder(people, user, stringBuilder);
			String ips = stringBuilder.substring(0, stringBuilder.length() - 2);
			System.out.printf("%s.%n", ips);
		}
		
	}

	private static void makeStringBuilder(Map<String, Map<String, Integer>> people, String user,
			StringBuilder stringBuilder) {
		for (Entry<String, Integer> userIp : people.get(user).entrySet()) {
			String currentIp = String.format("%s => %s", userIp.getKey(),userIp.getValue());
			stringBuilder.append(currentIp);
			stringBuilder.append(", ");
		}
		
	}

	private static void fillPeople(Map<String, Map<String, Integer>> people, BufferedReader reader) throws IOException {
		while (true) {
			String line = reader.readLine();
			if ("end".equals(line)) {
				break;
			} 
			// IP=192.23.33.40 message='Hi&mom!' user=child0
			String[] splited = line.split("\\s+");
			String firstIP = splited[0];
			// IP=192.23.33.40
			String[] iPArray = firstIP.split("=");
			//192.23.33.40
			String currentIp = iPArray[1];
			String secondUser = splited[2];
			//user=child0
			String[] users = secondUser.split("=");
			//child0
			String currentUser = users[1];
			putPeople(people,currentIp, currentUser);
		}
	}

	private static void putPeople(Map<String, Map<String, Integer>> people, String currentIp, String currentUser) {
		Map<String, Integer> empty = new LinkedHashMap<>();
		// putting the user
		people.putIfAbsent(currentUser, empty);
		// putting the value 
		people.get(currentUser).putIfAbsent(currentIp, 0);
		// putting the value when is more than 0
		people.get(currentUser)
				.put(currentIp, people
				.get(currentUser)
				.get(currentIp) + 1);
	}

}
