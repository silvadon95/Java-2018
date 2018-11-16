package lab03CopyBytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBytes {

	public static void main(String[] args) {
		String inputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\input1.txt";
		
		String outputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\output03.txt";
		
		try (InputStream fis = new FileInputStream(inputPath);
			 OutputStream fos = new FileOutputStream(outputPath)) {
			int oneByte = fis.read();
			int asciiCodeSpace = 32;
			int asciiCodeNewLine = 10;
			
			while (oneByte >= 0) {
				if (asciiCodeNewLine == oneByte || asciiCodeSpace == oneByte) {
					fos.write(oneByte);
				} else { 
					char[] characters = String.valueOf(oneByte).toCharArray();
					
					for (char c : characters) {
						fos.write(c);
					}
				}
				
				oneByte = fis.read();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
