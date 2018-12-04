package com.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/*
 * 随机访问流
 */
public class RandomAccessFile_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("a.txt","rw");
		raf.write(97);
//		int x = raf.read();
//		System.out.println(x);
		raf.seek(10);							//设置指针位置
		raf.write(98);
		raf.close();
	}

}
