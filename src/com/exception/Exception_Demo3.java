package com.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


/*
 * 	需求：键盘录入一个int类型的整数，并求其二进制形式。如果输入错误，提示并允许重新输入
 */
public class Exception_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
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
					System.out.println("录入错误，输入的整数过大！");
				}catch(Exception e2) {
					try {											//快捷键 alt+shift+z
						new BigDecimal(line);
						System.out.println("录入错误，输入的是小数！");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("录入错误，输入的是非法字符！");
					}
				}
				
			}
		}
	}

}
