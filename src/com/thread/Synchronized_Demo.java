package com.thread;

public class Synchronized_Demo {
/*
 * 同步代码块
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer p = new Printer();
		
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

class Printer{
	Integer demo = new Integer(10);
	public void print1() {
		synchronized (demo) {			//锁对象是任意的 但是不能是匿名内部类
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("赛");
			System.out.print("高");
			System.out.print("\r\n");
		}
	}
		
	public void print2() {
		synchronized (demo) {
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
