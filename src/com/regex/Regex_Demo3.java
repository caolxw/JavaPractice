package com.regex;

public class Regex_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		System.out.println("-----demo1 end-----");
		
		demo2();
		System.out.println("-----demo2 end-----");
		
		demo3();
		System.out.println("-----demo3 end-----");
		
		demo4();
		System.out.println("-----demo4 end-----");
		
		demo5();
		System.out.println("-----demo5 end-----");
		
		demo6();
		System.out.println("-----demo6 end-----");
		
		demo7();
		System.out.println("-----demo7 end-----");
		
		demo8();
		System.out.println("-----demo8 end-----");
	}

	public static void demo8() {
		/*
		 * ����
		 * ��ʼ�ַ�����������....Ҫ..Ҫ.ѧѧѧ...��...��̳̳�
		 * ����ַ�������Ҫѧ���
		 */
		
		String string = "������....��Ҫ..Ҫ.ѧѧѧ...��...��̳̳�";
		String string2 = string.replaceAll("\\.+", "");		//ȥ��.
		System.out.println(string2.replaceAll("(.)\\1+", "$1"));	//$1��ʾ��һ���������
	}

	public static void demo7() {
		/*
		 * ���󣺰��յ����и��ַ�����sdqqfgkkkhjpppklm;
		 */
		
		String string = "sdqqfgkkkhjpppklm";
		String regex = "(.)\\1+";				//+�����һ�����һ�λ��߶��
		String[] arr = string.split(regex);
		
		for(String string2 : arr) {
			System.out.println(string2);
		}
	}

	public static void demo6() {
		//���ʵ�������ʽ
		String regex = "(.)\\1(.)\\2";		//\\1��ʾ��һ���ֳ���һ�� \\2��ʾ�ڶ����ֳ���һ��
		System.out.println("aabb".matches(regex));
		System.out.println("�������".matches(regex));
		System.out.println("���ֿ���".matches(regex));
		
		String regex2 = "(..)\\1";
		System.out.println("abab".matches(regex2));
		System.out.println("�������".matches(regex2));
		System.out.println("���ֿ���".matches(regex2));
	}

	public static void demo5() {
		String string = "I'm a1 cute2 panda";
		String regex = "\\d";
		String string2 = "I'm a1 cute2344 panda";
		
		System.out.println(string.replaceAll(regex, ""));
		System.out.println(string2.replaceAll(regex, ""));
	}

	public static void demo4() {
		String s = "Sam .Jame .Jack .Tom";
		String[] arr = s.split("\\.");		//ͨ��������ʽ�и��ַ���
		for(String string : arr) {
			System.out.println(string);
		}
	}

	public static void demo3() {
		String regex = "[abc]{2}";			//X{n} ��ʾX��ǡ��n��
		System.out.println("ac".matches(regex));
		System.out.println("aba".matches(regex));
		System.out.println("abcabc".matches(regex));
		String regex2 = "[abc]{3,}";		//X{n,} ��ʾX,����n��
		System.out.println("ac".matches(regex2));
		System.out.println("aba".matches(regex2));
		System.out.println("abcabc".matches(regex2));
		String regex3 = "[abc]{3,5}";		//X{n,m} ��ʾX ����n�Σ�����m��
		System.out.println("aca".matches(regex3));
		System.out.println("abab".matches(regex3));
		System.out.println("abcabc".matches(regex3));
	}

	public static void demo2() {
		String regex = "[abc]+";			//X+ ��ʾXһ�λ���
		System.out.println("".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("abab".matches(regex));
	}

	public static void demo1() {
		String regex = "[abc]?";			//X? ��ʾXһ�λ�һ��Ҳû��
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("".matches(regex)); 		//���
		String regex2 = "[abc]*";			//X* ��ʾ��λ���
		System.out.println("ab".matches(regex2));
		System.out.println("a".matches(regex2));
		System.out.println("".matches(regex2));
	}

}
