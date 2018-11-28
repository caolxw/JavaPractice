package com.map;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 需求：模拟斗地主的洗牌和发牌
 */
public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color = {"♠","♥","♦","♣"};
		String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		ArrayList<String> poker = new ArrayList<>();
		
		//拼接字符串
		for (String string : color) {
			for (String string2 : value) {
				poker.add(string.concat(string2));		//连接两个字符串
			}
		}
		poker.add("大王");
		poker.add("小王");
		
//		System.out.println(poker);
		//洗牌
		Collections.shuffle(poker);
		//发牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> bottom = new ArrayList<>();	//底牌
		
		for(int i=0;i<poker.size();i++) {
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
		}
		
		//查看三个玩家的牌
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
	}

}
