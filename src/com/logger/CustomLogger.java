package com.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A log service that uses JDK java.util.logging to provide actual logging.
 * 
 */
public class CustomLogger implements Log {
	private static String className;
	
	private static String dateFormat = "YYYY-MM-dd HH:mm:ss";
	
	public CustomLogger(Class<?> loggerClass) {
		className = loggerClass.getName();
	}

	@Override
	public void error(Message message) {
		printLogger(ConsoleColourEnum.RED.getColourCode(), Level.ERROR.getName(), message.getFormatedMessage());
		printException(message.getCause());
	}

	@Override
	public void warn(Message message) {
		printLogger(ConsoleColourEnum.YELLOW.getColourCode(), Level.WARN.getName(), message.getFormatedMessage());
	}

	@Override
	public void info(Message message) {
		printLogger(ConsoleColourEnum.CYAN.getColourCode(), Level.INFO.getName(), message.getFormatedMessage());
	}

	@Override
	public void debug(Message message) {
		printLogger(ConsoleColourEnum.RESET.getColourCode(), Level.DEBUG.getName(), message.getFormatedMessage());
	}

	@Override
	public void trace(Message message) {
		printLogger(ConsoleColourEnum.GREEN.getColourCode(), Level.TRACE.getName(), message.getFormatedMessage());
	}
	
	private static void printLogger(String color, String loggerType, String message) {
		String logger = String
                .format("%-10s %-5s %s \n %-26s %s",
                		LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat)),
                		loggerType, className, "", message);
		System.out.println(color +  logger + ConsoleColourEnum.RESET.getColourCode());
	}
	
	private static void printException(Exception cause) {
		cause.printStackTrace();
	}
}
