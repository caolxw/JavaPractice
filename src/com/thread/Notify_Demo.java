package com.thread;
/*
 * 等待唤醒机制
 * 	wait()  Notify()
 * 
 * 注意问题：
 * ·在同步代码块中，用什么对象锁就用同一个对象调用wait方法
 * ·为什么wait方法和notify方法定义在Object这类中
 * 		因为锁对象可以是任意对象，Object是所有类的基类
 * ·sleep方法和wait方法的区别
 * 		sleep方法必须传去参数，参数是时间，时间到了自动醒来
 * 		wait方法可以出入参数也可以不传入参数，传入参数就是在参数的时间结束后等待，不传入参数就直接等待
 * 		sleep方法在同步函数或同步代码块中，不释放锁，睡着了也抱着锁
 * 		wait方法在同步函数或同步代码块中，释放锁
 * 
 */
public class Notify_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer3 printer = new Printer3();
		
		
//		demo1(printer);
		
		/*
		 * 三个线程之间的通信
		 */
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer.print1();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer.print2();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer.print3();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

	public static void demo1(final Printer3 printer) {
		/*
		 * 两个线程之间的通信
		 */
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer.print1();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer3{
	private int flag = 1;
	public void print1() throws InterruptedException  {
		synchronized (this) {
//			if(flag != 1) {						//当前线程等待
			while(flag != 1) {
				this.wait();					//while循环是每次都会判断标记
			}
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("赛");
			System.out.print("高");
			System.out.print("\r\n");
			flag = 2;
//			this.notify(); 				//随机唤醒单个等待线程
			this.notifyAll();
		}
	}
		
	public void print2() throws InterruptedException {
		synchronized (this) {
//			if(flag != 2) {
			while(flag != 2) {
				this.wait();
			}
			System.out.print("F");
			System.out.print("A");
			System.out.print("K");
			System.out.print("E");
			System.out.print("R");
			System.out.print("!");
			System.out.print("\r\n");
			flag = 3;
//			this.notify();
			this.notifyAll();

		}
		
	}
	
	public void print3() throws InterruptedException {
		synchronized (this) {
//			if(flag != 3) {
			while(flag != 3) {
				this.wait();
			}
			System.out.print("C");
			System.out.print("A");
			System.out.print("p");
			System.out.print("J");
			System.out.print("A");
			System.out.print("C");
			System.out.print("K");
			System.out.print("\r\n");
			
			flag = 1;
//			this.notify();
			this.notifyAll();

		}
	}
}