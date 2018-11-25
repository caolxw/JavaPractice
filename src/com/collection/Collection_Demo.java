package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection �ӿ�
 * 	��ӣ�public boolean add(E e)
 * 		List���й̶�����true ��Ϊ��List�����п��Դ����ظ�Ԫ��
 * 		Set���д洢�ظ�Ԫ�ص�ʱ��ͻ᷵��false
 * 	ɾ����public boolean remove(Object obj)
 * 	��գ�public void clear() 
 * 	������public boolean contains(object o)
 * 	Ϊ�գ�public boolean isEmpty()
 * 	������public int size()
 */
public class Collection_Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();					//��AbstractCollection ����д��toString����
		System.out.println("----demo1 end----");
		demo2();
		System.out.println("----demo2 end----");
		demo3();
		System.out.println("----demo3 end----");
		demo4();
		System.out.println("----demo4 end----");
	}

	public static void demo4() {
		Collection collection = new ArrayList<>();		//��������ָ���������
		collection.add("abc");							//û��ָ������ ��������������͵�����
		collection.add(100);
		collection.add(true);
		System.out.println(collection.size());
	}

	public static void demo3() {
		Collection collection = new ArrayList<>();		//��������ָ���������
		collection.add("abc");							//û��ָ������ ��������������͵�����
		collection.add(100);
		collection.add(true);
		System.out.println(collection.contains(100));
		System.out.println(collection.contains(""));
		System.out.println(collection.isEmpty());
		collection.clear();
		System.out.println(collection.isEmpty());
	}

	public static void demo2() {
		Collection collection = new ArrayList<>();		//��������ָ���������
		collection.add("abc");							//û��ָ������ ��������������͵�����
		collection.add(100);
		collection.add(true);
		collection.remove(100);
		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
	}

	public static void demo1() {
		Collection collection = new ArrayList<>();		//��������ָ���������
		collection.add("abc");							//û��ָ������ ��������������͵�����
		collection.add(100);
		collection.add(true);
		
		System.out.println(collection);
	}

}
