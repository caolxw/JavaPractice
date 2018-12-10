package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.bean.Person;

public class Test_Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
		
		
	}

	public static void demo2() throws Exception {
		/*
		 * ͨ������дһ��ͨ�õ�����ĳ�������ĳ������Ϊָ����ֵ
		 * public void setProperty(Object obj,String propertyName,Object value)
		 */
		Person person = new Person("Sam", 23);
		System.out.println(person);
		
		setProperty(person, "name", "Jack");
		System.out.println(person);
	}

	public static void demo1()
			throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		/*
		 * ���ͷ��䣬���Ͳ���
		 * ����
		 * 	ArrayList<Integer>��һ���������������������ַ���
		 * ����ֻ�ڱ�������Ч���������ڻᱳ������
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		
		Class clazz = Class.forName("java.util.ArrayList");			//��ȡ�ֽ������
		Method method = clazz.getMethod("add", Object.class);
		method.invoke(list, "abc");
		System.out.println(list);
	}
	
	public static void setProperty(Object obj,String propertyName,Object value) throws Exception
	{
		Class clazz = obj.getClass();
		Field field = clazz.getDeclaredField(propertyName);		//���������ȡ�ֶ�
		field.setAccessible(true);
		field.set(obj, value);
	}

}
