package academyGraduation;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, double[]> students = new TreeMap<>();
		
		int studentsCount = Integer.parseInt(scanner.nextLine());
		
		// minus until it's 0
		while (studentsCount-- > 0) {
			String studentName = scanner.nextLine();
			double[] studentGrades = Arrays.stream(scanner.nextLine().split(" "))
					.mapToDouble(Double::parseDouble).toArray();
			
			students.put(studentName, studentGrades);
		}
		
		for (Map.Entry<String, double[]> studentEntry : students.entrySet()) {
			/* same as the below Array.stream....
			double sum = 0;
			for (double v : studentEntry.getValue()) {
				sum += v;
			}
			
			sum /= studentEntry.getValue().length; */
			
			System.out.printf("%s is graduated with %f%n", studentEntry.getKey(), 
					Arrays.stream(studentEntry.getValue()).average());
		}
		
		scanner.close();
	}

}
