package problem04UnicodeCharacter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacter {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String text = reader.readLine();
		StringBuilder unicodeText = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			unicodeText.append("\\u").append(Integer.toHexString(text.charAt(i)|0x10000).substring(1));
		}
		
		System.out.println(unicodeText.toString());
	}

}
