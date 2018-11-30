package com.file;

import java.io.File;

/*
 * File ���жϹ���
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
		
		System.out.println(new File("File_Demo.java").isHidden());		//�ж��ļ��Ƿ������ص�
	}

	public static void demo2() {
		File file = new File("zzz");
		file.setReadable(false);						//�����ļ����ɶ�
		System.out.println(file.canRead()); 			//true
														//Windowsϵͳ��Ϊ���е��ļ����ǿɶ���
		file.setWritable(false);						//�����ļ�����д
		System.out.println(file.canWrite()); 			//false
														//Windowsϵͳ��������Ϊ����д
	}

	public static void demo1() {
		File dir = new File("ccc");
		System.out.println(dir.isDirectory()); 			//�ж��Ƿ���һ���ļ���
		
		File file = new File("zzz");
		System.out.println(file.isFile()); 				//�ж��Ƿ����ļ�
	}

}
