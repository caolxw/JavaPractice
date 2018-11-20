package com.previous;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {33,24,56,7,38,90,12};
		System.out.println(Arrays.toString(arr));		//����ת�ַ���
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));		//����
		
		/*
		 * ���ֲ��ҷ�
		 * Ҫ������Ϊ�����������
		 * ����ֵΪ����ֵ	���key�������в����ڣ�����key�ò����λ��+1�ĸ���
		 */
		System.out.println(Arrays.binarySearch(arr, 24));
		System.out.println(Arrays.binarySearch(arr, 80));
		System.out.println("------------");
		
		/*
		 *  int -> String
		 */
		int i = 10;
		String string = i+"";		//ͨ�����"";
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
		
		Integer integer3 = 100;						//�Զ�װ�䣬�ѻ�����������ת���ɶ���
		int z = integer3 + 200;
		System.out.println(z); 						//�Զ����䣬�Ѷ���ת���ɻ����������ͣ�JDK5�������ԣ�
		System.out.println("----------");
		
		/*
		 * -128 - 127��byte��ȡֵ��Χ����������ȡֵ��Χ֮�ڣ��Զ�װ�䲻�ᴴ���µĶ��󣬶��Ǵӳ������л�ȡ
		 */
		Integer integer4 = 127;
		Integer integer5 = 127;
		System.out.println(integer4 == integer5);
		Integer integer6 = 128;
		Integer integer7 = 128;
		System.out.println(integer6 == integer7);
	}

}
