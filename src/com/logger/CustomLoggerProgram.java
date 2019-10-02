package com.logger;

public class CustomLoggerProgram {
	private static Logger logger = Logger.getLogger(CustomLoggerProgram.class);

	public static void main(String[] args) {
        try {
            logger.info("Info Logger");
            logger.debug("Debug Logger");
            logger.trace("Trace Logger");
            logger.warn("Warn Logger");
            
            int i = 10/0;
        } catch (Exception e) {
        	logger.error(e, e.getMessage());
            e.printStackTrace();
        }
	}

}
