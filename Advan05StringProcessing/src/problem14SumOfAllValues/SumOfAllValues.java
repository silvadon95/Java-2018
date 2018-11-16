package problem14SumOfAllValues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfAllValues {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String key = reader.readLine();
		String text = reader.readLine();
		
		Matcher start = getStart(key);
		Matcher end = getEnd(key);
		
		if (checkForStartAndEnd(start, end)) return;
		Matcher textMatcher = getTextMatcher(text, start, end);
		
		
	}

	private static Matcher getTextMatcher(String text, Matcher start, Matcher end) {
		Pattern pattern = Pattern.compile(start.group() + "(\\d+|\\d*\\.\\d*)" + end.group());
		return pattern.matcher(text);
	}

	private static boolean checkForStartAndEnd(Matcher start, Matcher end) {
		if (!start.find() || !end.find()) {
			System.out.println("<p>A key is missing</p>");
			return true;
		}
		return false;
	}

	private static Matcher getEnd(String key) {
		Pattern endPattern = Pattern.compile("(?<=\\\\d)[a-zA-Z_]+$");
		return endPattern.matcher(key);
	}

	private static Matcher getStart(String key) {
		Pattern startPattern = Pattern.compile("^[a-zA-Z_]+(?=\\d)");
		return startPattern.matcher(key);
	}

}
