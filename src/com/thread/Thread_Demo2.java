package com.thread;
/*
 * ����
 * 	�̳�Thread ����������д��Thread���run()��������start()ʱ��ֱ���ҵ������run()����
 * 	ʵ��Runnable ���캯������Runnable�����ã�start()����run()����ʱ�жϳ�Ա����Runnable�Ƿ�Ϊ��
 * 				��Ϊ��ʱ�����뿴Runnable��run()�����п�ʵ��Runnable�������run()����
 * 
 * �Ƚ�
 * 	�̳�Thread 	����ֱ��ʹ��thread���еķ����������
 * 				����Ѿ����˸��࣬�Ͳ��������ַ���
 * 	ʵ��Runnable	��ʹ�Լ�������߳������˸��࣬Ҳ����ʵ�ֽӿ�
 * 				����ֱ��ʹ��Thread�еķ���
 */
public class Thread_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		demo2();
		print(2);
		
		demo3();
		print(3);
		demo4();
		print(4);
	}

	public static void demo4() {
		/*
		 * ���������ڲ���ʵ���߳� ��ʽ2
		 * 	ʵ��Runnable�ӿ� 
		 */
		new Thread(new Runnable() {					//��Runnable��������󴫵ݸ�Thread�Ĺ��췽��
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<1000; i++) {
					System.out.println("ddddddd");
				}
			}
		}).start();									//�����߳�
	}

	public static void demo3() {
		/*
		 * ���������ڲ���ʵ���߳� ��ʽ1
		 * 	�̳�Thread��
		 */
		new Thread() {									//�̳�Thread��
				public void run() {						//��дrun
					for(int i=0; i<1000; i++) {
						System.out.println("ddddddd");
					}
				}
		}.start();										//�����߳�
	}

	public static void demo2() {
		/*
		 *���߳�ʵ�ַ�ʽ2
		 *	ʵ��Runnable�ӿ� 
		 */
		MyRunnable mRunnable = new MyRunnable();
		//Runnable target = mRunnable	
		Thread thread = new Thread(mRunnable);		//���䵱���������ݸ�Thread�Ĺ��캯��
		thread.start();
		for(int i=0; i<1000; i++) {
			System.out.println("bb");
		}
	}

	public static void demo1() {
		/*
		 *���߳�ʵ�ַ�ʽ1
		 *	�̳�Thread��
		 */
		MyThread mThread = new MyThread();
//		mThread.run();						//�����ύ��ִ��
		mThread.start();					//�����߳�
		for(int i=0; i<1000; i++) {
			System.out.println("bb");
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end-----");
	}

}

class MyThread extends Thread{
	
	//��д����run
	public void run() {
		//��Ҫִ�еĴ���д�ڷ�����
		for(int i=0; i<1000; i++) {
			System.out.println("aaaaaa");
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	//��д����run
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++) {
			System.out.println("ccccccc");
		}
	}
	
}