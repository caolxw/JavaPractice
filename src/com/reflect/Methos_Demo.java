package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.bean.Person;

public class Methos_Demo {
/*
 * 通过反射获得方法并使用
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//获取有参构造
		Person person = (Person) c.newInstance("Sam",23);
		
		Method method = clazz.getMethod("eat");								//获取方法
		method.invoke(person);
		
		//有参数的方法
		Method method2 = clazz.getMethod("eat", int.class);
		method2.invoke(person, 1000);
		
	}

}
