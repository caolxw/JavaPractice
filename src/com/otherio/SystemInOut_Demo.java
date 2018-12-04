package com.otherio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * ��׼���������
 */
public class SystemInOut_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		demo2();
		
		demo3();
	}

	public static void demo3() throws IOException {
		/*
		 * ����¼�뷽ʽ1
		 */
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bReader.readLine();
		System.out.println(line);
		bReader.close();
		/*
		 * ����¼�뷽ʽ2
		 */
//		Scanner scanner = new Scanner("a.txt");			//scannerҲ���Զ�ȡ�ļ�
		Scanner scanner = new Scanner(System.in);
		String line2 = scanner.nextLine();
		System.out.println(line);
		scanner.close(); 								//һ�㲻��Ҫ�ر�
	}

	public static void demo2() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("a.txt"));			//�ı��׼������
		System.setOut(new PrintStream("b.txt"));			//�ı��׼�����
		
		InputStream is = System.in;							//��ȡ��׼�ļ��������� �ı��ָ���ļ�
		PrintStream ps = System.out;						//��ȡ��׼�Ŀ���̨����� �ı��ָ���ļ�
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		System.out.println("��������ù�Ӵ");						//��Ҳ��һ������� ���ù� ��Ϊû�к�Ӳ���ϵĹܵ�
		is.close();
		ps.close();
	}

	public static void demo1() throws IOException {
		InputStream is = System.in;
		int x = is.read();
		System.out.println(x);
		
		is.close();
		
		InputStream is2 = System.in;
		int y = is2.read();
		System.out.println(y); 				//�ᱨ�� ���Ѿ�������
	}

}
