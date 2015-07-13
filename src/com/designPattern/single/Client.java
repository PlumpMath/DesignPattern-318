package com.designPattern.single;

import java.util.concurrent.CountDownLatch;

public class Client {

	public static void main(String[] args) {
		/*
		 * HungrySingleDemo demo1 = HungrySingleDemo.getInstance();
		 * HungrySingleDemo demo2 = HungrySingleDemo.getInstance();
		 * System.out.println(demo1); System.out.println(demo2);
		 */
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i < 1000000; i++) {
						Object demo = EnumSingleDemo.Instance;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("用时:" + (end - start));
	}
}
