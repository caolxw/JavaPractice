package com.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


/*
 * 	���󣺼���¼��һ��int���͵��������������������ʽ��������������ʾ��������������
 */
public class Exception_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������");
		while(true) {
			String line = scanner.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			}catch (Exception e) {
				// TODO: handle exception
				try {
					new BigInteger(line);
					System.out.println("¼������������������");
				}catch(Exception e2) {
					try {											//��ݼ� alt+shift+z
						new BigDecimal(line);
						System.out.println("¼������������С����");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("¼�����������ǷǷ��ַ���");
					}
				}
				
			}
		}
	}

}
