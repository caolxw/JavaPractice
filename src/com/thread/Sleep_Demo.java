package com.thread;
/*
 * 线程休眠
 */
public class Sleep_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		demo1();
		Thread_Demo2.print(1);
		
		demo2();
		Thread_Demo2.print(2);
	}

	public static void demo2() {
		new Thread() {
			public void run() {
				for(int i=20; i>=0; i--) {
					try {									//不可以向上抛异常
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(this.getName()+i);
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i=20; i>=0; i--) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(this.getName()+i);
				}
			}
		}.start();
	}

	public static void demo1() throws InterruptedException {
		for(int i=20; i>=0; i--) {
			Thread.sleep(1000);				//1s = 1000ms
			System.out.println("倒计时："+i);
		}
	}

}
