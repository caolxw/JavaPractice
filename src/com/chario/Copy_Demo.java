package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * �ַ����Ŀ�����
 * FileReader 	�ֽ�->�ַ�
 * FileWriter	�ַ�->�ֽ�
 *  	ֻд��ֻ����ʱ���Ƽ�ʹ��
 *  	�����Կ����Ǵ��ı��ļ�
 *  
 * �ֽ����Ŀ�����������ʱ�Ƽ�ʹ�ã�����Ҫת��
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
		//��������ַ��� ������8192
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
		
		char[] arr = new char[1024];					//�����ַ����鿽���ļ�
		int len;
		while((len = fReader.read(arr)) != -1) {
			fWriter.write(arr,0,len);
		}
		
		fReader.close();
		fWriter.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fReader = new FileReader("yoyoyo.txt");
		FileWriter fWriter = new FileWriter("copy.txt");	//�Դ���һ��С������ 2K
		
		int c;
		while((c = fReader.read())!=-1) {
			fWriter.write(c);
		}
		System.out.println("������ɣ�");
		fWriter.close();								//û�й����Ļ� ���ݻ���ڻ�������
		fReader.close();
	}

}
