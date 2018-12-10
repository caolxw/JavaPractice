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
	 * 创建DatagramSocket 	随机端口号
	 * 创建DatagramPacket	指定数据，长度，地址，端口
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		
										//相当于发货
		socket.close(); 										//关闭码头 底层为IO流
	}

}
