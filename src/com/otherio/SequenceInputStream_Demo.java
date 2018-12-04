package com.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
/*
 * 序列流
 */
public class SequenceInputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		demo1();
		
		demo2();
		
		demo3();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		//整合多个输入流
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		//创建集合对象，将流对象存储进来
		Vector<FileInputStream> vector = new Vector<>();
		vector.add(fis3);
		vector.add(fis2);
		vector.add(fis1);
		
		Enumeration<FileInputStream> en = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		sis.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		//整合两个输入流
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();						//在关闭的时候，会把传进去的流一起关闭
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 将 a.txt和b.txt的内容都写入c.txt
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		while((b = fis2.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		fis2.close();
	}

}
