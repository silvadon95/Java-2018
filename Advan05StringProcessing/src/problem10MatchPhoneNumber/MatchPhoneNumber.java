package problem10MatchPhoneNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String reg = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";
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
