package com.regex;

public class Regex_Demo2{
	public static void main(String[] args) {
		demo1();
		System.out.println("----demo1 end-----");
		
		demo2();
		System.out.println("----demo2 end-----");
		
		demo3();
		System.out.println("----demo3 end-----");
		
		demo4();
		System.out.println("----demo4 end-----");
		
		demo5();
		System.out.println("----demo5 end-----");
		
		demo6();
		System.out.println("----demo6 end-----");
		
		demo7();
		System.out.println("----demo7 end-----");
		
		demo8();
		System.out.println("----demo8 end-----");
		
		demo9();
		System.out.println("----demo9 end-----");
		
		demo10();
		System.out.println("----demo10 end-----");
	}

	public static void demo10() {
		String regex = "\\w";			//��ʾ [a-zA-Z_0-9]
		System.out.println("a".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("&".matches(regex));
		String regex2 = "\\W";			//�ǵ����ַ�
		System.out.println("a".matches(regex2));
		System.out.println("_".matches(regex2));
		System.out.println("&".matches(regex2));
	}

	public static void demo9() {
		String regex = "\\s";			//�հ��ַ�
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));	//Tab
		System.out.println("    ".matches(regex)); 	//�ĸ��ո�
		String regex2 = "\\S";			//�ǿհ��ַ�
		System.out.println(" ".matches(regex2));
		System.out.println("a".matches(regex2));
	}

	public static void demo8() {
		String regex = "\\d";			// \��Ҫת�� \d����[0-9]
		System.out.println("0".matches(regex));
		System.out.println("y".matches(regex));
		System.out.println("&".matches(regex));
		String regex2 = "\\D";			// \D ��ʾ [^0-9]
		System.out.println("0".matches(regex2));
		System.out.println("y".matches(regex2));
		System.out.println("&".matches(regex2));
	}

	public static void demo7() {
		String regex = ".";					//�����ַ�
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}

	public static void demo6() {
		String regex = "[a-z&&[^bc]]";		//��ȥ
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		
		String regex2 = "[a-z&&[^m-p]]";
		System.out.println("h".matches(regex2));
		System.out.println("n".matches(regex2));
	}

	public static void demo5() {
		String regex="[a-z&&[def]]";		//ȡ����
		System.out.println("a".matches(regex));
		System.out.println("e".matches(regex));
	}

	public static void demo4() {
		String regex = "[a-d[m-p]]";		//a-d �� m-p ����
		System.out.println("a".matches(regex));
		System.out.println("f".matches(regex));
		System.out.println("n".matches(regex));
		System.out.println("r".matches(regex));
	}

	public static void demo3() {
		String regex = "[a-zA-Z]";			//a-z,A-Z�������ַ�����ͷ������
		System.out.println("a".matches(regex));
		System.out.println("M".matches(regex));
	}

	public static void demo2() {
		String regex = "[^abc]";			//������abc�������ַ�
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("ad".matches(regex));
		System.out.println("10".matches(regex));
	}

	public static void demo1() {
		String regex = "[abc]";			//[]�������ַ�
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}
}