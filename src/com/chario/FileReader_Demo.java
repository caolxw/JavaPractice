package com.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileReader fReader = new FileReader("test.txt");
		int c;
		while((c = fReader.read()) != -1) {				//ͨ����ĿĬ�ϵ����һ�ζ�ȡһ���ַ�
			System.out.println((char)c);
		}
		fReader.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fReader = new FileReader("test.txt");
		int x = fReader.read();
		System.out.println(x);
		char c = (char)x;								//����ǿת
		System.out.println(c);
		fReader.close();
	}
	
	public static void print(int i) {
		System.out.println("-----demo"+i+" end-----");
	}
}
