package com.previous;
/*
 * 排序算法
 */

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {24,98,67,26,89,77};
//		bubbleSort(arr);
		selectSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println(getIndex(arr, 66));
	}
	
	/*
	 * 冒泡排序
	 * 1，返回值类型：void
	 * 2，参数：int[]
	 * 
	 * 返回递增序列
	 */
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	/*
	 * 选择排序
	 * 1，返回值类型：void
	 * 2,参数：int[]
	 */
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	/*
	 * 二分查找
	 * 1,返回值类型，int (元素对应的索引值)
	 * 2，参数：int[],int 
	 */
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length-1;
		int mid = (min+max) / 2;
		
		while(value!=arr[mid]) {
			if(arr[mid] < value) {
				min = mid+1;
			}else {
				max = mid -1;
			}
			mid = (min + max) / 2;
			if (min>max) {
				return -1;
			}
		}
		return mid;
		
	}
}
