package com.previous;

/*
 * 	�ڲ���
 * 
 * 	�����ڲ���
 * 	ǰ�᣺����һ������߽ӿ�
 * 	���ʣ���һ���̳и������ʵ���˸ýӿڵ�������������
 * 
 * 
 */
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner1 inner1 = new Outer().new Inner1();	//�����ڲ������
		inner1.print();
		
		Outer outer = new Outer();
		outer.print();
		
		//�ⲿ����.�ڲ����� ������ = �ⲿ����.�ڲ������
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		
		Outer.Inner3.method();
		
		outer.method();
	}

}

class Outer{
	class Inner1{
		public void print() {
			System.out.println("�����ڲ���");
		}
	}
	
	private class Inner2{
		public void print() {
			System.out.println("����˽���ڲ���");
		}
	}
	
	public void print() {
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	static class Inner3{
		public void print() {
			System.out.println("���Ǿ�̬�ڲ���");
		}
		
		public static void method() {
			System.out.println("���Ǿ�̬�ڲ���ľ�̬����");
		}
	}
	
	public void method() {
		new InterDemo() {	//ʵ��Inter�ӿ�
			public void print() {
				//��д�ӿڳ��󷽷�
				System.out.println("���������ڲ����һ������");
			}
			
		}.print();
	}
	
	
}

interface InterDemo{
	public void print();
//	public void print2();	�෽������ʹ�������ڲ��� 
}

