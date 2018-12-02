package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��������������ⷽ��
 * readLine()
 * newLine()
 * 
 * 	newLine()�� \r\n ������
 * 		newLine()�ǿ�ƽ̨��
 * 		\r\n֮������windowsƽ̨
 */
public class Buffered_Demo {
	public static void main(String[] args) throws IOException {
		demo1();
		FileReader_Demo.print(1);
		demo2();
		FileReader_Demo.print(2);
		
	}

	public static void demo2() throws FileNotFoundException, IOException {
		BufferedReader bReader = new BufferedReader(new FileReader("yoyoyo.txt"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("copy.txt"));
		
		String line;
		while((line = bReader.readLine()) != null) {
			bWriter.write(line);
			bWriter.newLine(); 							//д���س����з�
		}
		bReader.close();
		bWriter.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader bReader = new BufferedReader(new FileReader("yoyoyo.txt"));
		String line;
		
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		bReader.close();
	}
}
