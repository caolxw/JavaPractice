package com.previous;
/*
 * String
 */

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringdemo();
		printline();
		equalsdemo();
		printline();
		indexdemo();
		printline();
		changedemo();
		printline();
		otherdemo();
	}
	
	public static void stringdemo() {
		byte[] arr2 = {97,98,99,100,101,102};
		System.out.println(new String(arr2));
		System.out.println(new String(arr2,2,3));	//截取从编号2开始的3个字符
		
		char[] arr3 = {'a','b','c','d','e','f'};
		System.out.println(new String(arr3));		//把字符数组转换成字符串
		System.out.println(new String(arr3, 3, 3));		
		printline();

		
		//字符串的两种声明方式
		String arr4 = "text";
		System.out.println(arr4);
		String arr5 = new String("text");		//创建两个对象 一个在常量池 一个在堆内存
		System.out.println(arr5);
		System.out.println(arr4==arr5);				//false
		System.out.println(arr4.equals(arr5));		//true
		
		//通过new String构造出来的字符串 ==和equals的比较
		String arr6 = new String("text");
		System.out.println(arr6 == arr5);			//false
		System.out.println(arr5.equals(arr6));		//true
		
		String arr7 = "t"+"e"+"x"+"t";
		String arr8 = "text";						//在编译的时候就把text 就已经存在于常量池当中
		System.out.println(arr7 == arr8);			//true
		System.out.println(arr7.equals(arr8));		//true
		System.out.println(arr7 == arr5); 			//false
		
		String arr9 = "tex";
		String arr10 = "text";
		String arr11 = arr9+"t";
		System.out.println(arr11==arr10); 			//false
	}
	
	/*
	 * String类的判断功能
	 */
	public static void equalsdemo() {
		String s1 = "Wan";
		String s2 = "wan";
		String s3 = "I'm Wan";
		String s4 = "I";
		
		System.out.println(s1.equals(s2));				//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true	不区分大小写
		System.out.println(s3.contains(s2)+" "+s3.contains(s1)); 	//false	true
		System.out.println(s3.startsWith(s4));			//判断是否与传入的字符串开头
		System.out.println(s3.endsWith(s1));			//判断是否与传入的字符串结束
		System.out.println(s3.isEmpty()); 				//判断字符串是否为空
	}
	
	/*
	 * String 类的获取功能
	 */
	public static void indexdemo() {
		String s1 = "别吃了，会胖！别吃了，会胖！别吃了，会胖！";
		System.out.println(s1.length());			//获取字符串中每一个字符的个数
		
		char c1 = s1.charAt(2);
		System.out.println(c1);						//根据索引获取对应位置的字符 超出范围会报错
		
		System.out.println(s1.indexOf("会胖"));		//返回字符/字符串在此字符串中第一次出现的索引位置
		System.out.println(s1.indexOf("会胖", 7));
		System.out.println(s1.lastIndexOf("会胖"));	//返回字符/字符串在此字符串中最后一次出现的索引位置
		
		System.out.println(s1.substring(7));		//从指定索引位置开始截取字符串 到末尾
		System.out.println(s1.substring(7, 18));	//从指定索引位置开始截取字符串到指定索引位置结束 左闭右开
	}
	
	/*
	 * 字符串的转换功能
	 */
	public static void changedemo() {
		String s1 = "abc";
		byte[] arr1 = s1.getBytes();
		for(byte i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		char[] arr2 = s1.toCharArray();				//字符串转换为字符数组
		for(char i:arr2) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		String s2 = String.valueOf(100);			//将100转换成字符串
		System.out.println(s2+100);
		
		ToString_Demo demo = new ToString_Demo(1, "Sam");
		s2 = String.valueOf(demo);					//将对象转换成字符串的时候 调用了toString()
		System.out.println(s2);
		/*
		 * toUpperCase() 转成大写
		 * toLowerCase() 转成小写
		 */
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("def"));		//字符串的拼接 只能是字符串之间的拼接
		System.out.println(s1+"def");				//可以任意类型之间进行拼接
	}
	
	/*
	 * String 其他类
	 */
	public static void otherdemo() {
		String s1 = "I'm a cute panda";
		System.out.println(s1.replace("a", "e"));	//字符串替换
		System.out.println(s1.replace("cute", "smart"));
		
		String s2 = "	panda is so  cute  ";
		System.out.println(s2.trim());				//去除字符串首的空格
		
		String s3 = "I'm A CUTE panda";
		System.out.println(s1.compareToIgnoreCase(s3)); 	//忽略大小写比较字符串的值 返回int
		
	}
	public static void printline() {
		System.out.println("----------");
	}

}
