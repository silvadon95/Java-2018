package problem01CountSubstringOccurrences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurrences {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String text = reader.readLine();
		String needle = reader.readLine();
		
		int counter = 0;
		
		for (int i = 0; i < text.length() - needle.length() + 1; i++) {
			if (needle.equalsIgnoreCase(text.substring(i, i + needle.length()))) {
				counter++;
			}
		}
		
		System.out.println(counter);

	}

}
