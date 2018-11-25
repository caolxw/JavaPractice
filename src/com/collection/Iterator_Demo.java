package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 	迭代器 Iterator
 */
public class Iterator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		System.out.println("----demo1 end----");
		
		demo2();
		System.out.println("----demo2 end----");
	}

	public static void demo2() {
		//迭代引用数据类型
		Collection<Student> collection = new ArrayList<>();
		collection.add(new Student("张三",20));
		collection.add(new Student("张一",21));
		collection.add(new Student("张二",18));
		collection.add(new Student("张四",20));
		
		Iterator<Student> iterator = collection.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			
			Student student = (Student)iterator.next();					//数据类型的向下转型
			System.out.println(student.getName()+" "+student.getAge());
		}
	}

	public static void demo1() {
		Collection<String> collection = new ArrayList<>();
		collection.add("abc");
		collection.add("bcd");
		collection.add("cde");
		collection.add("def");
		collection.add("efg");
		collection.add("fgh");
		
		//对集合中的元素迭代
		Iterator<String> iterator = collection.iterator();		//获取迭代器
		while(iterator.hasNext()) {						//判断是否有元素
			System.out.println(iterator.next()); 		//获取元素
		}
	}

}
