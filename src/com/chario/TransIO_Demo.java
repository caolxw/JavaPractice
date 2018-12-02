package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/*
 * InputStreamReader(�ֽ����������) ���ֽ�ͨ���ַ���������ͨ��ָ���ı�����ֽ�ת�����ַ�
 * OutputStreamWriter(�ֽ����������) ���ַ�ͨ���ֽڵ�������ͨ��ָ���ı�����ַ�ת�����ֽ�
 */
public class TransIO_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		demo1();
		FileReader_Demo.print(1);
		
		demo2();
		FileReader_Demo.print(2);
		
		demo3();
		FileReader_Demo.print(3);
	}

	public static void demo3() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//����Ч�Ķ�д
		BufferedReader bReader = 
				new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bWriter = 
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
		
		int c;
		while((c = bReader.read()) != -1) {
			bWriter.write(c);
		}
		
		bReader.close();
		bWriter.close();
	}

	public static void demo2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//ָ������д�ַ�
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf.txt"), "uTf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		isr.close();
		osw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		//��Ĭ�ϵı�����д ��������
		FileReader fReader = new FileReader("utf-8.txt");
		FileWriter fWriter = new FileWriter("gbk.txt");
		
		int c;
		while((c = fReader.read()) != -1) {
			fWriter.write(c);
		}
		fReader.close();
		fWriter.close();
	}

}
