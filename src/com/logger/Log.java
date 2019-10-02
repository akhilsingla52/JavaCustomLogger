package com.logger;

/**
 * A log service to allow application log different level of messages.
 * 
 */
public interface Log {
	
	public void error(Message message);
	
	public void warn(Message message);
	
	public void info(Message message);
	
	public void debug(Message message);
	
	public void trace(Message message);

}
