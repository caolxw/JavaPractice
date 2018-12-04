package com.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * ByteArrayOuputStream
 * 内存输出流
 * 
 * FileInputStream读取中文的时候，出现了乱码。
 * 解决方案：
 * 1.字符流读取
 * 2.ByteArrayOutputStream
 */
public class ByteArrayOuputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * 定义一个文件输入流。调用read(bety[] b)方法，将a.txt文件中的内容打印出来
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1) {
			baos.write(arr,0,len);
		}
		System.out.println(baos);
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();		//在内存中创建了可以增长的内存数组
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);												//将读取到的数据逐个写到内存中
		}
//		byte[] arr = baos.toByteArray();								//将缓冲区的数据全部存入arr数组
//		System.out.println(new String(arr));
		System.out.println(baos); 										//使用平台默认的编码表
		fis.close();
	}

}
