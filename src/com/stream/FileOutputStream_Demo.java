package com.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class FileOutputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
		
		demo3();
		FileInputStream_Demo.print(3);
		
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileOutputStream foStream = new FileOutputStream("aaa.txt",true);	//续写文件
		foStream.write(100);
		foStream.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream foStream = new FileOutputStream("aaa.txt");		//创建字节输出流对象，有这个文件会清空这个文件
		foStream.write(100);
		foStream.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream foStream = new FileOutputStream("aaa.txt");		//创建字节输出流对象，如果没有就会创建一个
		foStream.write(99);													//虽然写出的是int，但是文件上是一个byte
		foStream.write(98);
		foStream.write(97);
		
		foStream.close();
	}

}
