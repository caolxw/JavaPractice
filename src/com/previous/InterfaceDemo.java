package com.previous;
/*
 * �ӿ�
 * 	�ӿ��е����з������ǳ����
 * 	�ӿڲ��ܱ�ʵ����
 * 
 *��Ա����	ֻ���ǳ���	�����Ǿ�̬�����ģ�public static final)
 *���췽��	�ӿ�û�й��췽��
 *��Ա����	ֻ���ǳ��󷽷�	(public abstract)
 *
 *��ʵ�֣����̳�
 *�ӿ���ӿ�֮����Զ�̳�
 */

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter inter = new Inter_Demo();	//���ö�̬�ĵ��÷��� ʵ�����ӿ�
		inter.print();
	}

}

interface Inter{
	public abstract void print();
}

class Inter_Demo implements Inter{
	
	public Inter_Demo() {}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����ʵ�ֽӿڵ�demo");
	}
	
}