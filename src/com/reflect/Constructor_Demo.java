package com.reflect;

import java.lang.reflect.Constructor;

import com.bean.Person;

public class Constructor_Demo {
/*
 * Constructor
 * ͨ�������ȡ���ι��췽����ʹ��
 * 	newInstanceֻ�����ڿղι���
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//��ȡ�вι���
		Person person = (Person) c.newInstance("Sam",23);					//ͨ���вι��촴������
		System.out.println(person);
	}

}
