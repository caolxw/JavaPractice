package com.reflect;

import java.lang.reflect.Constructor;

import com.bean.Person;

public class Constructor_Demo {
/*
 * Constructor
 * 通过反射获取带参构造方法并使用
 * 	newInstance只是用于空参构造
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//获取有参构造
		Person person = (Person) c.newInstance("Sam",23);					//通过有参构造创建对象
		System.out.println(person);
	}

}
