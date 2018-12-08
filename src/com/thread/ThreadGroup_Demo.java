package com.thread;
/*
 * �߳���
 * 	���Խ�����������
 */
public class ThreadGroup_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		//�����µ��߳���
		ThreadGroup tGroup = new ThreadGroup("����һ���µ��߳���");
		MyRunnable mRunnable = new MyRunnable();
		
		//���̷߳����߳���
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
		
		System.out.println(tg1.getName());			//Ĭ��Ϊ���߳�
		System.out.println(tg2.getName());
	}

}
