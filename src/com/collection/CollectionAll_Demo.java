package com.collection;
/*
 * boolean addAll(Collection c)
 * boolean removeAll(Collection c)
 * boolean containsAll(Collection c)
 * boolean retailAll(Collection c)
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionAll_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		System.out.println("----demo1 end----");
		
		demo2();
		System.out.println("----demo2 end----");
		
		demo3();
		System.out.println("----demo3 end----");
		
		demo4();
		System.out.println("----demo4 end----");
	}

	public static void demo4() {
		Collection<String> c1 = new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		c1.add("f");
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.retainAll(c2);//ȡ����  ������õļ��ϸı�ͷ���true ���򷵻�false
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo3() {
		Collection<String> c1 = new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		c1.add("f");
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("a");
		c2.add("b");
		System.out.println(c1.containsAll(c2)); 			//ȫ������
	}

	public static void demo2() {
		Collection c1 = new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		c1.add("f");
		
		Collection c2 = new ArrayList<>();
		c2.add("a");
		c2.add("b");
		c2.add("y");
		
		c1.removeAll(c2);					//ɾ������
		System.out.println(c1);
	}

	public static void demo1() {
		Collection c1 = new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		c1.add("f");
		
		Collection c2 = new ArrayList<>();
		c2.add("z");
		c2.add("x");
		c2.add("y");
		
		c2.addAll(c1);						//��c1 ȫ����ӵ�c2��
		System.out.println(c2);
		c2.add(c1);
		System.out.println(c2); 			//��c1��Ϊһ��������ӵ�c1����
	}

}
