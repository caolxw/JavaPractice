package com.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 缓冲区的拷贝
 * 
 * Buffered和小数组的比较
 * 如果是相同的字节数，小数组会更快，因为小数组是在一个数组中进行操作。Buffered有两个数组。
 */
public class BufferedCopy_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * flush和clos方法的区别
		 * flush	刷新缓冲区
		 * close方法	具备刷新的功能，关闭流之前会先刷新一次缓冲区。将缓冲区的字节全部刷新到文件上
		 */
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\\\com\\\\bean\\\\Person.java")); 					//创建缓冲区对象 队输入流进行包装
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.java"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
//			bos.flush();
		}
		
		bos.close();
		bis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 缓冲区一次会读取8194个字节
		 */
		FileInputStream fis = new FileInputStream("src\\com\\bean\\Person.java");
		FileOutputStream fos = new FileOutputStream("copy.java");
		BufferedInputStream bis = new BufferedInputStream(fis); 					//创建缓冲区对象 队输入流进行包装
		BufferedOutputStream bos = new BufferedOutputStream(fos);					//创建缓冲区对象 队输出流进行包装
		int b;
		while((b = bis.read())!=-1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
