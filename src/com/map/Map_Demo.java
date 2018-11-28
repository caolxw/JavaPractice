package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import java.util.*;

/*
 * Map是一个接口
 * Map<K,V> 键值K是唯一的.
 * 
 * 基本数据类型包括：byte short int long float double char boolean
 * 	对应的封装类：  Byte	Short Integer Long Float Double Character Boolean
 * 引用数据类型包括：类、接口类型、数组类型、枚举类型、注解类型，字符串型；
 * 
 * 添加：V put(K key,V value) 
 * 		如果是第一次存储，会返回null
 * 删除：	void clear()
 * 		V remove(Object key)	根据键删除值，并把值返回
 * 包含：	boolean containsKey(Object key)
 * 		boolean containsValue(Object value)
 * 		boolean isEmpty()
 * 遍历：没有迭代器，map集合不可以直接迭代。
 * 		V get(key) 通过键获取值
 * 		Set<K> keySet() 获取所有的键值
 */
public class Map_Demo {

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
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(26, 'z');
		map.put(25, 'y');
		
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set当中
		Set<Map.Entry<Integer, Character>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, Character>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			//获取每一个Entry对象
			Map.Entry<Integer, Character> entry = iterator.next();		//父类引用指向子类对象
			int key = entry.getKey();
			char value = entry.getValue();
			System.out.println(key+" = "+value);
		}
		
		//增强for循环
		for (Map.Entry<Integer, Character> entry : entries) {
			System.out.println(entry.getKey()+" ... "+entry.getValue());
		}
	}

	public static void demo4() {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		char c = map.get(1);
		System.out.println(c);		//根据键获取值
		
		//获取所有的键 采用迭代器遍历
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			char ch = map.get(key);
			System.out.println(key +" = "+ch);
		}
		
		//使用增强for循环
		for(int key : keyset) {
			System.out.println(key+" "+map.get(key));
		}
	}

	public static void demo3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Lucy", 22);
		Collection<Integer> collection = map.values();		//拿到所有的value值
		System.out.println(collection);
		System.out.println(map.size());
	}

	public static void demo2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Lucy", 22);
		
		Integer integer = map.remove("Sam");
		System.out.println(integer);
		System.out.println(map);
		System.out.println(map.containsKey("Lucy"));
		System.out.println(map.containsValue(20));
	}

	public static void demo1() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Sam", 19);			//相同的键不存储 值覆盖
		System.out.println(map);
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}
}
