package com.regex;
/*
 * Calender��  �ǳ����ֻ࣬����������
 */

import java.util.Calendar;

public class Calender_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();

	}

	public static void demo2() {
		Calendar calendar = Calendar.getInstance();	
		calendar.add(Calendar.YEAR, 1);					//��ָ���ֶν�����ǰ��������
		
		System.out.println(calendar.get(Calendar.YEAR)+"��"+(calendar.get(Calendar.MONTH)+1)+"��"+calendar.get(Calendar.DAY_OF_MONTH)+"�� "+getWeek(Calendar.DAY_OF_WEEK));

		calendar.set(Calendar.YEAR, 2000);				//�޸�ָ���ֶ�
		System.out.println(calendar.get(Calendar.YEAR)+"��"+(calendar.get(Calendar.MONTH)+1)+"��"+calendar.get(Calendar.DAY_OF_MONTH)+"�� "+getWeek(Calendar.DAY_OF_WEEK));
		
		calendar.set(2000, 8, 8);
		System.out.println(calendar.get(Calendar.YEAR)+"��"+(calendar.get(Calendar.MONTH)+1)+"��"+calendar.get(Calendar.DAY_OF_MONTH)+"�� "+getWeek(Calendar.DAY_OF_WEEK));
	}

	public static void demo1() {
		Calendar calendar = Calendar.getInstance();		//��������ָ���������
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));			//�·� -1
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));	//���еĵڼ���
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		//�ܼ� ����Ϊ1 ����Ϊ7
		
		//��׼���������
		System.out.println(calendar.get(Calendar.YEAR)+"��"+(calendar.get(Calendar.MONTH)+1)+"��"+calendar.get(Calendar.DAY_OF_MONTH)+"�� "+getWeek(Calendar.DAY_OF_WEEK));
	}
	
	/*
	 * �����ڴ洢���н��в��
	 * 1 ����ֵ��String
	 * 2 ������int
	 */
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		return arr[week];
	}

}
