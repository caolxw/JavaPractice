package com.collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List
 * 	Collection的子接口
 * 	特有方法
 * 	void add(int index,E element) index<=size && index>=0
 * 	E remove(int index)
 *  E get(int index)
 *  E set(int index,E element)
 *  
 *  List 
 *  	查询多：ArrayList
 *  	增删多：LinkedList
 *  	都多： ArrayList
 */
public class List_Demo {

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
	}

	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

	public static void demo4() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(1, "x");					//修改指定位置的元素
		System.out.println(list);
	}

	public static void demo3() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.get(3));	//获得指定索引位置的元素 注意索引异常
		
		//List遍历 通过索引
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	public static void demo2() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object object = list.remove(1);		//删除指定位置的元素 返回元素值
		System.out.println(object);
		System.out.println(list);
		
		list.add(111);
		list.add(222);
		//list.remove(111);					//删除的时候不会自动装箱 把111当作索引
	}

	public static void demo1() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list.add(1,"x");					//在指定位置添加元素 添加是注意索引异常 
		System.out.println(list);
	}

}
