package com.git.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MessageRunner implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(CommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		int a = 10;
		try {
			logger.info("STARTED");
			System.out.println("WELCOME TO SPRING BOOT APP!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			logger.info("ENDED");
	}

}
