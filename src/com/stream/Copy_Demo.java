package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
		*/
		
		demo3();
		FileInputStream_Demo.print(3);
		
		demo4();
		FileInputStream_Demo.print(4);
		
		demo5();
		FileInputStream_Demo.print(5);
	}

	public static void demo5() throws FileNotFoundException, IOException {
		/*
		 * 定义小数组的标准格式
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg",true);
		byte[] arr = new byte[1024 * 8];									//要求1024的整数倍
		int len;
		while((len = fis.read(arr)) == -1) {
			fos.write(arr,0,len);
		}
		fos.close();
		fis.close();
	}

	public static void demo4() throws FileNotFoundException, IOException {
		/*
		 * 拷贝文件的推荐写法
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg",true);
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) == -1) {
			fos.write(arr,0,len);
		}
		fos.close();
		fis.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		/*
		 * 第三种拷贝
		 * 定义小数组
		 */
		FileInputStream fis = new FileInputStream("src\\com\\bean\\Person.java");
		byte[] arr = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		for (byte b : arr) {
			System.out.println(b);													//获取到文件的前两个字节
		}
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * 不推荐使用，可能会导致内存溢出
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int len = fis.available();									//一次获取输入流的所有字节
		
		byte[] arr = new byte[fis.available()];						//创建和文件一样大小的字节数组
		fis.read(arr);												//将文件内容读到byte[]
		fos.write(arr); 											//将字节数组的数据写入拷贝文件中
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 第一种拷贝方式 效率较低
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		int b;
		while ((b = fis.read())!=-1) {
			fos.write(b);
		}
		
		fos.close();
		fis.close();
	}

}
