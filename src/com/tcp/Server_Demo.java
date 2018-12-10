package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Demo {
/*
 * 服务端	ServerSocket
 * 	创建ServerSocket，指定端口号
 * 	调用ServerSocket的accept()接收一个socket
 * 	调用getInputStream()和getOutputStream()
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(12345);
		
		Socket socket = serverSocket.accept();				//接收客户端的请求
		InputStream iStream = socket.getInputStream();		//获取客户端输入流
		OutputStream oStream = socket.getOutputStream();	//获取客户端输出流
		
		byte[] arr = new byte[1024];
		int len = iStream.read(arr);						//读取发过来的数据
		System.out.println(new String(arr, 0, len));		//数据转换成字符串并打印
		
		oStream.write("学习挖掘机哪家强？".getBytes());	 		//客户端想服务器写数据
		socket.close();
	}

}
