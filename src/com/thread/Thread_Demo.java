package com.thread;
/*
 * ��֤jvm�Ķ��߳�
 */
public class Thread_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100000; i++) {
			new Demo();							//���������ڲ��ഴ������
		}
		
		for(int i=0; i<100000; i++) {
			System.out.println("�������������");		//���̺߳����������߳�������Դ
		}
	}

}

class Demo{
	public void finalize() {
		System.out.println("������ɨ�����Ĵ���");
	}
}