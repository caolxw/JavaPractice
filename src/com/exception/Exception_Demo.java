package com.exception;

import com.bean.Person;

/*
 * 	编译时异常：
 * 	运行时异常：RuntimeException类及其子类的实例
 * 
 * 	异常处理机制
 * 	第一种：try...catch...finally处理机制
 * 			try(检测异常)
 * 			catch(捕获异常)
 * 			finally(释放资源)
 * 	第二种：throws
 * 
 * 	安卓，客户端开发，try{}catch(Exception e){}
 * 	ee,服务端开发，一般都是底层开发，异常从底层往上抛
 * 
 * 	JDK7如何处理多个异常：
 * 			 catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
 */
public class Exception_Demo {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		print(3);
	}

	public static void demo3() throws Exception {
		/*
		 * 	抛出异常的处理方式
		 */
		Person person = new Person();
		person.setAge(-17);
		System.out.println(person.getAge());
	}

	public static void demo2() {
		/*
		 * try...catch处理多个异常
		 */
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		try {
//			System.out.println(a / b);			//ArithmeticException
//			System.out.println(arr[10]);		//ArrayIndexOutOfBoundsException
			arr = null;
			System.out.println(arr[0]);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为0");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("索引越界了");
		}catch (Exception e) {					//小的异常放前面 大的异常放后面
			// TODO: handle exception
			System.out.println("出错了");
		}
	}

	public static void demo1() {
		Demo demo = new Demo();
		try {
			System.out.println(demo.div(10, 10));
			System.out.println(demo.div(10, 0));
		}catch (ArithmeticException e) {		//ArithmeticException e = new ArithmeticException()
			// TODO: handle exception
			System.out.println("出错了 除数为0");
		}
		//try...catch执行完之后，程序会继续执行
		System.out.println("我在try...catch之后打印的。");
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}

class Demo{
	/*
	 * 	除法运算
	 */
	public int div(int a,int b) {
		return a / b;
	}
}