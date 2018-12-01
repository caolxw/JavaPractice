package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	读取中文
 */
public class Chinese_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("我读书少，别骗我".getBytes());						//必须要getBytes()
		fos.write("\r\n".getBytes());							//换行
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 字节流读取中文有产生乱码的可能
		 */
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[4]; 								//注意一个中文汉字相当于两个字节
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

}
