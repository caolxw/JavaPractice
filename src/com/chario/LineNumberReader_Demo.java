package com.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileReader_Demo.print(1);
		
		LineNumberReader lReader = new LineNumberReader(new FileReader("D:\\Java\\Practice\\src\\com\\bean\\Person.java"));
		
		String line;
		lReader.setLineNumber(100);												//设置行号的开始值
		while((line = lReader.readLine()) != null) {
			System.out.println(lReader.getLineNumber()+" "+line);
		}
		lReader.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		LineNumberReader lReader = new LineNumberReader(new FileReader("D:\\Java\\Practice\\src\\com\\bean\\Person.java"));
		
		String line;
		while((line = lReader.readLine()) != null) {
			System.out.println(lReader.getLineNumber()+" "+line);				//行号加文本
		}
		lReader.close();
	}

}
