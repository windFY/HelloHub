package cn.com.onesix.test;


import org.apache.log4j.Logger;

import cn.com.onesix.Sample;

public class TestSample {
	private static Logger logger = Logger.getLogger(TestSample.class);  
	public static void main(String[] args) {
		Sample sample = new Sample("abc","girl");
		logger.info("info---");
		logger.warn("warn---");
		logger.error("error---");
		System.out.println(sample.toString());
	}

}
