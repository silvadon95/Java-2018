package problem03TextFilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] bannedWords = reader.readLine().split(", ");
		String text = reader.readLine();
		
		for (int i = 0; i < bannedWords.length; i++) {
			
			
			if (text.contains(bannedWords[i])) {
				String replacement = new String(new char[bannedWords[i].length()]).replace("\0", "*");
				text = text.replaceAll(bannedWords[i], replacement);
			}
			
		}
		
		System.out.println(text);
		
	}
}
