package com.previous;
/*
 * �̳й�ϵ
 * �����˽�з������ܱ���д
 * ��������дʱ������Ҫһģһ��
 * 
 * Override ��д ��
 * Overload ���أ���������ͬ�������б�ͬ
 * 
 * ��Ա����
 * ���뿴��ߣ����п����
 * 
 *  ��Ա����
 * ���뿴��ߣ����п��ұ� ��̬��
 * 
 * ��̬����
 * ���뿴��ߣ����п����
 * ��̬������أ�����������������д
 */

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi1 = new Zi();
		zi1.show();
		System.out.println("----------");
		
		Fu fu = new Zi();	//��������ָ��������� ����ת��
		System.out.println(fu.num);
		
		fu.print();	//��̬��
		fu.print1();
		
		Zi zi2 = (Zi)fu;	//����ת��
		zi2.show();
		System.out.println("----------");
		
		method(new Zi());
		method(new Zi2());
	}
	
	//����������ʱ���ö�̬��� ��չ��ǿ
	public static void method(Fu f) {
		f.print2();
	}

}

class Fu{
	public int num = 10;
	public Fu() {
		System.out.println("Fu");
	}
	
	public void print() {
		System.out.println("Father");
	}
	
	public static void print1() {
		System.out.println("Father Static");
	}
	
	public void print2() {
		System.out.println("Father print");
	}
}

class Zi extends Fu{
	public int num = 20;
	public Zi() {
		System.out.println("Zi");
	}
	
	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
	
	public void print() {
		System.out.println("Son");
	}
	
	public static void print1() {
		System.out.println("Son Static");
	}
	
	public void print2() {
		System.out.println("Son1 print");
	}
}

class Zi2 extends Fu{
	public Zi2() {}
	public void print2() {
		System.out.println("Son2 print");
	}
}
