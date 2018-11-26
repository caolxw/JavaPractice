package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * 增强for循环
 * 底层依赖的是迭代器（Iterator）
 * 
 * 三种循环
 * for循环		可以删除，通过索引删除元素
 * Iterator 	可以删除，需要用自带的remove方法
 * foreach循环  	 不可以删除
 */
public class Foreach_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		print(1);
		demo2();
		print(2);
		
		demo3();
		print(3);
		
		demo4();
		print(4);
		
		demo5();
		print(5);

	}

	public static void demo5() {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		list.add(9);
		list.add(13);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if (iterator.next() == 9) {
				iterator.remove();				//不能采用集合的修改方法，会产生并发修改异常
			}
		}
		System.out.println(list);
	}

	public static void demo4() {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		list.add(9);
		list.add(13);
		for(int i=0;i<list.size();i++) {
			if (list.get(i) == 9) {
//				list.remove(i);					//连续的要删除的元素会保留一个
				list.remove(i--);
			}
		}
		System.out.println(list);
	} 

	public static void demo3() {
		//自定义对象遍历
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("张三",24));
		list.add(new Student("李四",22));
		list.add(new Student("王麻子",22));
		list.add(new Student("岳老三",21));
		list.add(new Student("大河",19));
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public static void demo2() {
		//遍历集合
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static void demo1() {
		//遍历数组
		int[] arr = {20,23,25,27,29,10};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
