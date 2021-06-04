package ua.lviv.trainapplogos;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class ApplicationTestLog {
	private static Logger LOG = Logger.getLogger(ApplicationTestLog.class);
	
	public static void main(String[] args) {
		LogWithDomConfigurator();
	}
	
	public static void LogWithDomConfigurator() {
		DOMConfigurator.configure("LoggerConfig_file.xml");
		LOG.trace("Some TRACE loger message");
		LOG.debug("Some DEBUG loger message");
		LOG.info("Some INFO loger message");
		LOG.warn("Some WARN loger message");
		LOG.error("Some ERROR loger message");
		LOG.fatal("Some FATAL loger message");
	}
	
	public static void LogWithBasicConfigurator () {
		
	}
}
