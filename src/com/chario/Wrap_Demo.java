package com.chario;
/*
 * 装饰设计模式
 */
public class Wrap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperStudent student = new SuperStudent(new Student());
		student.code();
	}

}

interface Coder{
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("C");
		System.out.println("javase");
	}
	
}

class SuperStudent implements Coder{
	
	//想对学生进行包装
	private Student s;					//获取学生对象
	
	public SuperStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void code() {
		// TODO Auto-generated method stub
		s.code(); 						//学生本身具有的
		System.out.println("javaweb");	//升级原有的功能
		System.out.println("ssh");
		System.out.println("SQL");
	}
	
}