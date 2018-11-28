package com.map;

import java.util.HashMap;

import com.bean.Person;

/*
 * HashMap1嵌套HashMap1
 * 
 * 需求：
 * 一门课有多个班
 * 数学1班 定义成一个双列集合，键是Person对象，值是Person归属地
 * 数学2班 定义成一个双列集合，键是Person对象，值是Person归属地
 * 两个班都是班级对象，把班级添加到数学课程集合当中
 */
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person, String> hMap1 = new HashMap<>();
		hMap1.put(new Person("Sam",20), "UK");
		hMap1.put(new Person("Jack",20), "UK");
		hMap1.put(new Person("Lulu",19), "USA");
		hMap1.put(new Person("Lily",18), "UK");
		hMap1.put(new Person("Baobao",19), "China");
		
		HashMap<Person, String> hMap2 = new HashMap<>();
		hMap2.put(new Person("Khan",22), "SKT");
		hMap2.put(new Person("Uzi",20), "RNG");
		hMap2.put(new Person("iceiceice",22), "EHOME");
		
		
		//定义数学课堂
		HashMap<HashMap<Person, String>, String> hMap = new HashMap<>();
		hMap.put(hMap1, "数学1班");
		hMap.put(hMap2, "数学2班");
		
		//遍历嵌套
		for (HashMap<Person, String> h : hMap.keySet()) {	//hMap.keySet()拿到hmap键集合
			String value = hMap.get(h);						//得到班级名
			System.out.println(value);
			for (Person key : h.keySet()) {
				System.out.println(key+" "+h.get(key));		//h.get(key)得到归属地
			}
		}
		
	}

}
