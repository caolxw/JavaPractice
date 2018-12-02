package com.chario;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("yoyoyo.txt");
		fWriter.write("要坚持呀！");							//可以直接传入字符串
		fWriter.write(97);
		fWriter.close();
	}

}
