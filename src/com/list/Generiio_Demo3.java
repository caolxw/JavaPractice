package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * 泛型通配符 <?>
 * 		任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * ? extend E	向下限定 E及其子类
 * ? super E	向上限定 E及其父类
 */
public class Generiio_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<?> list = new ArrayList<String>();		//当右边的泛型不确定时 左边可以指定为?
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("张三",23));
		list2.add(new Student("张三",21));
		
		ArrayList<EStudent> list3 = new ArrayList<>();
		list3.add(new EStudent("李四", 24));
		list3.add(new EStudent("李四", 19));
		
		list2.addAll(list3);
		System.out.println(list2);
	}

}

class EStudent extends Student{
	public EStudent() {}
	public EStudent(String name,int age) {
		super(name, age);
		
	}
}