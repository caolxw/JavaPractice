package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 需求：模拟斗地主的洗牌和发牌
 */
public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color = {"♠","♥","♦","♣"};
		String[] value = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
//		ArrayList<String> poker = new ArrayList<>();
		
		HashMap<Integer, String> map = new HashMap<>();	//存储索引和扑克牌
		ArrayList<Integer> list = new ArrayList<>();	//存储索引，方便洗牌
		int index = 0;
		
		//拼接字符串
		/*for (String string : color) {
			for (String string2 : value) {
				poker.add(string.concat(string2));		//连接两个字符串
			}
		}
		poker.add("大王");
		poker.add("小王");
		*/
		
		//拼接扑克牌并将索引和扑克牌存储在map中
		for (String string : value) {
			for (String string2 : color) {
				map.put(index, string2.concat(string));
				list.add(index);
				index ++;
			}
		}
//		System.out.println(index);
		
		//添加小王，大王
		map.put(index, "小王");
		list.add(index);
		index ++;
		map.put(index, "小王");
		list.add(index);
		
//		System.out.println(poker);
		//洗牌
//		Collections.shuffle(poker);
		Collections.shuffle(list);		//洗牌就是随机索引的位置
		//发牌
		/*ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> bottom = new ArrayList<>();	//底牌
		*/
		
		//为了排序，创立TreeSet集合
		TreeSet<Integer> player1 = new TreeSet<>();
		TreeSet<Integer> player2 = new TreeSet<>();
		TreeSet<Integer> player3 = new TreeSet<>();
		TreeSet<Integer> bottom = new TreeSet<>();
		
		/*for(int i=0;i<poker.size();i++) {
			if (i>=poker.size()-3) {
				//先拿到三张底牌
				bottom.add(poker.get(i));
			}
			else if (i % 3 == 0) {
				player1.add(poker.get(i));
			}
			else if (i % 3 == 1) {
				player2.add(poker.get(i));
			}else {
				player3.add(poker.get(i));
			}
		}*/
		for(int i=0;i<list.size();i++) {
			if (i>=list.size()-3) {
				//先拿到三张底牌
				bottom.add(list.get(i));
			}
			else if (i % 3 == 0) {
				player1.add(list.get(i));
			}
			else if (i % 3 == 1) {
				player2.add(list.get(i));
			}else {
				player3.add(list.get(i));
			}
		}
		//查看三个玩家的牌 需要到map里面查看值
		/*
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		*/
		lookPoker(map, player1, "玩家1");
		lookPoker(map, player2, "玩家2");
		lookPoker(map, player3, "玩家3");
		lookPoker(map, bottom, "底牌");
	}
		
	/*
	 * 看牌
	 * 1，返回值：void
	 * 2,参数列表：HashMap,TreeSet,String
	 */
	
	public static void lookPoker(HashMap<Integer, String> map,TreeSet<Integer> set, String name) {
		System.out.print(name+"的牌是：[");
		for (Integer integer : set) {	//拿到双列集合中的每一个键
			System.out.print(map.get(integer)+" ");
			
		}
		System.out.println("]");
	}
}
