package com.previous;
/*
 * StringBuffer
 * 	�ɱ���ַ�����
 * 	�̰߳�ȫ	�ղι��� ��ʼ����Ϊ16���ַ�
 * 
 *		 * String -> StringBuffer
		 * ���캯����append()
		 * 
		 * StringBuffer -> String
		 * ���캯����toString()��subString()
 */

/*
 * StringBuffer  StringBuilder
 * 	��ȫ��Ч�ʵ�		����ȫ��Ч�ʸ�
 */

/*
 * String����Ȼ�������������ͣ����ǵ�����������ʱ�ͻ�����������һ����Ϊֵ���ݡ�
 * StringBuffer���������������ͣ�������������ʱΪ���ô���
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createdemo();
		print();
		
		appenddemo();
		print();
		
		deletedemo();
		print();
		
		replacedemo();
		print();
		
		substringdemo();
		print();
		
		
	}
	
	/*
	 * �ַ����Ľ�ȡ����
	 */
	public static void substringdemo() {
		StringBuffer sBuffer = new StringBuffer("I'm a white rabbite");
		String string = sBuffer.substring(6);								//����ֵΪString
		System.out.println(string);
		System.out.println(sBuffer.substring(6, 11));						//��ͷ����β
	}
	
	/*
	 * StringBuffer�Ĺ��췽��
	 */
	public static void createdemo() {
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.length());			//�������ַ�������ʵ��ֵ
		System.out.println(sBuffer.capacity());			//�����ĳ�ʼ����������ֵ
		
		StringBuffer sBuffer2 = new StringBuffer(10);
		System.out.println(sBuffer2.length());
		System.out.println(sBuffer2.capacity());
		
		StringBuffer sBuffer3 = new StringBuffer("panda");
		System.out.println(sBuffer3.length());
		System.out.println(sBuffer3.capacity()); 		//�ַ���length+��ʼ����
	}
	
	/*
	 * StringBuffer ���ַ�������������new��ʱ���ڶ��ڴ洴��һ������
	 * 	��������ӷ���ʱ�����ᴴ���µĶ����ڲ�����ԭ����������ַ�
	 */
	public static void appenddemo() {
		StringBuffer sBuffer = new StringBuffer();
		StringBuffer sBuffer2 = sBuffer.append(true);
		StringBuffer sBuffer3 = sBuffer.append("panda");
		StringBuffer sBuffer4 = sBuffer.append(100);
		
		/*
		 * StringBuffer ��д��toString()
		 */
		System.out.println(sBuffer);
		System.out.println(sBuffer2);
		System.out.println(sBuffer3);
		System.out.println(sBuffer4);				//������������Ϊ truepanda100
		
		sBuffer.insert(4, "����");
		System.out.println(sBuffer);				//��ָ��λ�����Ԫ�أ�������Χ�ᱨ��
	}
	
	/*
	 * ɾ������
	 */
	public static void deletedemo() {
		StringBuffer sBuffer = new StringBuffer("panda");
		
		sBuffer.deleteCharAt(2);					//ɾ��ָ��λ�õ��ַ�
		System.out.println(sBuffer);
		
		sBuffer.delete(0, 2);
		System.out.println(sBuffer); 				//ɾ���� ����ͷ����β
		
		sBuffer.delete(0, sBuffer.length());		//��ջ�����
		System.out.println(sBuffer);
	}
	
	/*
	 * �滻�ͷ�ת����
	 */
	public static void replacedemo() {
		StringBuffer sBuffer = new StringBuffer("I'm a white rabbit.");
		System.out.println(sBuffer.replace(6, 11, "black"));				//�滻
		System.out.println(sBuffer.reverse()); 								//��ת
	}
	
	public static void print() {
		System.out.println("----------");
	}

}
