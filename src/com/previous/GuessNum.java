package com.previous;

import java.util.Scanner;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��1-100֮�������");
		int guessnum = (int)(Math.random()*100)+1;
		
		while(true) {
			int result = scanner.nextInt();
			if(result == guessnum) {
				System.out.println("��ϲ�㣬�¶��ˣ�");
				break;
			}else if(result > guessnum)
				System.out.println("�´��ˣ�����һ�Σ�");
			else {
				System.out.println("��С�ˣ�����һ�Σ�");
			}
				
		}
	}

}
