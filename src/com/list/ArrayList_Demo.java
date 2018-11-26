package com.list;

import java.util.ArrayList;


/*
 * 集合嵌套
 * ArrayList 嵌套ArrayList
 */
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Student>> list = new ArrayList<>();	//大集合
		ArrayList<Student> first = new ArrayList<>();			//小集合
		first.add(new Student("Sam",21));
		first.add(new Student("Jack",22));
		first.add(new Student("Rrr",19));
		
		ArrayList<Student> second = new ArrayList<>();
		second.add(new Student("Su",21));
		second.add(new Student("Quan",22));
		second.add(new Student("Mask",20));
		
		list.add(first);
		list.add(second);
		//遍历
		for(ArrayList<Student> a:list) {
			for(Student s: a) {
				System.out.println(s);
			}
		}
 	}

}
