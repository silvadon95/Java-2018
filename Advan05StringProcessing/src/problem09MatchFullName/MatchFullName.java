package problem09MatchFullName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String reg = "^[A-Z][a-z]+ [A-Z][a-z]+$";
		while (true) {
			String line = reader.readLine();
			
			if ("end".equals(line)) {
				break;
			}
			
			Pattern regex = Pattern.compile(reg);
			Matcher matcher = regex.matcher(line);
			
			if (matcher.find()) {
				System.out.println(line);
			}
			
		}

	}

}
