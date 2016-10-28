package com.xxl.test;

import org.apache.log4j.Logger;

public class Log4jTest {

	private static Logger log=Logger.getLogger(Log4jTest.class);
	public static void testDebug(){
		log.debug("这是debug");
	}
	public static void testInfo(){
		log.info("这是info");
	}
	public static void testWarn(){
		log.warn("这是warn");
	}
	public static void testError(){
		log.error("这是error");
	}
	public static void testFatal(){
		log.fatal("这是fatal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testDebug();
		testInfo();
		testWarn();
		testError();
		testFatal();
	}

}
