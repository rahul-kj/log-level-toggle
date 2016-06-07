package io.rahul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Level;

@RestController
@RequestMapping(value = "/toggle")
public class LogController {

	@RequestMapping(method = RequestMethod.GET)
	public void changeLogLevel() {
		ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory
				.getLogger(Logger.ROOT_LOGGER_NAME);
		if (logger.isDebugEnabled() == true) {
			logger.setLevel(Level.ERROR);
		} else {
			logger.setLevel(Level.DEBUG);
		}
	}

}
