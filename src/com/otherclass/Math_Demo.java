package com.otherclass;

public class Math_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));		//ȡ����ֵ
		
		/*
		 * ceil �컨��
		 * 
		 * 13.0
		 * 12.3
		 * 12.0
		 * 
		 * ����ȡ����������doubleֵ
		 */
		System.out.println("---����ȡ��---");
		System.out.println(Math.ceil(12.3));
		System.out.println(Math.ceil(12.8));
		System.out.println("---����ȡ��---");
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.8));
		System.out.println("---ȡ��ֵ---");
		System.out.println(Math.max(10, 11));		//�����еĽϴ�ֵ
		System.out.println("---������---");
		System.out.println(Math.pow(2, 3));			//2��3�η�
		System.out.println("---���������---");
		System.out.println(Math.random()); 			//����[0-1��֮������С��
		System.out.println("---��������---");
		System.out.println(Math.round(13.2f));
		System.out.println(Math.round(13.8f));
		System.out.println("---����---");
		System.out.println(Math.sqrt(4));
		
	}

}
