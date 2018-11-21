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
		 * 需求：
		 * 初始字符串：我我我....要..要.学学学...编...编程程程
		 * 输出字符串：我要学编程
		 */
		
		String string = "我我我....我要..要.学学学...编...编程程程";
		String string2 = string.replaceAll("\\.+", "");		//去除.
		System.out.println(string2.replaceAll("(.)\\1+", "$1"));	//$1表示第一个组的内容
	}

	public static void demo7() {
		/*
		 * 需求：按照叠词切割字符串：sdqqfgkkkhjpppklm;
		 */
		
		String string = "sdqqfgkkkhjpppklm";
		String regex = "(.)\\1+";				//+代表第一组出现一次或者多次
		String[] arr = string.split(regex);
		
		for(String string2 : arr) {
			System.out.println(string2);
		}
	}

	public static void demo6() {
		//叠词的正则表达式
		String regex = "(.)\\1(.)\\2";		//\\1表示第一组又出现一次 \\2表示第二组又出现一次
		System.out.println("aabb".matches(regex));
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐".matches(regex));
		
		String regex2 = "(..)\\1";
		System.out.println("abab".matches(regex2));
		System.out.println("快快乐乐".matches(regex2));
		System.out.println("快乐快乐".matches(regex2));
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
		String[] arr = s.split("\\.");		//通过正则表达式切割字符串
		for(String string : arr) {
			System.out.println(string);
		}
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
