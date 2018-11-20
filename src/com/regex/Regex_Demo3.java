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
