package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import java.util.*;

/*
 * Map��һ���ӿ�
 * Map<K,V> ��ֵK��Ψһ��.
 * 
 * �����������Ͱ�����byte short int long float double char boolean
 * 	��Ӧ�ķ�װ�ࣺ  Byte	Short Integer Long Float Double Character Boolean
 * �����������Ͱ������ࡢ�ӿ����͡��������͡�ö�����͡�ע�����ͣ��ַ����ͣ�
 * 
 * ��ӣ�V put(K key,V value) 
 * 		����ǵ�һ�δ洢���᷵��null
 * ɾ����	void clear()
 * 		V remove(Object key)	���ݼ�ɾ��ֵ������ֵ����
 * ������	boolean containsKey(Object key)
 * 		boolean containsValue(Object value)
 * 		boolean isEmpty()
 * ������û�е�������map���ϲ�����ֱ�ӵ�����
 * 		V get(key) ͨ������ȡֵ
 * 		Set<K> keySet() ��ȡ���еļ�ֵ
 */
public class Map_Demo {

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
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(26, 'z');
		map.put(25, 'y');
		
		//Map.Entry˵��Entry��Map���ڲ��ӿڣ�������ֵ��װ����Entry���󣬲��洢��Set����
		Set<Map.Entry<Integer, Character>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, Character>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			//��ȡÿһ��Entry����
			Map.Entry<Integer, Character> entry = iterator.next();		//��������ָ���������
			int key = entry.getKey();
			char value = entry.getValue();
			System.out.println(key+" = "+value);
		}
		
		//��ǿforѭ��
		for (Map.Entry<Integer, Character> entry : entries) {
			System.out.println(entry.getKey()+" ... "+entry.getValue());
		}
	}

	public static void demo4() {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		char c = map.get(1);
		System.out.println(c);		//���ݼ���ȡֵ
		
		//��ȡ���еļ� ���õ���������
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			char ch = map.get(key);
			System.out.println(key +" = "+ch);
		}
		
		//ʹ����ǿforѭ��
		for(int key : keyset) {
			System.out.println(key+" "+map.get(key));
		}
	}

	public static void demo3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Lucy", 22);
		Collection<Integer> collection = map.values();		//�õ����е�valueֵ
		System.out.println(collection);
		System.out.println(map.size());
	}

	public static void demo2() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Lucy", 22);
		
		Integer integer = map.remove("Sam");
		System.out.println(integer);
		System.out.println(map);
		System.out.println(map.containsKey("Lucy"));
		System.out.println(map.containsValue(20));
	}

	public static void demo1() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sam", 23);
		map.put("Jack", 22);
		map.put("Lulu", 20);
		map.put("Sam", 19);			//��ͬ�ļ����洢 ֵ����
		System.out.println(map);
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}
}
