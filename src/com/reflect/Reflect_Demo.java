package com.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reflect_Demo {
/*
 * ��ȡ�����ļ�
 * 	ͨ����ȡ�����ļ��������µĶ���
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(bReader.readLine());
		Fruit fruit = (Fruit) clazz.newInstance();				//��������ָ���������
		Juicer juicer = new Juicer();
		juicer.run(fruit);
	}

}

interface Fruit{
	public void squeeze();
}

class Apple implements Fruit {

	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.println("ե��һ��ƻ��֭��");
	}
	
}

class Orange implements Fruit {

	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.println("ե��һ������֭��");
	}
	
}

class Juicer {
	public void run(Fruit f) {
		f.squeeze();
	}
}