package com.thread;
/*
 * �������ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ����ʽ������ʽ������
 * 	����ʽ���ռ任ʱ��	���߳�ʱ���ᴴ���������
 * 	����ʽ��ʱ�任�ռ�	���߳�ʱ���ܻᴴ���������
 */
public class Singleton_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
		
		/*Singleton s1 =  Singleton.singleton;		//��Ա������˽�У�����ͨ����������
		Singleton.singleton = null;
		Singleton s2 =  Singleton.singleton;
		//�鿴���������Ƿ�Ϊͬһ������
		System.out.println(s1 == s2);
		*/
		Singleton s1 = Singleton.singleton;
	}

}

/*
 * ����ʽ	���������ַ�ʽ

class Singleton{
	//1��˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	
	//2,�����������
	private static Singleton singleton = new Singleton();
	
	//3�����⹫�����ṩ���ʷ���
	public static Singleton getInstance() {					//��ȡʵ��
		return singleton;
	}
} */

/*
 * ����ʽ,�������ӳټ���ģʽ
 * 	�ڶ��̷߳���ʱ�����ܻᴴ����������а�ȫ����

class Singleton{
	//1��˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	
	//2,����һ������
	private static Singleton singleton;
	
	//3�����⹫�����ṩ���ʷ���
	public static Singleton getInstance() {					//��ȡʵ��
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
} */

class Singleton{
	//1��˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	
	//2,�����������
	public static final Singleton singleton = new Singleton();
	
}