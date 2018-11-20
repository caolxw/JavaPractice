package com.previous;
/*
 * 静态代码块
 */

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.show();
		
		Student stu2 = new Student("张三",20);
		stu2.show();
	}
	
	static {
		//静态代码块，在mian函数之前运行。
		System.out.println("我是主方法中的静态代码块！");
	}

}

class Student{
	String name;
	int age;
	
	public Student() {}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造："+name+" "+age);
	}
	
	{
		//代码块，会在构造函数之前运行
		study();
	}
	
	static {
		//静态代码块，在代码块之前运行，并且只运行一次。
		System.out.println("Student中的静态代码块！");
	}
	
	public void study() {
		System.out.println("学生在学习...");
	}
	
	public void show() {
		System.out.println(name+" "+age);
	}
}
