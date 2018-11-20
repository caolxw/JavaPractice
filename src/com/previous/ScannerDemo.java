package com.previous;
/*
 * Scanner 基本用法
 * 
 * 当输入10得时候，同时输入了\r\n
 * nextInt()只会接收10,\r\n会留在缓冲区。
 */

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {				//hasnext...()用来做判断
			int i = scanner.nextInt();			//next...()用来做接收
			System.out.println(i);
		}else {
			System.out.println("输入类型错误！");
		}
		
		String string = scanner.nextLine();
		System.out.println("字符串:"+string); 	//没有等待输入就结束。
	}

}
