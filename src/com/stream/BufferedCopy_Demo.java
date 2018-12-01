package com.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �������Ŀ���
 * 
 * Buffered��С����ıȽ�
 * �������ͬ���ֽ�����С�������죬��ΪС��������һ�������н��в�����Buffered���������顣
 */
public class BufferedCopy_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * flush��clos����������
		 * flush	ˢ�»�����
		 * close����	�߱�ˢ�µĹ��ܣ��ر���֮ǰ����ˢ��һ�λ������������������ֽ�ȫ��ˢ�µ��ļ���
		 */
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\\\com\\\\bean\\\\Person.java")); 					//�������������� �����������а�װ
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.java"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
//			bos.flush();
		}
		
		bos.close();
		bis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * ������һ�λ��ȡ8194���ֽ�
		 */
		FileInputStream fis = new FileInputStream("src\\com\\bean\\Person.java");
		FileOutputStream fos = new FileOutputStream("copy.java");
		BufferedInputStream bis = new BufferedInputStream(fis); 					//�������������� �����������а�װ
		BufferedOutputStream bos = new BufferedOutputStream(fos);					//�������������� ����������а�װ
		int b;
		while((b = bis.read())!=-1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
