package lab05WriteEveryThirdLine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class WriteEveryThirdLine {

	public static void main(String[] args) {
		String inputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\input.txt";
		
		String outputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\output05.txt";
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader( new FileInputStream(inputPath)));
			 PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))){
			String line = reader.readLine();
			int counter = 1;
			
			while (line != null) {
				if (counter % 3 == 0) {
					writer.println(line);				
				}
				
				counter++;
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
