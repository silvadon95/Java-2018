package lab07ListFiles;

import java.io.File;


public class ListFiles {
	public static void main(String[] args) {
		//String inputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
			//	+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\input.txt";
		
		//String outputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
			//	+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\output06.txt";
		
		String rootDirectoryPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\Files-and-Streams";
		
		//Path inPath = Paths.get(inputPath);
		//Path outPath = Paths.get(outputPath);
		
		File rootDir = new File(rootDirectoryPath);
		
		File[] files = rootDir.listFiles();
		
		if (files == null) {
			return;
		}
		
		for (File file : files) {
			if (!file.isDirectory()) {
				System.out.printf("%s: [%s in bytes]%n", file.getName(), file.length());
			}
		}
	}
}
