package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections������
 * 	˽�й��췽��
 * 
 * public static <T> void sort(List<T> list)
 * public static <T> int binarySearch(List<?> list,T key)
 * public static <T> T max(Collection<?> list)
 * public static void reverse(List<?> list)
 * public static void shuffle(List<?> list)
 */
public class Collections_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		print(3);
	}

	public static void demo3() {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("lalaland");
		list.add("bcd");
		list.add("a");
		list.add("abab");
		System.out.println(list);
		Collections.reverse(list);		//���Ϸ�ת
		System.out.println(list);
		Collections.shuffle(list); 		//����û�  ��������ϴ��
		System.out.println(list);
	}

	public static void demo2() {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("lalaland");
		list.add("bcd");
		list.add("a");
		list.add("abab");
		System.out.println(Collections.max(list));		//����Ĭ�����������һ��Ԫ��
		System.out.println(Collections.min(list));
	}

	public static void demo1() {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("bcd");
		list.add("a");
		list.add("abab");
		list.add("lalaland");
		
		Collections.sort(list);					//��ListԪ�ؽ�������
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "abc"));
		System.out.println(Collections.binarySearch(list, "cde"));
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
