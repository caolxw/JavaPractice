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
 * �ͻ���	Socket
 * ����Socket�����ӷ�������ָ��ip��ַ���˿ں�
 * ����getInputStream()��getOutputStream()
 * 
 * �����Ż�
 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 12345);
		
		BufferedReader bReader = 					//���ֽ�����װ���ַ���
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream pStream = 						//printStream��Ҫд�����еķ���
				new PrintStream(socket.getOutputStream());
		pStream.println("��ӭ��Ѷ��");
		System.out.println(bReader.readLine());
		socket.close();
	}

}
