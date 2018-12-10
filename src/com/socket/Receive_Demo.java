package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive_Demo {
	/*
	 * 接收端
	 * 创建DatagramSocke	指定端口号
	 * 创建DatagramPacket	制定数组，长度
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(6666);					//相当于创建码头
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);	//相当于创建集装箱
		socket.receive(packet); 											//接收数据
		
		byte[] arr = packet.getData(); 										//获取数据
		int len = packet.getLength();										//获取有效的字节个数
		System.out.println(new String(arr,0,len));
	}

}
