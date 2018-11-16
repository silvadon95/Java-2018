package problem06MagicExchangeableWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class MagicExchangeableWords {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] words = reader.readLine().split(" ");
		char[] firstW = words[0].toCharArray();
		char[] secondW = words[1].toCharArray();
		Map<Character, Character> magicWords = new LinkedHashMap<>();

		
		if (firstW.length > secondW.length) {
			for (int i = 0; i < secondW.length; i++) {
				
				if (!magicWords.containsKey(firstW[i])) {
					if (!magicWords.containsValue(secondW[i])) {
						magicWords.put(firstW[i], secondW[i]);
					} else {
						System.out.println(false);
						return;
					}
				} else if (magicWords.get(firstW[i]) != secondW[i]){
					System.out.println(false);
					return;
				}
				
			}
			
			for (int i = secondW.length; i < firstW.length; i++) {
				if (!magicWords.containsKey(firstW[i])) {
					System.out.println(false);
					return;
				}
			}
		} else {
			for (int i = 0; i < firstW.length; i++) {
				
				if (!magicWords.containsKey(firstW[i])) {
					if (!magicWords.containsValue(secondW[i])) {
						magicWords.put(firstW[i], secondW[i]);
					} else {
						System.out.println(false);
						return;
					}
				} else if (magicWords.get(firstW[i]) != secondW[i]){
					System.out.println(false);
					return;
				}
			}
			
			for (int i = firstW.length; i < secondW.length; i++) {
				if (!magicWords.containsValue(secondW[i])) {
					System.out.println(false);
					return;
				}
			}
		}
		
		System.out.println(true);
	}
}
