package com.map;

import java.util.HashMap;

/*
 * HashMap��Hashtable������
 * 	��ͬ�㣺
 * 		�ײ㶼�ǹ�ϣ�㷨������˫�м���
 * 	����
 * 		HashMap���̲߳���ȫ�ģ�Ч�ʸߣ�JDK1.2
 * 		Hashtable���̰߳�ȫ�ģ�Ч�ʵͣ�JDK1.0
 * 		
 * 		HashMap���Դ洢null����nullֵ��Hashtable�����ԡ�
 */
public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Sam", null);
		hashMap.put(null, 23);
		hashMap.put(null,null);			//�Ḳ��ǰ���hashMap.put("Sam", null);
		System.out.println(hashMap);
		
	}

}
