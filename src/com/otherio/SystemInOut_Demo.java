package com.otherio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 标准输入输出流
 */
public class SystemInOut_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		demo2();
		
		demo3();
	}

	public static void demo3() throws IOException {
		/*
		 * 键盘录入方式1
		 */
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bReader.readLine();
		System.out.println(line);
		bReader.close();
		/*
		 * 键盘录入方式2
		 */
//		Scanner scanner = new Scanner("a.txt");			//scanner也可以读取文件
		Scanner scanner = new Scanner(System.in);
		String line2 = scanner.nextLine();
		System.out.println(line);
		scanner.close(); 								//一般不需要关闭
	}

	public static void demo2() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("a.txt"));			//改变标准输入流
		System.setOut(new PrintStream("b.txt"));			//改变标准输出流
		
		InputStream is = System.in;							//获取标准的键盘输入流 改变后指向文件
		PrintStream ps = System.out;						//获取标准的控制台输出流 改变后指向文件
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		System.out.println("这个流不用关哟");						//这也是一个输出流 不用关 因为没有和硬盘上的管道
		is.close();
		ps.close();
	}

	public static void demo1() throws IOException {
		InputStream is = System.in;
		int x = is.read();
		System.out.println(x);
		
		is.close();
		
		InputStream is2 = System.in;
		int y = is2.read();
		System.out.println(y); 				//会报错 流已经被关了
	}

}
