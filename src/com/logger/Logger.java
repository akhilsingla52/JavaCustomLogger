package com.logger;

/**
 * A convenient wrapper entry class to this logging package. This is used
 * so user do not need to import many classes and methods provided here is more
 * easier to use.
 * 
 */
public class Logger {
	
	public static Log log;
	
	public Logger() {}
	
	public static Logger getLogger(Class<?> loggerClass) {
		log = new CustomLogger(loggerClass);
		return new Logger();
	}
	
	public void error(Exception cause, String message, Object... messageParameters) {
		log.error(new Message(cause, message,messageParameters));
	}
	
	public void warn(String message, Object... messageParameters) {
		log.warn(new Message(message,messageParameters));
	}
	
	public void info(String message, Object... messageParameters) {
		log.info(new Message(message,messageParameters));
	}
	
	public void debug(String message, Object... messageParameters) {
		log.debug(new Message(message,messageParameters));
	}
	
	public void trace(String message, Object... messageParameters) {
		log.trace(new Message(message,messageParameters));
	}

}
