package com.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/*
 * Properties
 * 	表示一个持久的属性集
 * 	属性列表中每一个键及其对应值都是一个字符串
 * 	可以作为一个map集合使用
 */
public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		/*
		 * 配置文件的读取
		 */
		Properties prop = new Properties();
		System.out.println("读取前："+prop);
		prop.load(new FileInputStream("config.properties"));
		System.out.println("读取后："+prop);
		prop.setProperty("tel", "19888888888");
		System.out.println("修改后："+prop); 						//查看文件并没有修改
		prop.store(new FileOutputStream("config.properties"), "xxx");	//修改硬盘上的配置文件 第二个参数用来描述文件列表的 如果不描述可以传null
		System.out.println("修改文件后："+prop);
	}

	public static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "Sam");
		prop.setProperty("tel", "19812345678");
//		System.out.println(prop);
		//遍历
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
			String key = en.nextElement();			//获取每一个键
			String value = prop.getProperty(key);	//根据键获取值
			System.out.println(key+":"+value);
		}
	}

	public static void demo1() {
		Properties prop = new Properties();
		prop.put("abc", 123);
		System.out.println(prop);
	}
	
	public static void print(int i) {
		System.out.println("-----demo"+i+" end-----");
	}

}
