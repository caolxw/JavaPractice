package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection 接口
 * 	添加：public boolean add(E e)
 * 		List当中固定返回true 因为在List集合中可以储存重复元素
 * 		Set当中存储重复元素的时候就会返回false
 * 	删除：public boolean remove(Object obj)
 * 	清空：public void clear() 
 * 	包含：public boolean contains(object o)
 * 	为空：public boolean isEmpty()
 * 	个数：public int size()
 */
public class Collection_Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();					//在AbstractCollection 中重写了toString方法
		System.out.println("----demo1 end----");
		demo2();
		System.out.println("----demo2 end----");
		demo3();
		System.out.println("----demo3 end----");
		demo4();
		System.out.println("----demo4 end----");
	}

	public static void demo4() {
		Collection collection = new ArrayList<>();		//父类引用指向子类对象
		collection.add("abc");							//没有指定泛型 可以添加任意类型的数据
		collection.add(100);
		collection.add(true);
		System.out.println(collection.size());
	}

	public static void demo3() {
		Collection collection = new ArrayList<>();		//父类引用指向子类对象
		collection.add("abc");							//没有指定泛型 可以添加任意类型的数据
		collection.add(100);
		collection.add(true);
		System.out.println(collection.contains(100));
		System.out.println(collection.contains(""));
		System.out.println(collection.isEmpty());
		collection.clear();
		System.out.println(collection.isEmpty());
	}

	public static void demo2() {
		Collection collection = new ArrayList<>();		//父类引用指向子类对象
		collection.add("abc");							//没有指定泛型 可以添加任意类型的数据
		collection.add(100);
		collection.add(true);
		collection.remove(100);
		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
	}

	public static void demo1() {
		Collection collection = new ArrayList<>();		//父类引用指向子类对象
		collection.add("abc");							//没有指定泛型 可以添加任意类型的数据
		collection.add(100);
		collection.add(true);
		
		System.out.println(collection);
	}

}
