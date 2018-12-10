package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_Demo {
/*
 * 客户端	Socket
 * 创建Socket来连接服务器，指定ip地址，端口号
 * 调用getInputStream()和getOutputStream()
 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 12345);
		
		InputStream iStream = socket.getInputStream();		//获取客户端输入流
		OutputStream oStream = socket.getOutputStream();	//获取客户端输出流
		
		oStream.write("百度一下，你就知道".getBytes()); 			//服务器向客户端写出数据
		
		byte[] arr = new byte[1024];
		int len = iStream.read(arr);						//读取发过来的数据
		System.out.println(new String(arr, 0, len));
		socket.close();
	}

}
