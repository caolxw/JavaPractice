package com.thread;
/*
 * �����߳�
 * 	join ��ǰ�߳�չ�����ȴ�ָ�����߳�ִ�н����󣬵�ǰ�߳��ټ���
 */
public class Join_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		final Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<30; i++) {
					System.out.println(this.getName() + "...aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<20; i++) {
					if (i== 2) {
						try {
//							t1.join();						//�����ڲ���ʹ���ⲿ���� Ҫ�����������final
							t1.join(1);						//���ָ��ʱ�� ����ʱ��������߳̽���ִ��
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(this.getName() + "...bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
