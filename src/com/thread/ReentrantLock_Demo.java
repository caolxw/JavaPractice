package com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer4 printer4 = new Printer4();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						printer4.print1();
					} catch (InterruptedException e) {
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
						printer4.print2();
					} catch (InterruptedException e) {
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
						printer4.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer4{
	private ReentrantLock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();
	
	private int flag = 1;
	public void print1() throws InterruptedException  {
		lock.lock(); 							//��ȡ��
			if(flag != 1) {
				c1.await();					//whileѭ����ÿ�ζ����жϱ��
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 2;
			c2.signal();
			lock.unlock(); 				//�ͷ���
	}
		
	public void print2() throws InterruptedException {
		lock.lock();
			if(flag != 2) {
				c2.await();
			}
			System.out.print("F");
			System.out.print("A");
			System.out.print("K");
			System.out.print("E");
			System.out.print("R");
			System.out.print("!");
			System.out.print("\r\n");
			flag = 3;
			c3.signal();

		lock.unlock();
		
	}
	
	public void print3() throws InterruptedException {
		lock.lock();
			if(flag != 3) {
				c3.await();
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
			c1.signal();

		lock.unlock();
	}
}
