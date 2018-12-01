package com.stream;
/*
 * read()返回值为int 不是byte得原因
 * 	10000001 byte类型 -1的原码
 * 	11111110 byte类型 -1的反码
 * 	11111111 byte类型 -1的补码
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fInputStream = new FileInputStream("D:\\Java\\Practice\\src\\com\\bean\\Person.java");	//创建流对象
		int a;
		while ((a = fInputStream.read()) != -1) {
			System.out.println(a);
		}
		fInputStream.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fInputStream = new FileInputStream("D:\\Java\\Practice\\src\\com\\bean\\Person.java");	//创建流对象
		int x = fInputStream.read();																			//从硬盘上读取一个字节
		System.out.println(x);																					
		int y = fInputStream.read();
		System.out.println(y);
		int z = fInputStream.read();
		System.out.println(z); 																					//读到文件结尾会返回-1
		
		fInputStream.close();																					//关流，释放资源	
	}
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}
}
