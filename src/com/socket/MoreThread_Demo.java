package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MoreThread_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Receive().start();
		new Send().start();
	}

}

class Receive extends Thread {
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(6666);					//�൱�ڴ�����ͷ
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);	//�൱�ڴ�����װ��
			while(true) {
				socket.receive(packet); 										//��������
				
				byte[] arr = packet.getData(); 									//��ȡ����
				int len = packet.getLength();									//��ȡ��Ч���ֽڸ���
				String ip = packet.getAddress().getHostAddress(); 				//��ȡip
				int port = packet.getPort();									//��ȡ�˿ں�
				System.out.println(ip+":"+port+":"+new String(arr,0,len));
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

class Send extends Thread {
	public void run() {
		try {
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
			socket.close(); 
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
}