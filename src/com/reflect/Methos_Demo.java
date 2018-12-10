package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.bean.Person;

public class Methos_Demo {
/*
 * ͨ�������÷�����ʹ��
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//��ȡ�вι���
		Person person = (Person) c.newInstance("Sam",23);
		
		Method method = clazz.getMethod("eat");								//��ȡ����
		method.invoke(person);
		
		//�в����ķ���
		Method method2 = clazz.getMethod("eat", int.class);
		method2.invoke(person, 1000);
		
	}

}
