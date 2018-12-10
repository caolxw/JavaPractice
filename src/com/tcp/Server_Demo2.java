package com.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Demo2 {
/*
 * 服务端	ServerSocket
 * 	创建ServerSocket，指定端口号
 * 	调用ServerSocket的accept()接收一个socket
 * 	调用getInputStream()和getOutputStream()
 * 
 * 代码优化
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

public static void demo2() throws IOException {
	/*
	 * 多线程
	 */
	ServerSocket serverSocket = new ServerSocket(12345);
	while(true) {
		final Socket socket = serverSocket.accept();				//接收客户端的请求
	
		new Thread() {
			public void run() {
				try {
					BufferedReader bReader = 						//把字节流包装成字符流
							new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintStream pStream = 							//printStream中要写出换行的方法
							new PrintStream(socket.getOutputStream());
					
					System.out.println(bReader.readLine());
					pStream.println("yoyoyo~");
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}.start();
		
	}
}

	public static void demo1() throws IOException {
		ServerSocket serverSocket = new ServerSocket(12345);
		
		Socket socket = serverSocket.accept();				//接收客户端的请求
		BufferedReader bReader = 							//把字节流包装成字符流
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream pStream = 								//printStream中要写出换行的方法
				new PrintStream(socket.getOutputStream());
		
		System.out.println(bReader.readLine());
		pStream.println("yoyoyo~");
		socket.close();
	}

}
