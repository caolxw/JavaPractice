package com.map;

import java.util.HashMap;

import com.bean.Person;

/*
 * HashMap1Ƕ��HashMap1
 * 
 * ����
 * һ�ſ��ж����
 * ��ѧ1�� �����һ��˫�м��ϣ�����Person����ֵ��Person������
 * ��ѧ2�� �����һ��˫�м��ϣ�����Person����ֵ��Person������
 * �����඼�ǰ༶���󣬰Ѱ༶��ӵ���ѧ�γ̼��ϵ���
 */
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person, String> hMap1 = new HashMap<>();
		hMap1.put(new Person("Sam",20), "UK");
		hMap1.put(new Person("Jack",20), "UK");
		hMap1.put(new Person("Lulu",19), "USA");
		hMap1.put(new Person("Lily",18), "UK");
		hMap1.put(new Person("Baobao",19), "China");
		
		HashMap<Person, String> hMap2 = new HashMap<>();
		hMap2.put(new Person("Khan",22), "SKT");
		hMap2.put(new Person("Uzi",20), "RNG");
		hMap2.put(new Person("iceiceice",22), "EHOME");
		
		
		//������ѧ����
		HashMap<HashMap<Person, String>, String> hMap = new HashMap<>();
		hMap.put(hMap1, "��ѧ1��");
		hMap.put(hMap2, "��ѧ2��");
		
		//����Ƕ��
		for (HashMap<Person, String> h : hMap.keySet()) {	//hMap.keySet()�õ�hmap������
			String value = hMap.get(h);						//�õ��༶��
			System.out.println(value);
			for (Person key : h.keySet()) {
				System.out.println(key+" "+h.get(key));		//h.get(key)�õ�������
			}
		}
		
	}

}
