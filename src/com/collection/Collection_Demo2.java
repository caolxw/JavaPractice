package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 	���ϵı���
 */
public class Collection_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		System.out.println("----demo1 end----");
		
		demo2();
		System.out.println("----demo2 end----");
	}

	public static void demo2() {
		//������������
		Collection<Student> collection = new ArrayList<>();
		collection.add(new Student("����",20));			//������������
		collection.add(new Student("��һ",21));
		collection.add(new Student("�Ŷ�",18));
		collection.add(new Student("����",20));
		
		Object[] arr = collection.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			Student student = (Student)arr[i];			//����ת��
			System.out.println(student.getName()+" "+student.getAge());
		}
	}

	public static void demo1() {
		Collection collection = new ArrayList<>();
		collection.add("a");
		collection.add("b");
		collection.add("c");
		collection.add("d");
		
		Object[] arr = collection.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

class Student{
	private String name;
	private int age;
	
	public Student() {}
	public Student(String name,int age) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
	
	
}
