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
			DatagramSocket socket = new DatagramSocket(6666);					//相当于创建码头
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);	//相当于创建集装箱
			while(true) {
				socket.receive(packet); 										//接收数据
				
				byte[] arr = packet.getData(); 									//获取数据
				int len = packet.getLength();									//获取有效的字节个数
				String ip = packet.getAddress().getHostAddress(); 				//获取ip
				int port = packet.getPort();									//获取端口号
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
			DatagramSocket socket = new DatagramSocket();			//相当于码头
			while(true) {
				String line = sc.nextLine();
				if ("quit".equals(line)) {
					break;
				}
				DatagramPacket packet = 								//相当于集装箱
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