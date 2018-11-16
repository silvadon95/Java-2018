package problem05Palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] text = reader.readLine().split("[ ,.?!]+");
		Set<String> palindromes = new TreeSet<>();
		
		for (int i = 0; i < text.length; i++) {
			if (text[i].length() == 1) {
				palindromes.add(text[i]);
				continue;
			}
			
			for (int j = 0; j < text[i].length()/2; j++) {
				if (text[i].charAt(j) == text[i].charAt(text[i].length() - 1 - j)) {
					palindromes.add(text[i]);
				}
			}
			
		}
		
		System.out.println(palindromes);
	}

}
