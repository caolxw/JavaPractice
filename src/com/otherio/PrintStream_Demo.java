package com.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.bean.Person;

/*
 * 打印流，默认指向控制台
 */
public class PrintStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

	public static void demo2() throws FileNotFoundException {
		/*
		 * 字符流
		 */
		PrintWriter pWriter = new PrintWriter(new FileOutputStream("a.txt"),true);
		pWriter.println(97); 							//自动刷出功能只针对的是println方法
//		pWriter.write(97);								
		pWriter.print(97);								//不能自动刷出
//		pWriter.close();
	}

	public static void demo1() {
		/*
		 * 字节流
		 */
		PrintStream pStream = System.out;
		pStream.println(97);				//底层通过Integer.toString将97装欢为字符串打印
		pStream.write(97);					//查找码表，找到对应的a并打印
		
		Person p1 = new Person("Sam", 20);
		pStream.println(p1); 					//默认调用toString()
		
		Person p2 = null;
		pStream.println(p2);  				//打印引用数据类型，如果是null，就打印null
		pStream.close();
	}

}
