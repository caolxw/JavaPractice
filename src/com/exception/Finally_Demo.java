package com.exception;
/*
 * finally
 * 
 * final	修饰类（不能被继承），修饰方法（不能被重写），修饰变量（只能赋值一次）
 * finally	不能单独使用，只能和try...catch...结合使用，用于释放资源
 * finalize	一个方法
 */
public class Finally_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println((double)1 / 10);
			System.out.println(10 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			System.exit(0); 						//会直接退出jvm虚拟机，不会执行finally
			return;									//return语句会再finally执行完之后再执行
		}finally {
			System.out.println("看看我执行了吗？");		//一定会执行
		}
	}

}
