package com.thread;
/*
 * ����ģʽ��һ����
 */
import java.io.IOException;

public class Runtime_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();		//��ȡ����ʱ����
//		runtime.exec("shutdown -s -t 300");			//5���Ӻ�ػ�
		runtime.exec("shutdown -a");				//ȡ��
	}

}
