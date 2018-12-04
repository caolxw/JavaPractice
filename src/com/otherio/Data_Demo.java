package com.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 数据输入输出流
 */
public class Data_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		demo2();
		
		demo3();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		
		System.out.println(x+" "+y+" "+z);
		dis.close();
		
	}

	public static void demo3() throws FileNotFoundException, IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		dos.close();
		//文本内容：  ?  ?  ?
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("h.txt");
		int x = fis.read();
		int y = fis.read();
		int z = fis.read();
		
		System.out.println(x+" "+y+" "+z);
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("h.txt");
		fos.write(997);
		fos.write(998);
		fos.write(999);
		fos.close();
		//文本内容：彐?
	}

}
