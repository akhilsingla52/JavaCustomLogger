package com.logger;

public enum Level {

	INFO("INFO"), DEBUG("DEBUG"), TRACE("TRACE"), WARN("WARN"), ERROR("ERROR");
	
	private String name;
	
	Level(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
