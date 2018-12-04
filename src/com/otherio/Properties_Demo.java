package com.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/*
 * Properties
 * 	��ʾһ���־õ����Լ�
 * 	�����б���ÿһ���������Ӧֵ����һ���ַ���
 * 	������Ϊһ��map����ʹ��
 */
public class Properties_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		/*
		 * �����ļ��Ķ�ȡ
		 */
		Properties prop = new Properties();
		System.out.println("��ȡǰ��"+prop);
		prop.load(new FileInputStream("config.properties"));
		System.out.println("��ȡ��"+prop);
		prop.setProperty("tel", "19888888888");
		System.out.println("�޸ĺ�"+prop); 						//�鿴�ļ���û���޸�
		prop.store(new FileOutputStream("config.properties"), "xxx");	//�޸�Ӳ���ϵ������ļ� �ڶ����������������ļ��б�� ������������Դ�null
		System.out.println("�޸��ļ���"+prop);
	}

	public static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "Sam");
		prop.setProperty("tel", "19812345678");
//		System.out.println(prop);
		//����
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
			String key = en.nextElement();			//��ȡÿһ����
			String value = prop.getProperty(key);	//���ݼ���ȡֵ
			System.out.println(key+":"+value);
		}
	}

	public static void demo1() {
		Properties prop = new Properties();
		prop.put("abc", 123);
		System.out.println(prop);
	}
	
	public static void print(int i) {
		System.out.println("-----demo"+i+" end-----");
	}

}
