package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.bean.Person;

public class Field_Demo {
/*
 * 通过反射获取成员变量并使用
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);		//获取有参构造
		Person person = (Person) c.newInstance("Sam",23);
		
		//获取字段并修改
//		Field f = clazz.getField("name");
		Field f = clazz.getDeclaredField("name"); 						//暴力反射获取字段
		f.setAccessible(true); 											//去除私有权限
		f.set(person, "Jack");
		System.out.println(person);
	}

}
