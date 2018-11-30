package com.file;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File��ȡ����
 * 	String getAbsolutePath();
 * 	String getPath();
 * 	String getName();
 * 	long length();
 * 	long lastModified();
 * 	String[] list();
 * 	File[] listFiles();
 */
public class File_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		File_Demo.print(1);
		
		demo2();
		File_Demo.print(2);
		
		demo3();
		File_Demo.print(3);
		
		demo4();
		File_Demo.print(4);

	}

	public static void demo4() {
		/*
		 * �ļ�������
		 */
		File dir = new File("C:\\Users\\61721\\Desktop\\�½��ļ���");
		String[] arr = dir.list(new FilenameFilter() {				//�����ڲ���
			
			@Override
			public boolean accept(File dir, String name) {	
				// TODO Auto-generated method stub
//				System.out.println(dir);
//				System.out.println(name);
				File file = new File(dir,name);
				
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void demo3() {
		/*
		 * 	�ж��ļ������Ƿ��к�׺Ϊ.jpg���ļ�������У�������ļ���
		 */
		File dir = new File("C:\\Users\\61721\\Desktop\\�½��ļ���");
		
		String[] arr = dir.list();
		for (String string : arr) {
			if (string.endsWith(".jpg")) {
				System.out.println(string);
			}
		}
		
		//��ʽ��
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.getName().endsWith(".jpg") && file.isFile()) {
				System.out.println(file);
			}
		}
	}

	public static void demo2() {
		File dir = new File("D:\\Java\\Practice\\src\\com\\bean");
		String[] arr = dir.list();									//�õ��ļ����µ������ļ�����
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file); 								//�õ��ļ����µ������ļ����ļ�����
		}
	}

	public static void demo1() {
		File file = new File("File_Demo.java");
		File file2 = new File("D:\\Java\\Practice\\src\\com\\bean\\Person.java");
		System.out.println(file.getAbsolutePath());			//��ȡ����·��
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file2.getPath());				//��ȡ���췽���д����·��
		System.out.println(file.getPath());
		
		System.out.println(file2.getName()); 				//��ȡ�ļ����ļ�������
		System.out.println(file.getName());
		
		System.out.println(file2.length());					//��ȡ�ļ����ݳ���
		
		System.out.println(file2.lastModified()); 			//��ȡ�����޸�ʱ��
		Date date = new Date(file2.lastModified());
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//��ʽ��
		
		System.out.println(sFormat.format(date));
	}

}
