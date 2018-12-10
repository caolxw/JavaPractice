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
 * �����	ServerSocket
 * 	����ServerSocket��ָ���˿ں�
 * 	����ServerSocket��accept()����һ��socket
 * 	����getInputStream()��getOutputStream()
 * 
 * �����Ż�
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

public static void demo2() throws IOException {
	/*
	 * ���߳�
	 */
	ServerSocket serverSocket = new ServerSocket(12345);
	while(true) {
		final Socket socket = serverSocket.accept();				//���տͻ��˵�����
	
		new Thread() {
			public void run() {
				try {
					BufferedReader bReader = 						//���ֽ�����װ���ַ���
							new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintStream pStream = 							//printStream��Ҫд�����еķ���
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
		
		Socket socket = serverSocket.accept();				//���տͻ��˵�����
		BufferedReader bReader = 							//���ֽ�����װ���ַ���
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream pStream = 								//printStream��Ҫд�����еķ���
				new PrintStream(socket.getOutputStream());
		
		System.out.println(bReader.readLine());
		pStream.println("yoyoyo~");
		socket.close();
	}

}
