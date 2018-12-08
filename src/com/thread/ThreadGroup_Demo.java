package com.thread;
/*
 * 线程组
 * 	可以进行整租设置
 */
public class ThreadGroup_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		//创建新的线程组
		ThreadGroup tGroup = new ThreadGroup("我是一个新的线程组");
		MyRunnable mRunnable = new MyRunnable();
		
		//将线程放入线程组
		Thread t1 = new Thread(tGroup, mRunnable, "Sam");
		Thread t2 = new Thread(tGroup, mRunnable, "Jack");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

	}

	public static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "Sam");
		Thread t2 = new Thread(mr,"Jack");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());			//默认为主线程
		System.out.println(tg2.getName());
	}

}
