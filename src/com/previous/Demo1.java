package com.previous;
/*
 * ��̬�����
 */

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.show();
		
		Student stu2 = new Student("����",20);
		stu2.show();
	}
	
	static {
		//��̬����飬��mian����֮ǰ���С�
		System.out.println("�����������еľ�̬����飡");
	}

}

class Student{
	String name;
	int age;
	
	public Student() {}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι��죺"+name+" "+age);
	}
	
	{
		//����飬���ڹ��캯��֮ǰ����
		study();
	}
	
	static {
		//��̬����飬�ڴ����֮ǰ���У�����ֻ����һ�Ρ�
		System.out.println("Student�еľ�̬����飡");
	}
	
	public void study() {
		System.out.println("ѧ����ѧϰ...");
	}
	
	public void show() {
		System.out.println(name+" "+age);
	}
}
