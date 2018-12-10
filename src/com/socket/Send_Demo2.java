package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Send_Demo2 {
	
	/*
	 * ����DatagramSocket 	����˿ں�
	 * ����DatagramPacket	ָ�����ݣ����ȣ���ַ���˿�
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();			//�൱����ͷ
		while(true) {
			String line = sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}
			DatagramPacket packet = 								//�൱�ڼ�װ��
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);	
		}
		
										//�൱�ڷ���
		socket.close(); 										//�ر���ͷ �ײ�ΪIO��
	}

}
