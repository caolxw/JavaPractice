package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive_Demo {
	/*
	 * ���ն�
	 * ����DatagramSocke	ָ���˿ں�
	 * ����DatagramPacket	�ƶ����飬����
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(6666);					//�൱�ڴ�����ͷ
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);	//�൱�ڴ�����װ��
		socket.receive(packet); 											//��������
		
		byte[] arr = packet.getData(); 										//��ȡ����
		int len = packet.getLength();										//��ȡ��Ч���ֽڸ���
		System.out.println(new String(arr,0,len));
	}

}
