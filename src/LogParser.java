public class LogParser {
	
	// Parses a single CSV line into a LogEntry
	// Format: timestamp,system,level,message
	public static LogEntry parseLine(String line) {
		String[] parts = line.split(",", 4); // limit=4 so message can contain commas later
		
		if (parts.length < 4) {
			return null;
		}
		
		String timestamp = parts[0].trim();
		String system = parts[1].trim();
		String level = parts[2].trim();
		String message = parts[3].trim();
		
		return new LogEntry(timestamp, system, level, message);
	}
}