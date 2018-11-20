package com.previous;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] args 以前用来接收键盘录入
		Person p1 = new Person();
		p1.name = "邓小平";
		//p1.country = "中国";
		p1.show();
		
		Person p2 = new Person();
		p2.name = "周恩来";
		p2.country = "中国";
		p1.show();
		p2.show();
				
		Person.country = "日本";
		System.out.println(Person.country);//通过类名调用静态属性				
		Demo d1 = new Demo();
		d1.print1();//非静态方法可以访问静态属性和非静态属性
		d1.print2();		
	}

}

class Person {
	String name;
	static String country;	//静态属性，对象共享
	
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
		//System.out.println(num1);	//静态的成员方法不可以访问非静态属性
		System.out.println(num2);
	}
}
