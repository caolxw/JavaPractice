package com.bean;

import java.io.Serializable;

public class Person implements Comparable<Person>,Serializable{
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) /*throws Exception*/{		//声明异常
		if (age >= 0) {
			this.age = age;
		}else {
			System.out.println("请回火星吧！");
//			throw new Exception("年龄非法");	
			
			//抛出运行时异常 不用在方法上声明
			throw new RuntimeException("年龄非法");				//抛出异常
			
		}
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {						//如果返回的是一个固定值 会调用equals()
												//hashCode()值相同的时候，会运用equals方法进行比较
		final int prime = 31;					//1,31是质数。2,31既不大也不小。3,2^5 - 1 = 31		
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());		//字符串中重写了hashCode()
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("正在执行equals...");
		
		//健壮性判断
		if (this == obj)					//调用对象和传入对象是同一个对象
			return true;
		if (obj == null)					//传入对象是null
			return false;
		if (getClass() != obj.getClass())	//调用对象和传入对象不是同一个类
			return false;
		Person other = (Person) obj;		//向下转型
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		/*//按年龄升序排序
		if (o.age == this.age) {
			return 0;
		}else if(o.age>this.age){
			return -1;
		}else {
			return 1;
		}*/
//		return this.age-o.age;								//简易写法  会导致年龄相同全都不存
		
		
		int num = this.age - o.age;							//年龄是比较的主要条件
		//String的ComparableTo()已经重写过了 按照字典顺序排序
		return num == 0 ? this.name.compareTo(o.name):num;	//姓名是比较的次要条件
		
	}
	
	public void eat() {
		System.out.println("今天吃了一顿金钱豹");
	}
	
	public void eat(int num) {
		System.out.println("今天吃了"+num+"元的大餐");
	}
}
