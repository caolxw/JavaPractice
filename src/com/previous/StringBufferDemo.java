package com.previous;
/*
 * StringBuffer
 * 	可变的字符数列
 * 	线程安全	空参构造 初始容量为16个字符
 * 
 *		 * String -> StringBuffer
		 * 构造函数和append()
		 * 
		 * StringBuffer -> String
		 * 构造函数，toString()和subString()
 */

/*
 * StringBuffer  StringBuilder
 * 	安全，效率低		不安全，效率高
 */

/*
 * String类虽然是引用数据类型，但是当作参数传递时和基本数据类型一样，为值传递。
 * StringBuffer类是引用数据类型，当作参数传递时为引用传递
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createdemo();
		print();
		
		appenddemo();
		print();
		
		deletedemo();
		print();
		
		replacedemo();
		print();
		
		substringdemo();
		print();
		
		
	}
	
	/*
	 * 字符串的截取功能
	 */
	public static void substringdemo() {
		StringBuffer sBuffer = new StringBuffer("I'm a white rabbite");
		String string = sBuffer.substring(6);								//返回值为String
		System.out.println(string);
		System.out.println(sBuffer.substring(6, 11));						//含头不含尾
	}
	
	/*
	 * StringBuffer的构造方法
	 */
	public static void createdemo() {
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.length());			//容器中字符个数，实际值
		System.out.println(sBuffer.capacity());			//容器的初始容量，理论值
		
		StringBuffer sBuffer2 = new StringBuffer(10);
		System.out.println(sBuffer2.length());
		System.out.println(sBuffer2.capacity());
		
		StringBuffer sBuffer3 = new StringBuffer("panda");
		System.out.println(sBuffer3.length());
		System.out.println(sBuffer3.capacity()); 		//字符串length+初始容量
	}
	
	/*
	 * StringBuffer 是字符串缓冲区，当new的时候在堆内存创建一个对象
	 * 	当调用添加方法时，不会创建新的对象，在不断向原缓冲区添加字符
	 */
	public static void appenddemo() {
		StringBuffer sBuffer = new StringBuffer();
		StringBuffer sBuffer2 = sBuffer.append(true);
		StringBuffer sBuffer3 = sBuffer.append("panda");
		StringBuffer sBuffer4 = sBuffer.append(100);
		
		/*
		 * StringBuffer 重写了toString()
		 */
		System.out.println(sBuffer);
		System.out.println(sBuffer2);
		System.out.println(sBuffer3);
		System.out.println(sBuffer4);				//以上语句输出均为 truepanda100
		
		sBuffer.insert(4, "加入");
		System.out.println(sBuffer);				//在指定位置添加元素，超出范围会报错
	}
	
	/*
	 * 删除功能
	 */
	public static void deletedemo() {
		StringBuffer sBuffer = new StringBuffer("panda");
		
		sBuffer.deleteCharAt(2);					//删除指定位置的字符
		System.out.println(sBuffer);
		
		sBuffer.delete(0, 2);
		System.out.println(sBuffer); 				//删除后 包含头不含尾
		
		sBuffer.delete(0, sBuffer.length());		//清空缓冲区
		System.out.println(sBuffer);
	}
	
	/*
	 * 替换和反转功能
	 */
	public static void replacedemo() {
		StringBuffer sBuffer = new StringBuffer("I'm a white rabbit.");
		System.out.println(sBuffer.replace(6, 11, "black"));				//替换
		System.out.println(sBuffer.reverse()); 								//反转
	}
	
	public static void print() {
		System.out.println("----------");
	}

}
