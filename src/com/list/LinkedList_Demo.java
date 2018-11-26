package com.list;

import java.util.LinkedList;

/*
 * LikedList 
 * 	底层运用链表存储
 * 
 * void addFirst(E e)
 * void addLast(E e)
 * E getFirdt()
 * E getLast()
 * E removeFirst()
 * E removeLast()
 * E get(int index)
 */
public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		System.out.println("----demo1 end----");
		
		demo2();
		System.out.println("----demo2 end----");
	}

	public static void demo2() {
		/*
		 * 用LinkedList模拟栈结构
		 */
		LinkedList<String> list = new LinkedList<>();
		list.addLast("a");						//进栈
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("e");
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());		//出栈
		}
	}

	public static void demo1() {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addFirst("e");
		list.addLast("f");
		System.out.println(list);
		System.out.println("第一个元素"+list.getFirst());
		System.out.println("最后一个元素"+list.getLast());
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		System.out.println(list.removeLast());
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

}
