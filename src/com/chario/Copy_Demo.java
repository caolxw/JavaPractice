package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 字符流的拷贝：
 * FileReader 	字节->字符
 * FileWriter	字符->字节
 *  	只写或只读的时候推荐使用
 *  	不可以拷贝非纯文本文件
 *  
 * 字节流的拷贝：（拷贝时推荐使用）不需要转换
 * FileInputStream
 * FileOutputStream	
 */
public class Copy_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileReader_Demo.print(1);
		
		demo2();
		FileReader_Demo.print(2);
		
		demo3();
		FileReader_Demo.print(3);
	}

	public static void demo3() throws FileNotFoundException, IOException {
		//带缓冲的字符流 缓冲区8192
		BufferedReader bReader = new BufferedReader(new FileReader("yoyoyo.txt"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("copy.txt"));
		int c;
		while((c = bReader.read()) != -1) {
			bWriter.write(c);
		}
		
		bReader.close();
		bWriter.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileReader fReader = new FileReader("yoyoyo.txt");
		FileWriter fWriter = new FileWriter("copy.txt");
		
		char[] arr = new char[1024];					//采用字符数组拷贝文件
		int len;
		while((len = fReader.read(arr)) != -1) {
			fWriter.write(arr,0,len);
		}
		
		fReader.close();
		fWriter.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fReader = new FileReader("yoyoyo.txt");
		FileWriter fWriter = new FileWriter("copy.txt");	//自带有一个小缓冲区 2K
		
		int c;
		while((c = fReader.read())!=-1) {
			fWriter.write(c);
		}
		System.out.println("拷贝完成！");
		fWriter.close();								//没有关流的话 数据会存在缓冲区中
		fReader.close();
	}

}
