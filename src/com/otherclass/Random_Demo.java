package com.otherclass;

import java.util.Random;

public class Random_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---�޲ι���---");
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x); 				//����int��Χ�ڵ������
		
		/*
		 * �鿴�Ƿ�Ϊ�����
		 */
		for(int i=0;i<5;i++) {
			System.out.println(random.nextInt());	//���ɵ���������ͬ��
		}
		
		/*
		 * ָ�����Ӻ����ɵ�Ϊα�����
		 */
		System.out.println("---�вι���---");
		Random random2 = new Random(1000);
		int n = random2.nextInt();
		int m = random2.nextInt();
		System.out.println(n);
		System.out.println(m);						//�����������Σ�������һ����n,m
		
		System.out.println(random.nextInt(10));		//������0-(n-1)֮��������
	}

}
