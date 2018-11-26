package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * ��ǿforѭ��
 * �ײ��������ǵ�������Iterator��
 * 
 * ����ѭ��
 * forѭ��		����ɾ����ͨ������ɾ��Ԫ��
 * Iterator 	����ɾ������Ҫ���Դ���remove����
 * foreachѭ��  	 ������ɾ��
 */
public class Foreach_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1();
		print(1);
		demo2();
		print(2);
		
		demo3();
		print(3);
		
		demo4();
		print(4);
		
		demo5();
		print(5);

	}

	public static void demo5() {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		list.add(9);
		list.add(13);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if (iterator.next() == 9) {
				iterator.remove();				//���ܲ��ü��ϵ��޸ķ���������������޸��쳣
			}
		}
		System.out.println(list);
	}

	public static void demo4() {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		list.add(9);
		list.add(13);
		for(int i=0;i<list.size();i++) {
			if (list.get(i) == 9) {
//				list.remove(i);					//������Ҫɾ����Ԫ�ػᱣ��һ��
				list.remove(i--);
			}
		}
		System.out.println(list);
	} 

	public static void demo3() {
		//�Զ���������
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("����",24));
		list.add(new Student("����",22));
		list.add(new Student("������",22));
		list.add(new Student("������",21));
		list.add(new Student("���",19));
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public static void demo2() {
		//��������
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(9);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static void demo1() {
		//��������
		int[] arr = {20,23,25,27,29,10};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}
