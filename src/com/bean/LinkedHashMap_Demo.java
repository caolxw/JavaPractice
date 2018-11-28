package com.bean;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("Sam", 23);
		lhm.put("Ruby",23);
		lhm.put("Jack", 20);
		lhm.put("Rose", 20);
		System.out.println(lhm);
	}

}
