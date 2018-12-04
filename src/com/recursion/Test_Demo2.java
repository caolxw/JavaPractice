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
		 * 约瑟夫环
		 */
		System.out.println(getLuckyNum(10));
	}
	
	public static int getLuckyNum(int num) {
		/*
		 * 获取幸运数字
		 * 1,返回值类型	int
		 * 2,参数列表	int
		 */
		//创建集合，存储1-Num的对象
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=num; i++) {
			list.add(i);
		}
		int count = 1;					//计数器。只要是3的倍数就remove
		
		for(int i=0; list.size() != 1; i++) {
			if (i == list.size()) {
				i = 0;					//如果i增长到集合的索引+1时，重新归0
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
		 * 求出1000的阶乘所有零和尾部零的个数
		 */
		System.out.print("1000的阶乘所有零个数:");
//		demo3();
		demo4();
		//递归的做法
		
		System.out.println("1000的阶乘尾部的零个数:"+demo5());
	}
	
	public static int demo5() {
		//1000尾部的0
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);
		}
		String string = bi1.toString();
		StringBuilder sBuilder = new StringBuilder(string);
		string = sBuilder.reverse().toString();				//链式编程
		
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
			bi1 = bi1.multiply(bi2);				//将bi1与bi2相乘的结果赋值给bi1
		}
		String string = bi1.toString();				//获取字符串表现形式
		int count = 0;								//0字符的计数器
		for(int i=0; i<string.length(); i++) {
			if (string.charAt(i) == '0') {
				count ++;
			}
		}
		System.out.println(count);
	}

	public static void demo3() {
		//非递归做法
		int result = 1;
		for(int i=1; i <= 1000; i++) {
			result = result * i;
		}
		System.out.println(result); 		//因为1000的阶乘超出了int的取值范围,输出为0
	}

	public static void test1() {
		/*
		 * 斐波那契数列
		 */
		System.out.println("斐波那契数列，第8个月有几对兔子：");
		demo1();
		System.out.println(demo2(8));
	}
	
	public static int demo2(int i) {
		//用递归做不死神兔
		if (i == 1 || i ==2) {
			return 1;
		}else {
			return demo2(i -1) + demo2(i - 2);
		}
	}
	public static void demo1() {
		//用数组做不死神兔
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 1;
		//遍历数组并对其他元素赋值
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
	}

}
