package com.chario;
/*
 * 递归：方法自己调用自己
 */
public class Recursion_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5!
		 * for 和 递归
		 * 
		 * 递归的弊端：不能调用次数过多，导致栈内存溢出
		 * 递归的好处：不用知道循环的次数
		 * 
		 * 构造方法不可以使用递归调用
		 */
		int result = 1;
		for(int i = 1; i <= 5; i++) {
			result = result * i;
		}
		System.out.println(result);
		
		System.out.println(fun(5));
	}
	
	public static int fun(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n*fun(n-1);
		}
	}

}
