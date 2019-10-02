package com.logger;

/**
 * A message data to capture all the information that will be logged by service.
 * 
 */
public class Message {
	
	private Exception cause;
	
	private String message;
	
	private Object[] messageParameters;
	
	public Message() { }
	
	public Message(String message, Object[] messageParameters) {
		this(null,message,messageParameters);
	}
		
	public Message(Exception cause, String message, Object[] messageParameters) {
		this.cause = cause;
		this.message = message;
		this.messageParameters = messageParameters;
	}
	
	public String getFormatedMessage() {
        return String.format(message, messageParameters);
    }

	public Exception getCause() {
		return cause;
	}

	public void setCause(Exception cause) {
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object[] getMessageParameters() {
		return messageParameters;
	}

	public void setMessageParameters(Object[] messageParameters) {
		this.messageParameters = messageParameters;
	}

}
