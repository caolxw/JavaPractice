package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		System.out.println("-----demo1 end-----");
		
		/*
		 * Pattern的应用
		 * 需求：把一个字符串中的手机号码获取出来
		 */
		String string = "我的手机号码是18988888888，曾经用过18987654321，要用过18812345678";
		//获取三个手机号码
		String regex = "1[0-9]\\d{9}";					//手机号码的正则表达式
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
//		System.out.println(matcher.matches());
		
		/*boolean b = matcher.find();						//找是否有与匹配器匹配的子串
		String s1 = matcher.group();
		System.out.println(s1);*/
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

	public static void demo1() {
		Pattern pattern = Pattern.compile("a*b");		//获取正则表达式
		Matcher matcher = pattern.matcher("aaaaab");	//获取匹配器
		boolean b = matcher.matches();					//看是否匹配，匹配就返回true
		System.out.println(b);
		
		System.out.println("aaaaab".matches("a*b"));	//与上面一样的效果
	}

}
