package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Send_Demo {
	
	/*
	 * ����DatagramSocket 	����˿ں�
	 * ����DatagramPacket	ָ�����ݣ����ȣ���ַ���˿�
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String string = "what is your name?";
		DatagramSocket socket = new DatagramSocket();			//�൱����ͷ
		DatagramPacket packet = 								//�൱�ڼ�װ��
				new DatagramPacket(string.getBytes(), string.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);									//�൱�ڷ���
		socket.close(); 										//�ر���ͷ �ײ�ΪIO��
	}

}
