package com.thread;
/*
 * �ȴ����ѻ���
 * 	wait()  Notify()
 * 
 * ע�����⣺
 * ����ͬ��������У���ʲô����������ͬһ���������wait����
 * ��Ϊʲôwait������notify����������Object������
 * 		��Ϊ������������������Object��������Ļ���
 * ��sleep������wait����������
 * 		sleep�������봫ȥ������������ʱ�䣬ʱ�䵽���Զ�����
 * 		wait�������Գ������Ҳ���Բ����������������������ڲ�����ʱ�������ȴ��������������ֱ�ӵȴ�
 * 		sleep������ͬ��������ͬ��������У����ͷ�����˯����Ҳ������
 * 		wait������ͬ��������ͬ��������У��ͷ���
 * 
 */
public class Notify_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer3 printer = new Printer3();
		
		
//		demo1(printer);
		
		/*
		 * �����߳�֮���ͨ��
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
		 * �����߳�֮���ͨ��
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
//			if(flag != 1) {						//��ǰ�̵߳ȴ�
			while(flag != 1) {
				this.wait();					//whileѭ����ÿ�ζ����жϱ��
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 2;
//			this.notify(); 				//������ѵ����ȴ��߳�
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