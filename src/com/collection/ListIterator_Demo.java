package com.collection;

/*
 * 	�����޸��쳣����취
 * 	List���е� ListIterator������
 * 
 * 	���������list���� "world"�������һ��Ԫ��Ϊ "java"
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("world");
		
		/*Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			if(string.equals("world")) {
				list.add("java");						//�����޸ĵ��±���		
			}
		}*/
		
		ListIterator<String> lIterator = list.listIterator();
		while(lIterator.hasNext()) {
			String string = lIterator.next();
			if(string.equals("world")) {
				lIterator.add("java");					//�����еķ������Ԫ��
			}
		}
		System.out.println(list);
	}

}
