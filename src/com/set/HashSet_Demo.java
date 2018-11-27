package com.set;

import java.util.HashSet;

import com.bean.Person;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
	}

	public static void demo2() {
		HashSet<Person> hSet = new HashSet<>();
		hSet.add(new Person("Sam",24));
		hSet.add(new Person("Sam",24));
		hSet.add(new Person("Jack",24));
		hSet.add(new Person("Jack",22));
		hSet.add(new Person("Jack",22));
		hSet.add(new Person("Rose",19));
		hSet.add(new Person("Jack",22));
		hSet.add(new Person("Lulu",22));
		//System.out.println(hSet);			
		//自定义对象要保证唯一性 需要重写类的HashCode() equals()
		
		for (Person person : hSet) {
			System.out.println(person);
		}
	}

	public static void demo1() {
		HashSet<String> hSet = new HashSet<>();
		boolean b = hSet.add("a");
		boolean b2 = hSet.add("a");				//没有添加进去 返回false
		
		System.out.println(hSet);
		System.out.println(b);
		System.out.println(b2);
		
		hSet.add("b");
		hSet.add("c");
		hSet.add("d");
		hSet.add("efg");
		for (String string : hSet) {
			System.out.println(string);
		}
	}
	
	public static void print(int i) {
		System.out.println("---demo"+i+" end----");
	}

}
