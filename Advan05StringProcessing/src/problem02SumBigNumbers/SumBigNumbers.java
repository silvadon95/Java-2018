package problem02SumBigNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumBigNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String firstNum = reader.readLine();
		String secondNum = reader.readLine();
		
		StringBuilder result = new  StringBuilder();
		int overflow = 0;
		
		String smallerNum = firstNum.length() > secondNum.length() ? secondNum : firstNum;
		
		for (int i = 1; i <= smallerNum.length(); i++) {
			String numOne = firstNum.substring(firstNum.length() - i, firstNum.length() - i + 1);
			String numTwo = secondNum.substring(secondNum.length() - i, secondNum.length() - i + 1);
			int digitOne = Integer.parseInt(numOne);
			int digitTwo = Integer.parseInt(numTwo);
			
			result.append((digitOne + digitTwo + overflow) % 10);
			if (digitOne + digitTwo + overflow >= 10) {
				overflow = 1;
			} else {
				overflow = 0;
			}
			
		}
		
		
		
		 for (int i = firstNum.length() > secondNum.length() ?
	                firstNum.length() - secondNum.length() - 1 :
	                secondNum.length() - firstNum.length() - 1; i >= 0; i--) {
			 
	        int digit = Integer.parseInt(firstNum.length() > secondNum.length() ?
	                    firstNum.substring(i, i + 1) :
	                    secondNum.substring(i, i + 1));
			
			result.append((digit + overflow) % 10);
			if (digit + overflow >= 10) {
				overflow = 1;
			} else {
				overflow = 0;
			}
			
		}
		
		if (overflow != 0) {
			result.append(overflow);
		}
		
		while (result.toString().endsWith("0")) {
			result.delete(result.length() - 1, result.length());
		}
		
		System.out.println(result.reverse().toString());

	}

}
