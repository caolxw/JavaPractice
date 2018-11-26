package com.list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	需求：去除ArrayList中重复的元素
 * 	解决方案：创建一个新的集合
 */
public class List_Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList<>();
		
		//基本数据类型
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
		System.out.println("去除重复元素之后："+aList);
		
		aList.clear();
		
		//引用数据类型  需要在引用的类当中重写equals方法
		aList.add(new Student("张三",24));
		aList.add(new Student("张三",23));
		aList.add(new Student("张三",23));
		aList.add(new Student("张三",23));
		aList.add(new Student("李四",23));
		aList.add(new Student("李四",23));
		aList.add(new Student("岳老三",23));
		
		System.out.println(aList);
		aList = getSingle(aList);
		System.out.println(aList);
		
		//自定义打印类型
		Iterator<Student> iterator = aList.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getName()+"..."+student.getAge());
		}
	}
	
	/*
	 * 	通过创建新集合来去除ArrayList里面的重复元素
	 * 	1.返回值类型：ArrayList
	 * 	2.参数列表：ArrayList
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList getSingle(ArrayList aList) {
		ArrayList newList = new ArrayList<>();
		Iterator iterator = aList.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if(!newList.contains(object)) {					//contains 方法，底层依赖的是equals方法。（remove方法也是一样）
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
	
	//重写方法
	public boolean equals(Object anObject) {
		
		Student student = (Student)anObject;
		
		return this.name.equals(student.name) && this.age == student.age;
	}
	
	
}
