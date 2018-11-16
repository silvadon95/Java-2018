package p8GetFirstOddAndEven;


import java.util.Scanner;

public class GetFirstOddAndEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] input = scanner.nextLine().split(" ");
		String [] values = scanner.nextLine().split(" ");
		
		int n = Integer.parseInt(values[1]);
		String command = values[2];	
		int counter = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (command.equals("odd")) {
				if (Integer.parseInt(input[i]) % 2 == 1) {
					System.out.print(input[i] + " ");
					counter++;
					if (counter == n) {
						break;
					}
				} 
			} else if (command.equals("even")) {
					if (Integer.parseInt(input[i]) % 2 == 0) {
					System.out.print(input[i] + " ");
					counter++;
						if (counter == n) {
						break;
						}	
					}
				}
			}
			
		
		scanner.close();
	}

}
