package com.regex;

import java.util.Scanner;

/*
 * 正则表达式
 */
public class Regex_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input your QQString:");
		Scanner scanner = new Scanner(System.in);
		String qqString = scanner.nextLine();
		System.out.println(checkQQ(qqString));
		System.out.println("Input your QQString again:");
		String qqString2 = scanner.nextLine();
		
		/*
		 * 采用正则表达式
		 */
		String regex = "[1-9]\\d{4,14}";
		System.out.println(qqString2.matches(regex));
	}
	
	/*
	 * 不用正则表达式的写法
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		
		if (qq.length()>=5 && qq.length()<=15) {
			if (!(qq.startsWith("0"))) {
				char[] arr = qq.toCharArray();
				for(char c:arr) {
					if(c<='0' && c>='9') {
						flag = false;
						break;
					}
				}
			}else {
				flag = false;
			}
		}else {
			flag = false;
		}
		return flag;
	}

}
