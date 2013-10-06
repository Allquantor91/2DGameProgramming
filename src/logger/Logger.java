package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import config.ConfigEntity;
import config.Configuration;

/**
 * Used for logging in a specified logfile can log errors or debugs
 * 
 * @author Nils
 * 
 */
public class Logger {

	private final static String loggerFile = "src\\logger\\log.txt";
	private final static String errorFile = "src\\logger\\error.txt";

	public static void error(String msg) {
		try {
			FileWriter fw = new FileWriter(errorFile, true);
			fw.write("ERROR " + getLogTime() + " " + msg + "\n");
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	public static void debug(String msg) {
		try {
			FileWriter fw = new FileWriter(loggerFile, true);
			fw.write("DEBUG " + getLogTime() + " " + msg + "\n");
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
	public static void log(String msg) {
		try {
			FileWriter fw = new FileWriter(loggerFile, true);
			fw.write("LOG " + getLogTime() + " " + msg + "\n");
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	/**
	 * prints the configuration in the logfile
	 * mostly debugpurposes
	 * @author Nils
	 */
	public static void logConfiguration(){
		Logger.log("width="+Configuration.width);
		Logger.log("height="+Configuration.height);
		Logger.log("fullScreen="+Configuration.fullScreen);
		for(ConfigEntity ce : Configuration.configEntities){
			Logger.log("ConfigEntity="+ce.getName()+" with Color"+ce.getColor());
		}
	}
	
	/**
	 * gets the current time as string formated by MM/dd/yyyy HH:mm:ss
	 * 
	 * @return reportDate
	 * @link Source
	 *       http://stackoverflow.com/questions/5683728/convert-java-util-
	 *       date-to-string
	 */
	private static String getLogTime() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		return reportDate;
	}
}
