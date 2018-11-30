package com.file;

import java.io.File;

/*
 * File 的判断功能
 *  public boolean isDirectory();
 *  public boolean isFile();
 *  public boolean exists();
 *  public boolean canRead();
 *  public boolean canWrite();
 *  public boolean isHidden();
 */
public class File_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		File_Demo.print(1);
		
		demo2();
		File_Demo.print(2);
		
		System.out.println(new File("File_Demo.java").isHidden());		//判断文件是否是隐藏的
	}

	public static void demo2() {
		File file = new File("zzz");
		file.setReadable(false);						//设置文件不可读
		System.out.println(file.canRead()); 			//true
														//Windows系统认为所有的文件都是可读的
		file.setWritable(false);						//设置文件不可写
		System.out.println(file.canWrite()); 			//false
														//Windows系统可以设置为不可写
	}

	public static void demo1() {
		File dir = new File("ccc");
		System.out.println(dir.isDirectory()); 			//判断是否是一个文件夹
		
		File file = new File("zzz");
		System.out.println(file.isFile()); 				//判断是否是文件
	}

}
