package com.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 	ͼƬ����
 */
public class Test_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
		
		
		demo3();
		FileInputStream_Demo.print(3);
	}

	public static void demo3() throws FileNotFoundException, IOException {
		/*
		 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt��
		 * ����¼������quit����
		 */
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");
		while(true) {
			String line = scanner.nextLine();
			if (line.equals("quit")) {
				break;
			}
			
			fos.write(line.getBytes()); 						//�ַ���д������ת�����ֽ�����
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * �ڿ���̨¼���ļ���·�������ļ���������ǰ��Ŀ��
		 */
		File file = getFile();						//��ȡ�ļ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	
	/*
	 * ����һ����������ȡ����¼����ļ�·��������װ��file���󷵻�
	 * 1.����ֵ file
	 * 2.�����б� ��
	 */
	public static File getFile() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			File file = new File(line);					//��װ��file���󣬶�������ж�
			if (!file.exists()) {
				System.out.println("¼����ļ�·�������ڣ�����������!");
			}else if (file.isDirectory()) {
				System.out.println("��¼������ļ���·�������������룡");
			}else {
				return file;
			}
		}
		
	}
	
	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * 	ͼƬ����
		 */
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("shilaimu.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123); 		//ͨ�����һ���� ΪͼƬ����
										//����ֻ��Ҫ�ٴ���������
		}
		bis.close();
		bos.close();
	}

}
