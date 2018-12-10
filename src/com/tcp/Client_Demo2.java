package com.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_Demo2 {
/*
 * 客户端	Socket
 * 创建Socket来连接服务器，指定ip地址，端口号
 * 调用getInputStream()和getOutputStream()
 * 
 * 代码优化
 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 12345);
		
		BufferedReader bReader = 					//把字节流包装成字符流
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream pStream = 						//printStream中要写出换行的方法
				new PrintStream(socket.getOutputStream());
		pStream.println("欢迎资讯！");
		System.out.println(bReader.readLine());
		socket.close();
	}

}
