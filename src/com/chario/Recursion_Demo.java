package com.chario;
/*
 * �ݹ飺�����Լ������Լ�
 */
public class Recursion_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5!
		 * for �� �ݹ�
		 * 
		 * �ݹ�ı׶ˣ����ܵ��ô������࣬����ջ�ڴ����
		 * �ݹ�ĺô�������֪��ѭ���Ĵ���
		 * 
		 * ���췽��������ʹ�õݹ����
		 */
		int result = 1;
		for(int i = 1; i <= 5; i++) {
			result = result * i;
		}
		System.out.println(result);
		
		System.out.println(fun(5));
	}
	
	public static int fun(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n*fun(n-1);
		}
	}

}
