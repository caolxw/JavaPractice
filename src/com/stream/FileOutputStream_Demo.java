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
		FileOutputStream foStream = new FileOutputStream("aaa.txt",true);	//��д�ļ�
		foStream.write(100);
		foStream.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream foStream = new FileOutputStream("aaa.txt");		//�����ֽ����������������ļ����������ļ�
		foStream.write(100);
		foStream.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream foStream = new FileOutputStream("aaa.txt");		//�����ֽ�������������û�оͻᴴ��һ��
		foStream.write(99);													//��Ȼд������int�������ļ�����һ��byte
		foStream.write(98);
		foStream.write(97);
		
		foStream.close();
	}

}
