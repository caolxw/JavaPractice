package com.thread;

public class Name_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		Thread_Demo2.print(1);
		
		
		demo2();
		Thread_Demo2.print(2);
	}

	public static void demo2() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"=dddd");	//��ȡ��ǰ����ִ�е��߳�Thread.currentThread()
			}
		}).start();
		
		//���̵߳�����
		Thread.currentThread().setName("�������߳�");	 			//�������̵߳�����
		System.out.println(Thread.currentThread().getName());
	}

	public static void demo1() {
		new Thread() {								//�̳�Thread��
			public void run() {						//��дrun
						System.out.println(this.getName()+"=aaaa");
				}
		}.start();
	
		new Thread("ܽ�ؽ��") {						//ͨ�����췽��Ϊ�߳�����
			public void run() {						//��дrun
					System.out.println(this.getName()+"=bbbb");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("���");
				System.out.println(this.getName()+"=cccc");
			}
		}.start();
	}

}
