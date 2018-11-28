package com.map;

import java.util.HashMap;

/*
 * HashMap和Hashtable的区别
 * 	共同点：
 * 		底层都是哈希算法，都是双列集合
 * 	区别：
 * 		HashMap是线程不安全的，效率高，JDK1.2
 * 		Hashtable是线程安全的，效率低，JDK1.0
 * 		
 * 		HashMap可以存储null键和null值。Hashtable不可以。
 */
public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Sam", null);
		hashMap.put(null, 23);
		hashMap.put(null,null);			//会覆盖前面的hashMap.put("Sam", null);
		System.out.println(hashMap);
		
	}

}
