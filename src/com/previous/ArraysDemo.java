package com.previous;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {33,24,56,7,38,90,12};
		System.out.println(Arrays.toString(arr));		//数组转字符串
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));		//排序
		
		/*
		 * 二分查找法
		 * 要求数组为已排序的数组
		 * 返回值为索引值	如果key在数组中不存在，返回key该插入的位置+1的负数
		 */
		System.out.println(Arrays.binarySearch(arr, 24));
		System.out.println(Arrays.binarySearch(arr, 80));
		System.out.println("------------");
		
		/*
		 *  int -> String
		 */
		int i = 10;
		String string = i+"";		//通过添加"";
		String string2 = String.valueOf(i);
		
		Integer integer = new Integer(i);
		String string3 = integer.toString();
		
		String string4 = Integer.toString(integer);
		System.out.println(string+" "+string2+" "+string3+" "+string4);
		
		/*
		 * string -> int
		 */
		String string5 = "200";
		Integer integer2 = new Integer(string5);
		int i2 = integer2.intValue();				//String -> Integer ->int
		
		int i3 = Integer.parseInt(string5);
		System.out.println(i2 +" "+i3);				//String -> int
		
		Integer integer3 = 100;						//自动装箱，把基本数据类型转换成对象
		int z = integer3 + 200;
		System.out.println(z); 						//自动拆箱，把对象转换成基本数据类型（JDK5的新特性）
		System.out.println("----------");
		
		/*
		 * -128 - 127是byte的取值范围，如果在这个取值范围之内，自动装箱不会创建新的对象，而是从常量池中获取
		 */
		Integer integer4 = 127;
		Integer integer5 = 127;
		System.out.println(integer4 == integer5);
		Integer integer6 = 128;
		Integer integer7 = 128;
		System.out.println(integer6 == integer7);
	}

}
