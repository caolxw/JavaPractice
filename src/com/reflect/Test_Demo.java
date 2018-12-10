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
		 * 通过反射写一个通用的设置某个对象的某个属性为指定的值
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
		 * 泛型反射，泛型擦除
		 * 需求：
		 * 	ArrayList<Integer>的一个对象，在这个集合中添加字符串
		 * 泛型只在编译期有效，在运行期会背擦除掉
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		
		Class clazz = Class.forName("java.util.ArrayList");			//获取字节码对象
		Method method = clazz.getMethod("add", Object.class);
		method.invoke(list, "abc");
		System.out.println(list);
	}
	
	public static void setProperty(Object obj,String propertyName,Object value) throws Exception
	{
		Class clazz = obj.getClass();
		Field field = clazz.getDeclaredField(propertyName);		//暴力反射获取字段
		field.setAccessible(true);
		field.set(obj, value);
	}

}
