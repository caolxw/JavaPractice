package com.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.bean.Person;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
	}

	public static void demo2() {
		/*
		 * 自定义比较器用法
		 * 注意，比较的是键值
		 */
		TreeMap<Person, String> tMap = new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// 通过首字母字典顺序排序
				int num = o1.getName().compareTo(o2.getName());
				return num == 0 ? o1.getAge()-o2.getAge() : num ;
			}
			
		});
		tMap.put(new Person("Sam",10), "China");
		tMap.put(new Person("Jack",10), "USA");
		tMap.put(new Person("Sam",24), "UK");
		tMap.put(new Person("Rose",15), "UK");
		
		Set<Entry<Person, String>> entries = tMap.entrySet();
		for (Entry<Person, String> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void demo1() {
		TreeMap<Person, String> tMap = new TreeMap<>();
		tMap.put(new Person("Sam",10), "China");
		tMap.put(new Person("Jack",10), "Nanjing");
		tMap.put(new Person("Sam",24), "UK");
		tMap.put(new Person("Rose",15), "UK");
		
		Set<Entry<Person, String>> entries = tMap.entrySet();
		for (Entry<Person, String> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
