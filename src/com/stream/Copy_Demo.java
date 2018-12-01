package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
		*/
		
		demo3();
		FileInputStream_Demo.print(3);
		
		demo4();
		FileInputStream_Demo.print(4);
		
		demo5();
		FileInputStream_Demo.print(5);
	}

	public static void demo5() throws FileNotFoundException, IOException {
		/*
		 * ����С����ı�׼��ʽ
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg",true);
		byte[] arr = new byte[1024 * 8];									//Ҫ��1024��������
		int len;
		while((len = fis.read(arr)) == -1) {
			fos.write(arr,0,len);
		}
		fos.close();
		fis.close();
	}

	public static void demo4() throws FileNotFoundException, IOException {
		/*
		 * �����ļ����Ƽ�д��
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg",true);
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) == -1) {
			fos.write(arr,0,len);
		}
		fos.close();
		fis.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		/*
		 * �����ֿ���
		 * ����С����
		 */
		FileInputStream fis = new FileInputStream("src\\com\\bean\\Person.java");
		byte[] arr = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		for (byte b : arr) {
			System.out.println(b);													//��ȡ���ļ���ǰ�����ֽ�
		}
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * ���Ƽ�ʹ�ã����ܻᵼ���ڴ����
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int len = fis.available();									//һ�λ�ȡ�������������ֽ�
		
		byte[] arr = new byte[fis.available()];						//�������ļ�һ����С���ֽ�����
		fis.read(arr);												//���ļ����ݶ���byte[]
		fos.write(arr); 											//���ֽ����������д�뿽���ļ���
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * ��һ�ֿ�����ʽ Ч�ʽϵ�
		 */
		FileInputStream fis = new FileInputStream("shilaimu.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		int b;
		while ((b = fis.read())!=-1) {
			fos.write(b);
		}
		
		fos.close();
		fis.close();
	}

}
