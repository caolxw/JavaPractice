package com.recursion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*
 * 文件的递归
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
		 * 从键盘接收一个文件夹路径，把文件夹中所有的文件以及文件夹的名字按层级打印
		 */
		printDir(getDir(),0);
	}
	
	public static void printDir(File dir,int level) {
		/*
		 * 把文件夹中所有的文件以及文件夹的名字按层级打印
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
		 * 从键盘接收两个文件夹，把其中一个文件夹的内容拷贝到另一个文件夹
		 */
		File dir1 = getDir();
		File dir2 = getDir();
		if (dir1.equals(dir2)) {
			System.out.println("目标表文件夹是源文件夹得子文件夹");
		}else {
			copyDir(dir1, dir2);
		}
	}
	
	public static void copyDir(File dir1,File dir2) throws IOException {
		/*
		 * 把dir1的内容拷贝到dir2
		 * 1,返回值类型	void
		 * 2,参数列表	File File
		 */
		
		//在目标文件夹中创建原文件夹
		File newDir = new File(dir2, dir1.getName());
		newDir.mkdir();
		
		File[] files = dir1.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				//用io拷贝到目标处
				//注意只能用字节流
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
				//文件夹需要递归调用
				copyDir(file, newDir);
			}
		}
		
	}

	public static void demo2() {
		/*
		 * 需求：从键盘接收一个文件夹路径，删除该文件夹
		 */
		delectDir(getDir());
	}
	
	public static void delectDir(File dir) {
		/*
		 * 删除该文件夹
		 * 	先删除文件夹下的文件和文件夹，在删除文件夹
		 */
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				//是文件就直接删除
				file.delete();
			}else {
				//不是文件就递归调用
				delectDir(file);
			}
			
		}
		dir.delete();		//最后删除传入的文件夹
	}

	public static void demo1() {
		/*
		 * 需求：从键盘接收一个文件夹路径，统计文件夹大小
		 */
		File file = new File("\\sec\\com\\bean");
		System.out.println(file.length()); 				//直接获取文件夹大小为0
		System.out.println(getFileLength(getDir()));
	}
	
	public static long getFileLength(File dir) {
		/*
		 * 统计文件夹大小
		 * 1,返回值大小	long
		 * 2,参数列表	File
		 */
		long len = 0;
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				len = len + file.length();
			}else {
				//判断是文件夹，就递归调用
				len = len + getFileLength(file);
			}
		}
		return len;
	}
	
	public static File getDir() {
		/*
		 * 从键盘接收一个文件夹路径
		 * 1,返回值类型	File
		 * 2,参数列表	无
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
