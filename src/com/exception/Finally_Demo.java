package com.exception;
/*
 * finally
 * 
 * final	�����ࣨ���ܱ��̳У������η��������ܱ���д�������α�����ֻ�ܸ�ֵһ�Σ�
 * finally	���ܵ���ʹ�ã�ֻ�ܺ�try...catch...���ʹ�ã������ͷ���Դ
 * finalize	һ������
 */
public class Finally_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println((double)1 / 10);
			System.out.println(10 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			System.exit(0); 						//��ֱ���˳�jvm�����������ִ��finally
			return;									//return������finallyִ����֮����ִ��
		}finally {
			System.out.println("������ִ������");		//һ����ִ��
		}
	}

}
