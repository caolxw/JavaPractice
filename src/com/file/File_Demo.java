package com.file;

import java.io.File;

/*
 * 	file���췽��
 * 
 * 	File(String pathname);
 * 	File(String parent,String child);
 * 	File(File parent,String child);
 */
public class File_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		print(3);
	}

	public static void demo3() {
		File parent = new File("D:\\Java\\Practice\\src\\com\\bean");				//������·����װ��File
		String child = "Person.java";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void demo2() {
		String parent = "D:\\Java\\Practice\\src\\com\\bean";						//����·��
		String child = "Person.java";												//�Ӽ�·��
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	public static void demo1() {
		File file = new File("D:\\Java\\Practice\\src\\com\\bean\\Person.java") ;
		System.out.println(file.exists());											//����ļ��Ƿ����
		
		File file2 = new File("test.txt");											//���ļ�������
		System.out.println(file2.exists());
	}
	
	public static void print(int x) {
		System.out.println("----demo"+x+" end----");
	}

}
