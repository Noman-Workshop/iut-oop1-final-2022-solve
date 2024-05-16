package org.example.ques3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private static Logger instance;
	private PrintWriter writer;
	private static final String LOG_FILE = "log.txt";
	
	// Message levels
	public static final String DEBUG = "DEBUG";
	public static final String INFO = "INFO";
	public static final String WARNING = "WARNING";
	public static final String ERROR = "ERROR";
	
	// Private constructor to prevent instantiation
	private Logger() {
		try {
			FileWriter fw = new FileWriter(LOG_FILE, true);
			writer = new PrintWriter(fw, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Public method to provide access to the instance
	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}
	
	// Method to log messages
	public void log(String level, String source, String message) {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		writer.println(timestamp + " " + level + " [" + source + "]: " + message);
	}
	
	// Close the writer when done
	public void close() {
		if (writer != null) {
			writer.close();
		}
	}
	
	// Example usage
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		
		logger.log(Logger.DEBUG, "Main", "This is a debug message.");
		logger.log(Logger.INFO, "Main", "This is an info message.");
		logger.log(Logger.WARNING, "Main", "This is a warning message.");
		logger.log(Logger.ERROR, "Main", "This is an error message.");
		logger.close();
	}
}
