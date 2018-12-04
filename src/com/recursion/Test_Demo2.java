package com.recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Test_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		Test_Demo.print(1);
		
		test2();
		Test_Demo.print(2);
		
		test3();
		Test_Demo.print(3);
	}

	public static void test3() {
		/*
		 * Լɪ��
		 */
		System.out.println(getLuckyNum(10));
	}
	
	public static int getLuckyNum(int num) {
		/*
		 * ��ȡ��������
		 * 1,����ֵ����	int
		 * 2,�����б�	int
		 */
		//�������ϣ��洢1-Num�Ķ���
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=num; i++) {
			list.add(i);
		}
		int count = 1;					//��������ֻҪ��3�ı�����remove
		
		for(int i=0; list.size() != 1; i++) {
			if (i == list.size()) {
				i = 0;					//���i���������ϵ�����+1ʱ�����¹�0
			}
			if (count % 3 == 0) {
				list.remove(i--);
				count = 0;
			}
			count ++;
		}
		return list.get(0);
		
	}
	public static void test2() {
		/*
		 * ���1000�Ľ׳��������β����ĸ���
		 */
		System.out.print("1000�Ľ׳����������:");
//		demo3();
		demo4();
		//�ݹ������
		
		System.out.println("1000�Ľ׳�β���������:"+demo5());
	}
	
	public static int demo5() {
		//1000β����0
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);
		}
		String string = bi1.toString();
		StringBuilder sBuilder = new StringBuilder(string);
		string = sBuilder.reverse().toString();				//��ʽ���
		
		int count = 0;
		for(int i=0; i<string.length(); i++) {
			if ('0' != string.charAt(i)) {
				break;
			}else
				count ++;
		}
		
		return count;
	}
	public static void demo4() {
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);				//��bi1��bi2��˵Ľ����ֵ��bi1
		}
		String string = bi1.toString();				//��ȡ�ַ���������ʽ
		int count = 0;								//0�ַ��ļ�����
		for(int i=0; i<string.length(); i++) {
			if (string.charAt(i) == '0') {
				count ++;
			}
		}
		System.out.println(count);
	}

	public static void demo3() {
		//�ǵݹ�����
		int result = 1;
		for(int i=1; i <= 1000; i++) {
			result = result * i;
		}
		System.out.println(result); 		//��Ϊ1000�Ľ׳˳�����int��ȡֵ��Χ,���Ϊ0
	}

	public static void test1() {
		/*
		 * 쳲���������
		 */
		System.out.println("쳲��������У���8�����м������ӣ�");
		demo1();
		System.out.println(demo2(8));
	}
	
	public static int demo2(int i) {
		//�õݹ�����������
		if (i == 1 || i ==2) {
			return 1;
		}else {
			return demo2(i -1) + demo2(i - 2);
		}
	}
	public static void demo1() {
		//����������������
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 1;
		//�������鲢������Ԫ�ظ�ֵ
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
	}

}
