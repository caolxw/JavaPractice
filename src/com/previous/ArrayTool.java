package com.previous;

/*
 * 	�����ֶ�������
 * 	javac -d . name.java
 * 	java ȫ����
 */

public class ArrayTool {
	
	private ArrayTool(){}//��һ�����������еķ������Ǿ�̬�ģ�����Ҫ˽�й��췽����
	
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
	
	/*˵�����������
	 * javacdoc -d +·�� -version -author
	 * */
	
}
