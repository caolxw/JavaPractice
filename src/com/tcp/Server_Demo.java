package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Demo {
/*
 * �����	ServerSocket
 * 	����ServerSocket��ָ���˿ں�
 * 	����ServerSocket��accept()����һ��socket
 * 	����getInputStream()��getOutputStream()
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(12345);
		
		Socket socket = serverSocket.accept();				//���տͻ��˵�����
		InputStream iStream = socket.getInputStream();		//��ȡ�ͻ���������
		OutputStream oStream = socket.getOutputStream();	//��ȡ�ͻ��������
		
		byte[] arr = new byte[1024];
		int len = iStream.read(arr);						//��ȡ������������
		System.out.println(new String(arr, 0, len));		//����ת�����ַ�������ӡ
		
		oStream.write("ѧϰ�ھ���ļ�ǿ��".getBytes());	 		//�ͻ����������д����
		socket.close();
	}

}
