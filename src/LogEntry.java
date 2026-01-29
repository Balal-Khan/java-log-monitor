public class LogEntry {
	public final String timestamp;
	public final String system;
	public final String level;
	public final String message;
	
	public LogEntry(String timestamp, String system, String level, String message){
			this.timestamp = timestamp;
			this.system = system;
			this.level = level;
			this.message = message;
	}
	
	@Override
	public String toString() {
		return "LogEntry{" +
				"timestamp='" + timestamp + '\'' +
				", system='" + system + '\'' + 
				", level='" + level + '\'' +
				", message='" + message + '\'' +
				'}';
	}
}