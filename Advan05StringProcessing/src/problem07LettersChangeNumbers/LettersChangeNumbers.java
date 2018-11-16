package problem07LettersChangeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersChangeNumbers {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split("\\s+");
		double resultTotal = 0;
		
		StringBuilder alphabet = new StringBuilder();
		for (int i = 'a'; i <= 'z'; i++) {
			alphabet.append((char) i);
		}
		
		//A12b s17G
		
		for (int i = 0; i < input.length; i++) {
			String letterBefore = input[i].substring(0, 1);
			String letterAfter = input[i].substring(input[i].length() - 1);
			double number = Double.parseDouble(input[i].substring(1, input[i].length()-1));
			
			double currentResult = 0;
			
			int positionFirstLetter = alphabet.indexOf(letterBefore.toLowerCase()) + 1;
			int positionLastLetter = alphabet.indexOf(letterAfter.toLowerCase()) + 1;
			
			if (Character.isUpperCase(letterBefore.charAt(0))) {
				currentResult = number / positionFirstLetter;

			} else if (Character.isLowerCase(letterBefore.charAt(0))) {
				currentResult = positionFirstLetter * number;
			}
			
			
			
			if (Character.isUpperCase(letterAfter.charAt(0))) {
				currentResult = currentResult - positionLastLetter;

			} else if (Character.isLowerCase(letterAfter.charAt(0))) {
				currentResult = currentResult + positionLastLetter;
			}
			
			resultTotal += currentResult;
			
		}
		
		System.out.printf("%.2f", resultTotal);
	}

}
