package com.exception;
/*
 * Throwable�ļ������÷���
 */
public class Throwable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(1 / 0);
		}catch (Exception e) {			//Exception e = new ArithmeticException("/ by zero");
			// TODO: handle exception
			System.out.println(e.getMessage());		//��ȡ�쳣��Ϣ �����ַ���
			System.out.println(e.toString()); 		//��ȡ�쳣�������쳣��Ϣ �����ַ���
			System.out.println(e); 					//�Զ�����toString()
			e.printStackTrace(); 					//��ȡ�쳣�������쳣��Ϣ �Լ��쳣�����ڳ����е�λ�� 
													//jvmĬ�ϴ���ʽ
		}
	}

}
