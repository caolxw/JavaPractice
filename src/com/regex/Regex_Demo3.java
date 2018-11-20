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
		String regex = "[abc]{2}";			//X{n} 表示X，恰好n次
		System.out.println("ac".matches(regex));
		System.out.println("aba".matches(regex));
		System.out.println("abcabc".matches(regex));
		String regex2 = "[abc]{3,}";		//X{n,} 表示X,至少n次
		System.out.println("ac".matches(regex2));
		System.out.println("aba".matches(regex2));
		System.out.println("abcabc".matches(regex2));
		String regex3 = "[abc]{3,5}";		//X{n,m} 表示X 至少n次，至多m次
		System.out.println("aca".matches(regex3));
		System.out.println("abab".matches(regex3));
		System.out.println("abcabc".matches(regex3));
	}

	public static void demo2() {
		String regex = "[abc]+";			//X+ 表示X一次或多次
		System.out.println("".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("abab".matches(regex));
	}

	public static void demo1() {
		String regex = "[abc]?";			//X? 表示X一次或一次也没有
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("".matches(regex)); 		//零次
		String regex2 = "[abc]*";			//X* 表示零次或多次
		System.out.println("ab".matches(regex2));
		System.out.println("a".matches(regex2));
		System.out.println("".matches(regex2));
	}

}
