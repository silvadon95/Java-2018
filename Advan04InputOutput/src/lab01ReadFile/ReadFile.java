package lab01ReadFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {

	public static void main(String[] args) {
		String resourceFolder = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\";
		
		String path = resourceFolder + "input.txt";
		
		try (InputStream fis = new FileInputStream(path)) {
			int oneByte = fis.read();
			
			while (oneByte >= 0) {
				System.out.printf("%s ", Integer.toBinaryString(oneByte));
				
				oneByte = fis.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
