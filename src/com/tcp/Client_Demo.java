package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_Demo {
/*
 * �ͻ���	Socket
 * ����Socket�����ӷ�������ָ��ip��ַ���˿ں�
 * ����getInputStream()��getOutputStream()
 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 12345);
		
		InputStream iStream = socket.getInputStream();		//��ȡ�ͻ���������
		OutputStream oStream = socket.getOutputStream();	//��ȡ�ͻ��������
		
		oStream.write("�ٶ�һ�£����֪��".getBytes()); 			//��������ͻ���д������
		
		byte[] arr = new byte[1024];
		int len = iStream.read(arr);						//��ȡ������������
		System.out.println(new String(arr, 0, len));
		socket.close();
	}

}
