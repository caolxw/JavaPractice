package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
/*
 * InputStreamReader(字节流，编码表) ：字节通向字符的桥梁，通过指定的编码表将字节转换成字符
 * OutputStreamWriter(字节流，编码表) ：字符通向字节的桥梁，通过指定的编码表将字符转换成字节
 */
public class TransIO_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		demo1();
		FileReader_Demo.print(1);
		
		demo2();
		FileReader_Demo.print(2);
		
		demo3();
		FileReader_Demo.print(3);
	}

	public static void demo3() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//更高效的读写
		BufferedReader bReader = 
				new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bWriter = 
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
		
		int c;
		while((c = bReader.read()) != -1) {
			bWriter.write(c);
		}
		
		bReader.close();
		bWriter.close();
	}

	public static void demo2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//指定码表读写字符
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf.txt"), "uTf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		isr.close();
		osw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		//用默认的编码表读写 出现乱码
		FileReader fReader = new FileReader("utf-8.txt");
		FileWriter fWriter = new FileWriter("gbk.txt");
		
		int c;
		while((c = fReader.read()) != -1) {
			fWriter.write(c);
		}
		fReader.close();
		fWriter.close();
	}

}
