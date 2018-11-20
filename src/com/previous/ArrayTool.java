package com.previous;

/*
 * 	包的手动创建，
 * 	javac -d . name.java
 * 	java 全类名
 */

public class ArrayTool {
	
	private ArrayTool(){}//当一个类里面所有的方法都是静态的，则需要私有构造方法。
	
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void showArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void revArray(int[] arr) {
		for(int i=0;i<arr.length / 2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i];
			arr[arr.length-i] = temp;
		}
	}
	
	/*说明书的制作：
	 * javacdoc -d +路径 -version -author
	 * */
	
}
