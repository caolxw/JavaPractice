package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		System.out.println("-----demo1 end-----");
		
		/*
		 * Pattern��Ӧ��
		 * ���󣺰�һ���ַ����е��ֻ������ȡ����
		 */
		String string = "�ҵ��ֻ�������18988888888�������ù�18987654321��Ҫ�ù�18812345678";
		//��ȡ�����ֻ�����
		String regex = "1[0-9]\\d{9}";					//�ֻ������������ʽ
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
//		System.out.println(matcher.matches());
		
		/*boolean b = matcher.find();						//���Ƿ�����ƥ����ƥ����Ӵ�
		String s1 = matcher.group();
		System.out.println(s1);*/
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

	public static void demo1() {
		Pattern pattern = Pattern.compile("a*b");		//��ȡ������ʽ
		Matcher matcher = pattern.matcher("aaaaab");	//��ȡƥ����
		boolean b = matcher.matches();					//���Ƿ�ƥ�䣬ƥ��ͷ���true
		System.out.println(b);
		
		System.out.println("aaaaab".matches("a*b"));	//������һ����Ч��
	}

}
