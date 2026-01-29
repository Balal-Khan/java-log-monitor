import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String path = "sample_logs.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			
			while ((line = reader.readLine()) != null) {
				LogEntry entry = LogParser.parseLine(line);
				
				if (entry == null) {
					System.out.println("Skipping invalid line: " + line);
					continue;
				}
				
				System.out.println(entry);
			}
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}