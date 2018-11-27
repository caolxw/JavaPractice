package com.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.bean.Person;

/*
 * TreeSet
 * 	用来对元素进行排序 同时保证元素的唯一性
 * 
 * 	底层为排序二叉树
 * 	小的存在左子树 大的存在右子树 相等则不存
 * 	如何存储元素取决于ComparaTo()方法
 * 
 * 	集合中只有一个元素	 当ComparableTo() 返回0
	集合中怎么存怎么取 	当ComparableTo() 返回正数
	集合中怎么存倒数取  	当ComparableTo() 返回负数
	
 */
public class TreeSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		System.out.println("查看demo3的注释");
		print(3);
		
		demo4();
		print(4);
	}


	public static void demo4() {
		/*
		 * 	将字符串长度进行排序
		 * 	许传入自定义的比较器
		 */
		TreeSet<String> tSet = new TreeSet<>(new CompareByLen());	//不传入参数 默认Comparable c = new Comparable()
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
		 * 	按照姓名排序
		 * 	public int comparaTo(Person o) {
				int num = this.name.comparaTo(o.name);
				return num == 0 ? this.age - o.age : num;
			}
		 */
		
		/*
		 * 	按姓名长度排序
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
//		System.out.println(tSet); 				//报错 没有继承Comparable
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
		System.out.println(tSet);			//元素唯一且有序
	}
	
	public static void print(int i) {
		System.out.println("---demo"+i+" end----");
	}

}

class CompareByLen implements Comparator<String>{

	public int compare(String o1,String o2) {
		// TODO Auto-generated method stub
		//按照字符串的长度比较
		//调用的对象是第一个参数  集合中的元素是第二个参数
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}
	
}
