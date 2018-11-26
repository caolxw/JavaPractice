package com.list;
/*
 * 可变参数
 */
public class ChangeableArgs_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		
	}

	public static void show(int x,int ... arr) {
		System.out.println(x);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void demo1() {
		int[] arr = {20,23,25,27,29,10};
		print(arr);
		print(11,22,33,44,55); 						//底层将传入的参数进行封装
		System.out.println("----------");
		show(10, 11,22,33,44,55);;
	}
	
	public static void print(int ... arr) {			//可变参数就是一个数组
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}
}
