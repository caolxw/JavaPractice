package com.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.bean.Student;

public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo1();
		print(1);
		
		demo2();
		System.out.println();
		print(2);
		
		demo3();
		System.out.println();
		print(3);
		
		demo4();
		print(4);
	}

	public static void demo4() {
		/*
		 * 	键盘录入5个学生信息（学号，姓名，语文成绩，数学成绩，英语成绩）
		 * 	按照总分降序排序
		 */
		TreeSet<Student> tSet = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				double num = o2.getScoresum() - o1.getScoresum();
				return num == 0 ? 1:(int)num;
			}
			
		});
		Scanner scanner = new Scanner(System.in);
		System.out.println("demo4 输入学生信息：");
		while(tSet.size()<5) {
			String string = scanner.nextLine();
			String[] strings = string.split(",");
			Student student = new Student(Integer.parseInt(strings[0]),strings[1],Double.valueOf(strings[2]),Double.valueOf(strings[3]),Double.valueOf(strings[4]));
			tSet.add(student);
		}
		
		for (Student student : tSet) {
			System.out.println(student);
		}
	}

	public static void demo3() {
		/*
		 * 	从键盘输入若干个整数，直到quit结束。把所有的整数倒叙输出
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("demo3 输入整数：");
		TreeSet<Integer> tSet = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int num = o2 - o1;
				return num == 0 ? 1 : num;
			}
			
		});
		while(true) {
			String string = scanner.nextLine();
			if (string.equals("quit")) {
				break;
			}
			int i = Integer.parseInt(string);
			tSet.add(i);
		}
		for (Integer integer : tSet) {
			System.out.print(integer+" ");
		}
	}

	public static void demo2() {
		/*
		 *	 从键盘接收一个字符串，程序对字符串进行排序
		 *	例如：	输入：helloworld
					输出：dehllloorw
		 *
		 */
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("demo2 输入字符串：");
		String string = scanner.nextLine();
		char[] cs = string.toCharArray();
		TreeSet<Character> tSet = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		
		for (char c : cs) {
			tSet.add(c);
		}
		
		for (Character character : tSet) {
			System.out.print(character);
		}
	}

	public static void demo1() {
		/*
		 * 	在一个集合中存储无序且有重复的字符串，定义一个方法对其排序，并且不去除重复
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");
		list.add("cdef");
		list.add("bbb");
		list.add("abab");
		list.add("aabb");
		
		//定义方法对其排序
		sort(list);
		
		System.out.println(list);
	}

	/*
	 * 定义方法
	 * 	排序并保留重复
	 * 	TreeSet 并写比较器
	 */
	public static void sort(List<String> list) {
		// TODO Auto-generated method stub
		
		//采用匿名内部类
		TreeSet<String> tSet = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num = o1.compareTo(o2);			//比较内容为主要条件
				return num == 0 ? 1 : num;			//保留相同
			}
			
		});
		tSet.addAll(list);
		list.clear();
		list.addAll(tSet);
	}
	
	public static void print(int i) {
		System.out.println("---demo"+i+" end----");
	}

}
