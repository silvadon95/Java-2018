package lab08NestedFolders;

import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {

	public static void main(String[] args) {
		String rootDirectoryPath = "C:\\Users\\Silva Donikian\\Desktop\\JavaADV"
				+ "\\eclipse-workspace\\Advan04InputOutput\\resources\\Files-and-Streams";
		
		File rootDir = new File(rootDirectoryPath);
		
		File[] files = rootDir.listFiles();
		
		if (files == null) {
			return;
		}
		
		ArrayDeque<File> queue = new ArrayDeque<>();
		queue.add(rootDir);
		
		int counter = 1;
		
		while (!queue.isEmpty()) {
			File currentDir = queue.remove();
			
			File[] currentFiles = currentDir.listFiles();
			
			if (currentFiles == null) {
				continue;
			}
			
			for (File file : currentFiles) {
				if (file.isDirectory()) {
					counter++;
					System.out.println(file.getName());
					queue.add(file);
				}
			}
		}
		
		System.out.printf("%d folders", counter);
	}

}
