package com.thread;

public class Synchronized_Demo {
/*
 * ͬ�������
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true)
					p.print1();				//�������ڲ���ʹ���ⲿ����
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					p.print2();				//�������ڲ���ʹ���ⲿ����
			}
		}.start();
		
	}

}

class Printer{
	Integer demo = new Integer(10);
	public void print1() {
		synchronized (demo) {			//������������� ���ǲ����������ڲ���
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("��");
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
