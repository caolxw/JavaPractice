package com.collection;

/*
 * 	并发修改异常解决办法
 * 	List特有的 ListIterator迭代器
 * 
 * 	需求：如果在list中有 "world"，则添加一个元素为 "java"
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
				list.add("java");						//并发修改导致报错		
			}
		}*/
		
		ListIterator<String> lIterator = list.listIterator();
		while(lIterator.hasNext()) {
			String string = lIterator.next();
			if(string.equals("world")) {
				lIterator.add("java");					//用特有的方法添加元素
			}
		}
		System.out.println(list);
	}

}
