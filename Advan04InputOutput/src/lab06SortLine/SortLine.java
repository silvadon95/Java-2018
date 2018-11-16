package lab06SortLine;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLine {

	public static void main(String[] args) {
		String inputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\input.txt";
		
		String outputPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\output06.txt";
		
		Path inPath = Paths.get(inputPath);
		Path outPath = Paths.get(outputPath);
		
		try (BufferedReader reader = Files.newBufferedReader(inPath);
			 PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))){
			
			List<String> lines = Files.readAllLines(inPath);
			
			Collections.sort(lines);
			// they do the same thing
			//lines.sort(Comparator.naturalOrder());
			//lines.sort(String::compareTo);
			//lines.sort((a, b) -> { return a.compareTo(b); });
			
			Files.write(outPath, lines);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
