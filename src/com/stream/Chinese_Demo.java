package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	��ȡ����
 */
public class Chinese_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("�Ҷ����٣���ƭ��".getBytes());						//����ҪgetBytes()
		fos.write("\r\n".getBytes());							//����
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * �ֽ�����ȡ�����в�������Ŀ���
		 */
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[4]; 								//ע��һ�����ĺ����൱�������ֽ�
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}

}
