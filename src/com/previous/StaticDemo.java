package com.previous;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] args ��ǰ�������ռ���¼��
		Person p1 = new Person();
		p1.name = "��Сƽ";
		//p1.country = "�й�";
		p1.show();
		
		Person p2 = new Person();
		p2.name = "�ܶ���";
		p2.country = "�й�";
		p1.show();
		p2.show();
				
		Person.country = "�ձ�";
		System.out.println(Person.country);//ͨ���������þ�̬����				
		Demo d1 = new Demo();
		d1.print1();//�Ǿ�̬�������Է��ʾ�̬���ԺͷǾ�̬����
		d1.print2();		
	}

}

class Person {
	String name;
	static String country;	//��̬���ԣ�������
	
	public void show() {
		System.out.println(name+"..."+country);
	}
}

class Demo{
	int num1 = 10;;
	static int num2 = 20;
	
	public void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void print2() {
		//System.out.println(num1);	//��̬�ĳ�Ա���������Է��ʷǾ�̬����
		System.out.println(num2);
	}
}
