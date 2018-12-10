package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.bean.Person;

public class Field_Demo {
/*
 * ͨ�������ȡ��Ա������ʹ��
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//��ȡ�вι���
		Person person = (Person) c.newInstance("Sam",23);
		
		//��ȡ�ֶβ��޸�
//		Field f = clazz.getField("name");
		Field f = clazz.getDeclaredField("name"); 						//���������ȡ�ֶ�
		f.setAccessible(true); 											//ȥ��˽��Ȩ��
		f.set(person, "Jack");
		System.out.println(person);
	}

}
