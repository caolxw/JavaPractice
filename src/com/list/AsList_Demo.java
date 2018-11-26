package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ����ת���ɼ���
 * ����ת�ɼ��ϲ��������ӣ�ɾ��Ԫ�ء����ǿ���ʹ�ü��ϵ�˼�롣
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
		//����ת���飬�ӷ���
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		Integer[] arr = list.toArray(new Integer[5]);	//������ת������ʱ������ĳ������С�ڵ��ڼ��ϵ�sizeʱ��ת��������鳤���Ǽ��ϵ�size
		for (Integer integer : arr) {					//������ڼ��ϵ�size����������鳤��Ϊ�����ĳ���
			System.out.println(integer);
		}
	}

	public static void demo2() {
		//�����������͵�ת�� �Ὣ�������鵱��һ������
		int[] arr = {11,22,33,44,55};
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);				//�����ֵַ
		
		Integer[] arr2 = {11,22,33,44,55};
		List<Integer> list2 = Arrays.asList(arr2);		//������װ���ɼ��ϣ�������������������
		System.out.println(list2);
	}

	public static void demo1() {
		String[] arr = {"a","b","c","d","efg"};
		List<String> list = Arrays.asList(arr);			//����ת���ɼ���
		System.out.println(list);
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
