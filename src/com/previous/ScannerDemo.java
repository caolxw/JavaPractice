package com.previous;
/*
 * Scanner �����÷�
 * 
 * ������10��ʱ��ͬʱ������\r\n
 * nextInt()ֻ�����10,\r\n�����ڻ�������
 */

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {				//hasnext...()�������ж�
			int i = scanner.nextInt();			//next...()����������
			System.out.println(i);
		}else {
			System.out.println("�������ʹ���");
		}
		
		String string = scanner.nextLine();
		System.out.println("�ַ���:"+string); 	//û�еȴ�����ͽ�����
	}

}
