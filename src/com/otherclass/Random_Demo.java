package com.otherclass;

import java.util.Random;

public class Random_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---无参构造---");
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x); 				//生成int范围内的随机数
		
		/*
		 * 查看是否为随机数
		 */
		for(int i=0;i<5;i++) {
			System.out.println(random.nextInt());	//生成的数均不相同。
		}
		
		/*
		 * 指定种子后，生成的为伪随机数
		 */
		System.out.println("---有参构造---");
		Random random2 = new Random(1000);
		int n = random2.nextInt();
		int m = random2.nextInt();
		System.out.println(n);
		System.out.println(m);						//连续运行两次，会生成一样的n,m
		
		System.out.println(random.nextInt(10));		//生成在0-(n-1)之间的随机数
	}

}
