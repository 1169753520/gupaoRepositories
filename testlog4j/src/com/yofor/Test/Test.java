package com.yofor.Test;

import org.apache.log4j.Logger;

public class Test {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class);
		logger.debug("����һ��������Ϣ");
		logger.info("��ͨ��Ϣ1111111");
		
		try {
			int i = 5/0;
		} catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		System.out.println("����");
		System.out.println("��֧test");
	}
	

}
