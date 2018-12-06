package com.thread;

public class Synchronized_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true)
					p.print1();				//在匿名内部类使用外部变量
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					p.print2();				//在匿名内部类使用外部变量
			}
		}.start();
		
	}

}

class Printer2{
	Integer demo = new Integer(10);
	//非静态的同步方法的锁对象是this
	//静态的同步方法的锁对象是该类的字节码对象
	public static synchronized void print1() {			//同步方法只需要加上synchronized关键字
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
		System.out.print("赛");
		System.out.print("高");
		System.out.print("\r\n");
	}
		
	public void print2() {
		synchronized (Printer2.class) {
			System.out.print("F");
			System.out.print("A");
			System.out.print("K");
			System.out.print("E");
			System.out.print("R");
			System.out.print("!");
			System.out.print("\r\n");
		}
		
	}
}