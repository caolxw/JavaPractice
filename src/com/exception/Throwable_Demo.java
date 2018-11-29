package com.exception;
/*
 * Throwable的几个常用方法
 */
public class Throwable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(1 / 0);
		}catch (Exception e) {			//Exception e = new ArithmeticException("/ by zero");
			// TODO: handle exception
			System.out.println(e.getMessage());		//获取异常信息 返回字符串
			System.out.println(e.toString()); 		//获取异常类名和异常信息 返回字符串
			System.out.println(e); 					//自动调用toString()
			e.printStackTrace(); 					//获取异常类名和异常信息 以及异常出现在程序中的位置 
													//jvm默认处理方式
		}
	}

}
