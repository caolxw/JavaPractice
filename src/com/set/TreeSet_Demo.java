package com.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.bean.Person;

/*
 * TreeSet
 * 	������Ԫ�ؽ������� ͬʱ��֤Ԫ�ص�Ψһ��
 * 
 * 	�ײ�Ϊ���������
 * 	С�Ĵ��������� ��Ĵ��������� ����򲻴�
 * 	��δ洢Ԫ��ȡ����ComparaTo()����
 * 
 * 	������ֻ��һ��Ԫ��	 ��ComparableTo() ����0
	��������ô����ôȡ 	��ComparableTo() ��������
	��������ô�浹��ȡ  	��ComparableTo() ���ظ���
	
 */
public class TreeSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		System.out.println("�鿴demo3��ע��");
		print(3);
		
		demo4();
		print(4);
	}


	public static void demo4() {
		/*
		 * 	���ַ������Ƚ�������
		 * 	�����Զ���ıȽ���
		 */
		TreeSet<String> tSet = new TreeSet<>(new CompareByLen());	//��������� Ĭ��Comparable c = new Comparable()
		tSet.add("aaa");
		tSet.add("zzz");
		tSet.add("xv");
		tSet.add("skt");
		tSet.add("abcdefg");
		System.out.println(tSet);
	}


	public static void demo3() {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("Sam",23));
		tSet.add(new Person("Sam",23));
		tSet.add(new Person("Jack",22));
		tSet.add(new Person("Ruby",23));
		tSet.add(new Person("Ruby",23));
		tSet.add(new Person("Lulu",14));
		/*
		 * 	������������
		 * 	public int comparaTo(Person o) {
				int num = this.name.comparaTo(o.name);
				return num == 0 ? this.age - o.age : num;
			}
		 */
		
		/*
		 * 	��������������
		 * public int comparaTo(Person o) {
				int length = this.name.length() - o.name.length();
				int num = length == 0 ? this.name.comparaTo(o.name) : length;
				return num == 0 ? this.age - o.age : num;
			}
		 * 
		 */
	}
	
	
	public static void demo2() {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("Sam",23));
		tSet.add(new Person("Sam",23));
		tSet.add(new Person("Jack",22));
		tSet.add(new Person("Ruby",23));
		tSet.add(new Person("Ruby",20));
		tSet.add(new Person("Lulu",20));
//		System.out.println(tSet); 				//���� û�м̳�Comparable
//		System.out.println(tSet);	
		for (Person person : tSet) {
			System.out.println(person);
		}
	}

	public static void demo1() {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(3);
		tSet.add(1);
		tSet.add(2);
		tSet.add(1);
		tSet.add(3);
		System.out.println(tSet);			//Ԫ��Ψһ������
	}
	
	public static void print(int i) {
		System.out.println("---demo"+i+" end----");
	}

}

class CompareByLen implements Comparator<String>{

	public int compare(String o1,String o2) {
		// TODO Auto-generated method stub
		//�����ַ����ĳ��ȱȽ�
		//���õĶ����ǵ�һ������  �����е�Ԫ���ǵڶ�������
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}
	
}
