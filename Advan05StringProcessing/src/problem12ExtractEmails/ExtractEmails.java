package problem12ExtractEmails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String pattern = "(?<=(\\s|^))([a-z0-9][-._]*)+[a-z0-9]@(([a-z][-]*)+[a-z]\\.)+[a-z]+\\b";
		
		Pattern regex = Pattern.compile(pattern);
		
		List<String> email = new ArrayList<>();
		
		while(true) {
			String input = reader.readLine();
			if ("end".equals(input)) {
				break;
			}
			
			Matcher matcher = regex.matcher(input);
			
			while (matcher.find()) {
				email.add(matcher.group());
			}
		}
		
		for (String mail : email) {
			System.out.println(mail);
		}

	}

}
