package com.previous;

import java.util.Scanner;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个1-100之间得整数");
		int guessnum = (int)(Math.random()*100)+1;
		
		while(true) {
			int result = scanner.nextInt();
			if(result == guessnum) {
				System.out.println("恭喜你，猜对了！");
				break;
			}else if(result > guessnum)
				System.out.println("猜大了，再试一次！");
			else {
				System.out.println("猜小了，再试一次！");
			}
				
		}
	}

}
