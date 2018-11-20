package com.previous;
/*
 * final修饰
 * 
 * final修饰的方法不可以被重写
 * final修饰的类不可以被继承
 * final修饰的变量不可以修改
 */

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int num = 10;
		System.out.println(num);
		final Father person = new Father("张三",20);
		//final修饰的对象不能通过构造函数修改，及不能改变地址值。但是可以修改属性值
		//person = new Father();
		System.out.println(person.getName()+" "+person.getAge());
		
		person.setAge(24);
		person.setName("李四");
		System.out.println(person.getName()+" "+person.getAge());
		
		method(10);
		method(20);
	}
	
	public static void method(final int x) {
		System.out.println(x);
	}

}

class Father{
	private String name;
	private int age;
	
	public Father() {}
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public final void print() {
		System.out.println("父类中final修饰的方法，子类中不可以重写。");
	}
}

class Son extends Father{
	//final修饰的方法不可以被重写
//	public void print() {
//		System.out.println("覆盖功能");
//	}
}
