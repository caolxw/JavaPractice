package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 数组转换成集合
 * 数组转成集合不可以增加，删除元素。但是可以使用集合的思想。
 */
public class AsList_Demo {

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
		//集合转数组，加泛型
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		Integer[] arr = list.toArray(new Integer[5]);	//当集合转换数组时，数组的长度如果小于等于集合的size时，转换后的数组长度是集合的size
		for (Integer integer : arr) {					//如果大于集合的size，分配的数组长度为给定的长度
			System.out.println(integer);
		}
	}

	public static void demo2() {
		//基本数据类型的转换 会将整个数组当作一个对象
		int[] arr = {11,22,33,44,55};
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);				//输出地址值
		
		Integer[] arr2 = {11,22,33,44,55};
		List<Integer> list2 = Arrays.asList(arr2);		//将数组装换成集合，必须是引用数据类型
		System.out.println(list2);
	}

	public static void demo1() {
		String[] arr = {"a","b","c","d","efg"};
		List<String> list = Arrays.asList(arr);			//数组转换成集合
		System.out.println(list);
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
