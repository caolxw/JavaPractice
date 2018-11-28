package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 	需求：统计字符串中每个字符出现的次数
 */
public class Map_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		char[] arr = line.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : arr) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			}else {
//				int num = map.get(c);
//				map.put(c, ++num);
				map.put(c, map.get(c)+1);
			}
			/*
			 * 简易写法：
			 * 	map.put(c,!map.containsKey(c) ? 1 : map.get(c)+1);
			 */
		}
		
//		System.out.println(map);
		for (char c : map.keySet()) {
			System.out.println(c+" = "+map.get(c));
		}
	}

}
