package io.rahul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/yay")
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(method = RequestMethod.GET)
	public void sayHello() {
		this.print();
	}

	private void print() {
		System.out.println("logger.isDebugEnabled() : " + logger.isDebugEnabled());
		System.out.println("logger.isErrorEnabled() : " + logger.isErrorEnabled());
		for (int i = 0; i < 100; i++) {
			logger.debug("Hello dude " + i);
		}
	}

}
