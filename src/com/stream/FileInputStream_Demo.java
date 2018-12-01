package com.stream;
/*
 * read()����ֵΪint ����byte��ԭ��
 * 	10000001 byte���� -1��ԭ��
 * 	11111110 byte���� -1�ķ���
 * 	11111111 byte���� -1�Ĳ���
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fInputStream = new FileInputStream("D:\\Java\\Practice\\src\\com\\bean\\Person.java");	//����������
		int a;
		while ((a = fInputStream.read()) != -1) {
			System.out.println(a);
		}
		fInputStream.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fInputStream = new FileInputStream("D:\\Java\\Practice\\src\\com\\bean\\Person.java");	//����������
		int x = fInputStream.read();																			//��Ӳ���϶�ȡһ���ֽ�
		System.out.println(x);																					
		int y = fInputStream.read();
		System.out.println(y);
		int z = fInputStream.read();
		System.out.println(z); 																					//�����ļ���β�᷵��-1
		
		fInputStream.close();																					//�������ͷ���Դ	
	}
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}
}
