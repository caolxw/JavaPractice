package com.thread;

/*
 * 铁路售票，共有100张票，分四个窗口售卖
 */
public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		test1();
		
		test2();
	}

	public static void test2() {
		/*
		 * 实现Runnable接口
		 */
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

	public static void test1() {
		/*
		 * 继承Thread
		 */
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}

class Ticket extends Thread{
	private static int ticket = 100;
	
	public void run() {
		
			while(true) {
				synchronized (Ticket.class) {
					if (ticket == 0) {
						break;
					}
					System.out.println(getName()+"...这是第"+ticket--+"号票");
			}
		}
	}
}

class MyTicket implements Runnable{

	private static int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {
				if (ticket == 0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+"...这是第"+ticket--+"号票");
			}
		}
	
	}
}