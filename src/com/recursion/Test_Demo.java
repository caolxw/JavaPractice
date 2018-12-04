package com.recursion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*
 * �ļ��ĵݹ�
 */
public class Test_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		demo2();
		print(2);
		
		demo3();
		print(3);
		
		demo4();
		print(4);
		
	}

	public static void demo4() {
		/*
		 * �Ӽ��̽���һ���ļ���·�������ļ��������е��ļ��Լ��ļ��е����ְ��㼶��ӡ
		 */
		printDir(getDir(),0);
	}
	
	public static void printDir(File dir,int level) {
		/*
		 * ���ļ��������е��ļ��Լ��ļ��е����ְ��㼶��ӡ
		 */
		File[] files = dir.listFiles();
		for (File file : files) {
			for(int i=0; i<= level; i++) {
				System.out.print("\t");
			}
			System.out.println(file);
			if (file.isDirectory()) {
				printDir(file,level+1);
			}
		}
	}
	public static void demo3() throws IOException {
		/*
		 * �Ӽ��̽��������ļ��У�������һ���ļ��е����ݿ�������һ���ļ���
		 */
		File dir1 = getDir();
		File dir2 = getDir();
		if (dir1.equals(dir2)) {
			System.out.println("Ŀ����ļ�����Դ�ļ��е����ļ���");
		}else {
			copyDir(dir1, dir2);
		}
	}
	
	public static void copyDir(File dir1,File dir2) throws IOException {
		/*
		 * ��dir1�����ݿ�����dir2
		 * 1,����ֵ����	void
		 * 2,�����б�	File File
		 */
		
		//��Ŀ���ļ����д���ԭ�ļ���
		File newDir = new File(dir2, dir1.getName());
		newDir.mkdir();
		
		File[] files = dir1.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				//��io������Ŀ�괦
				//ע��ֻ�����ֽ���
				BufferedInputStream bis = 
						new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(newDir));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bos.close();
				bis.close();
			}else {
				//�ļ�����Ҫ�ݹ����
				copyDir(file, newDir);
			}
		}
		
	}

	public static void demo2() {
		/*
		 * ���󣺴Ӽ��̽���һ���ļ���·����ɾ�����ļ���
		 */
		delectDir(getDir());
	}
	
	public static void delectDir(File dir) {
		/*
		 * ɾ�����ļ���
		 * 	��ɾ���ļ����µ��ļ����ļ��У���ɾ���ļ���
		 */
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				//���ļ���ֱ��ɾ��
				file.delete();
			}else {
				//�����ļ��͵ݹ����
				delectDir(file);
			}
			
		}
		dir.delete();		//���ɾ��������ļ���
	}

	public static void demo1() {
		/*
		 * ���󣺴Ӽ��̽���һ���ļ���·����ͳ���ļ��д�С
		 */
		File file = new File("\\sec\\com\\bean");
		System.out.println(file.length()); 				//ֱ�ӻ�ȡ�ļ��д�СΪ0
		System.out.println(getFileLength(getDir()));
	}
	
	public static long getFileLength(File dir) {
		/*
		 * ͳ���ļ��д�С
		 * 1,����ֵ��С	long
		 * 2,�����б�	File
		 */
		long len = 0;
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				len = len + file.length();
			}else {
				//�ж����ļ��У��͵ݹ����
				len = len + getFileLength(file);
			}
		}
		return len;
	}
	
	public static File getDir() {
		/*
		 * �Ӽ��̽���һ���ļ���·��
		 * 1,����ֵ����	File
		 * 2,�����б�	��
		 */
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input a directory path:");
			String path = scanner.nextLine();
			File file = new File(path);
			if (!file.exists()) {
				System.out.println("It's not a diectory path.");
			}else if (file.isFile()) {
				System.out.println("It's a file path.");
			}else {
				return file;
			}
		}
	}
	
	public static void print(int i)	 {
		System.out.println("------demo"+i+" end------");
	}

}
