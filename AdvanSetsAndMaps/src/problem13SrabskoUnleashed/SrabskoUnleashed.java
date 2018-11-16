package problem13SrabskoUnleashed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrabskoUnleashed {

	public static void main(String[] args) throws IOException {
		Map<String, Map<String, Long>> srabsko = new LinkedHashMap<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		fillSingers(srabsko, reader);
		printResult(srabsko);

	}

	private static void printResult(Map<String, Map<String, Long>> srabsko) {
		for (Entry<String, Map<String, Long>> singerEntry : srabsko.entrySet()) {
			System.out.println(singerEntry.getKey());
			singerEntry.getValue()
				.entrySet()
				.stream()
				.sorted((x, y) -> -x.getValue()
						.compareTo(y.getValue()))
				.forEach(singer -> System.out.printf("#  %s -> %d%n", 
						singer.getKey().trim(), 
						singer.getValue()));
		}
		
	}

	private static void fillSingers(Map<String, Map<String, Long>> srabsko, BufferedReader reader) throws IOException {
		String line = "";
		while (true) {
			line = reader.readLine();
			if ("End".equals(line)) {
				break;
			}
		}
		
		Pattern currentPattern = getPattern();
		Matcher matches = makeMatches(line, currentPattern);
		doIfThereAreMatches(srabsko, matches);
		
	}
	
	private static void doIfThereAreMatches(Map<String, Map<String, Long>> srabsko, Matcher matches) {
		if (matches.matches()) {
			Integer cost = Integer.parseInt(matches.group("p"));
			Integer count = Integer.parseInt(matches.group("c"));
			String srabskiSinger = matches.group("s");
			String place = matches.group("v");
			putSrabsko(srabsko, srabskiSinger, place, cost, count);
		}
		
	}

	private static void putSrabsko(Map<String, Map<String, Long>> srabsko, String srabskiSinger, String place,
			Integer cost, Integer count) {
		srabsko.putIfAbsent(place, new LinkedHashMap<>());
		srabsko.get(place).putIfAbsent(srabskiSinger, 0L);
		srabsko.get(place).put(srabskiSinger, srabsko.get(place).get(srabskiSinger) + cost * count);
		
	}

	private static Matcher makeMatches(String line, Pattern currentPattern) {
		return currentPattern.matcher(line);
	}

	private static Pattern getPattern() {
		return Pattern.compile("^(?<s>([^ ]+ ){1,3})@(?<v>([^ ]+ ){1,3})" +
                "(?<p>\\d+) (?<c>\\d+)$");
	}

}
