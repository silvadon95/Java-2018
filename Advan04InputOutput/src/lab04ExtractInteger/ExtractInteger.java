package lab04ExtractInteger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {

	public static void main(String[] args) {
		String inputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\input.txt";
		
		String outputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\output04.txt";
		
		try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
			 PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))){
			
			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					writer.println(scanner.nextInt());
				}
				
				scanner.next();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
