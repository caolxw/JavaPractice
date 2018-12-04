package com.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * ByteArrayOuputStream
 * �ڴ������
 * 
 * FileInputStream��ȡ���ĵ�ʱ�򣬳��������롣
 * ���������
 * 1.�ַ�����ȡ
 * 2.ByteArrayOutputStream
 */
public class ByteArrayOuputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * ����һ���ļ�������������read(bety[] b)��������a.txt�ļ��е����ݴ�ӡ����
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1) {
			baos.write(arr,0,len);
		}
		System.out.println(baos);
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();		//���ڴ��д����˿����������ڴ�����
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);												//����ȡ�����������д���ڴ���
		}
//		byte[] arr = baos.toByteArray();								//��������������ȫ������arr����
//		System.out.println(new String(arr));
		System.out.println(baos); 										//ʹ��ƽ̨Ĭ�ϵı����
		fis.close();
	}

}
