package com.set;
import java.util.ArrayList;
import java.util.HashSet;
/*
 * LinkedHashSet
 * 	底层为链表形式，是Set集合中唯一一个能保证怎么存就怎么取的集合对象
 * 	元素唯一
 */
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LinkedHashSet_Demo {

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

	public static void demo4() {
		/*
		 * 	将List集合中的重复元素去掉
		 */
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("a");
		list.add("bcd");
		list.add("abc");
		list.add("a");
		list.add("ab");
		list.add("abc");
		list.add("b");
		list.add("bcd");
		
		System.out.println(list);
		getSingle(list);
		System.out.println(list);
	}
	
	public static <T> void getSingle(List<T> list) {
		LinkedHashSet<T> hSet = new LinkedHashSet<>();
		hSet.addAll(list);
		list.clear();
		list.addAll(hSet);
	}

	public static void demo3() {
		/*
		 * 	使用Scanner从键盘读取一行输入，去掉其中重复的字符，打印出不同的字符。
		 */
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		HashSet<Character> hSet = new HashSet<>();
		for(int i=0;i<string.length();i++) {
			hSet.add(string.charAt(i));
		}
		System.out.println(hSet);
	}

	public static void demo2() {
		/*
		 * 	需求：获取10个1到20的随机数，要求随机数不重复
		 */
		Random random = new Random();
		HashSet<Integer> hSet = new HashSet<>();
		while(hSet.size()<10) {
			hSet.add(random.nextInt(20) + 1);
		}
		System.out.println(hSet);
	}

	public static void demo1() {
		LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
		lHashSet.add("a");
		lHashSet.add("b");
		lHashSet.add("a");
		lHashSet.add("c");
		System.out.println(lHashSet);
	}
	
	public static void print(int i) {
		System.out.println("---demo"+i+" end----");
	}

}
