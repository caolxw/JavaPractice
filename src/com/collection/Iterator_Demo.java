package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 	������ Iterator
 */
public class Iterator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		System.out.println("----demo1 end----");
		
		demo2();
		System.out.println("----demo2 end----");
	}

	public static void demo2() {
		//����������������
		Collection<Student> collection = new ArrayList<>();
		collection.add(new Student("����",20));
		collection.add(new Student("��һ",21));
		collection.add(new Student("�Ŷ�",18));
		collection.add(new Student("����",20));
		
		Iterator<Student> iterator = collection.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			
			Student student = (Student)iterator.next();					//�������͵�����ת��
			System.out.println(student.getName()+" "+student.getAge());
		}
	}

	public static void demo1() {
		Collection<String> collection = new ArrayList<>();
		collection.add("abc");
		collection.add("bcd");
		collection.add("cde");
		collection.add("def");
		collection.add("efg");
		collection.add("fgh");
		
		//�Լ����е�Ԫ�ص���
		Iterator<String> iterator = collection.iterator();		//��ȡ������
		while(iterator.hasNext()) {						//�ж��Ƿ���Ԫ��
			System.out.println(iterator.next()); 		//��ȡԪ��
		}
	}

}
