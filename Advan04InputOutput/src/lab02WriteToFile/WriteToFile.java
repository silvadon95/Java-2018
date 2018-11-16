package lab02WriteToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class WriteToFile {

	public static void main(String[] args) {
		String resourceFolder = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\";
		
		String inputPath = resourceFolder + "input.txt";
		String outputPath = resourceFolder + "output02.txt";
		
		Set<Character> punctuation = new HashSet<>();
		Collections.addAll(punctuation, '.', ',', '!', '?');
		
		try (InputStream fis = new FileInputStream(inputPath);
			 OutputStream fos = new FileOutputStream(outputPath)) {
			int oneByte = fis.read();
			
			
			while (oneByte >= 0) {
				if (!punctuation.contains((char) oneByte)) {
					fos.write(oneByte);
				}
				
				oneByte = fis.read();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
