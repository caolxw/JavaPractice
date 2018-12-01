package com.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 	图片加密
 */
public class Test_Demo {

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
		/*
		 * 将键盘录入的数据拷贝到当前项目下的text.txt中
		 * 键盘录入遇到quit结束
		 */
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");
		while(true) {
			String line = scanner.nextLine();
			if (line.equals("quit")) {
				break;
			}
			
			fos.write(line.getBytes()); 						//字符串写出必须转换成字节数组
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * 在控制台录入文件的路径，将文件拷贝到当前项目下
		 */
		File file = getFile();						//获取文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	
	/*
	 * 定义一个方法，获取键盘录入的文件路径，并封装成file对象返回
	 * 1.返回值 file
	 * 2.参数列表 无
	 */
	public static File getFile() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			File file = new File(line);					//封装成file对象，对其进行判断
			if (!file.exists()) {
				System.out.println("录入的文件路径不存在，请重新输入!");
			}else if (file.isDirectory()) {
				System.out.println("你录入的是文件夹路径，请重新输入！");
			}else {
				return file;
			}
		}
		
	}
	
	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 	图片加密
		 */
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("shilaimu.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123); 		//通过异或一个数 为图片加密
										//解密只需要再次异或这个数
		}
		bis.close();
		bos.close();
	}

}
