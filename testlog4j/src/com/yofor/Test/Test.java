package com.yofor.Test;

import org.apache.log4j.Logger;

public class Test {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class);
		logger.debug("这是一个调试信息");
		logger.info("普通信息1111111");
		
		try {
			int i = 5/0;
		} catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		System.out.println("结束");
		System.out.println("分支test");
	}
	

}
