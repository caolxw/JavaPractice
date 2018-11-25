package com.collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List
 * 	Collection���ӽӿ�
 * 	���з���
 * 	void add(int index,E element) index<=size && index>=0
 * 	E remove(int index)
 *  E get(int index)
 *  E set(int index,E element)
 *  
 *  List 
 *  	��ѯ�ࣺArrayList
 *  	��ɾ�ࣺLinkedList
 *  	���ࣺ ArrayList
 */
public class List_Demo {

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
	}

	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

	public static void demo4() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(1, "x");					//�޸�ָ��λ�õ�Ԫ��
		System.out.println(list);
	}

	public static void demo3() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.get(3));	//���ָ������λ�õ�Ԫ�� ע�������쳣
		
		//List���� ͨ������
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	public static void demo2() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object object = list.remove(1);		//ɾ��ָ��λ�õ�Ԫ�� ����Ԫ��ֵ
		System.out.println(object);
		System.out.println(list);
		
		list.add(111);
		list.add(222);
		//list.remove(111);					//ɾ����ʱ�򲻻��Զ�װ�� ��111��������
	}

	public static void demo1() {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list.add(1,"x");					//��ָ��λ�����Ԫ�� �����ע�������쳣 
		System.out.println(list);
	}

}
