package com.thread;

public class Synchronized_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer2 p = new Printer2();
		
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

class Printer2{
	Integer demo = new Integer(10);
	//�Ǿ�̬��ͬ����������������this
	//��̬��ͬ���������������Ǹ�����ֽ������
	public static synchronized void print1() {			//ͬ������ֻ��Ҫ����synchronized�ؼ���
		System.out.print("��");
		System.out.print("��");
		System.out.print("Ա");
		System.out.print("��");
		System.out.print("��");
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