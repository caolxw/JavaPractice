package com.list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	����ȥ��ArrayList���ظ���Ԫ��
 * 	�������������һ���µļ���
 */
public class List_Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList<>();
		
		//������������
		aList.add("java");
		aList.add("C");
		aList.add("java");
		aList.add("python");
		aList.add("C");
		aList.add("java");
		aList.add("Ruby");
		aList.add("python");
		System.out.println(aList);
		aList = getSingle(aList);
		System.out.println("ȥ���ظ�Ԫ��֮��"+aList);
		
		aList.clear();
		
		//������������  ��Ҫ�����õ��൱����дequals����
		aList.add(new Student("����",24));
		aList.add(new Student("����",23));
		aList.add(new Student("����",23));
		aList.add(new Student("����",23));
		aList.add(new Student("����",23));
		aList.add(new Student("����",23));
		aList.add(new Student("������",23));
		
		System.out.println(aList);
		aList = getSingle(aList);
		System.out.println(aList);
		
		//�Զ����ӡ����
		Iterator<Student> iterator = aList.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getName()+"..."+student.getAge());
		}
	}
	
	/*
	 * 	ͨ�������¼�����ȥ��ArrayList������ظ�Ԫ��
	 * 	1.����ֵ���ͣ�ArrayList
	 * 	2.�����б�ArrayList
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList getSingle(ArrayList aList) {
		ArrayList newList = new ArrayList<>();
		Iterator iterator = aList.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if(!newList.contains(object)) {					//contains �������ײ���������equals��������remove����Ҳ��һ����
				newList.add(object);
			}
		}
		return newList;
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
	
	//��д����
	public boolean equals(Object anObject) {
		
		Student student = (Student)anObject;
		
		return this.name.equals(student.name) && this.age == student.age;
	}
	
	
}
