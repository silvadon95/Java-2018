package problem11ReplaceaTags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReplaceaTags {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		String pattern = "<a(.+?)>(.*?)</a>";
		
		while (true) {
			String line = reader.readLine();
			
			if ("END".equals(line)) {
				break;
			}
			
			output.append(line).append("\n");
		}
		
		Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
		Matcher matcher = regex.matcher(output);
		
		while (matcher.find(0)) { 
			int startIndex = matcher.start();
			int endIndex = matcher.end();
			
			String replacement = "[URL" + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
			output.replace(startIndex, endIndex, replacement);
		}
	
		System.out.println(output.toString());

	}

}
