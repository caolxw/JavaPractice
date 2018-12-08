package com.thread;
/*
 * 单例设计模式：保证类再内存中只有一个对象
 * 
 * 饿汉式和懒汉式的区别
 * 	饿汉式：空间换时间	多线程时不会创建多个对象
 * 	懒汉式：时间换空间	多线程时可能会创建多个对象
 */
public class Singleton_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
		
		/*Singleton s1 =  Singleton.singleton;		//成员变量被私有，不能通过类名调用
		Singleton.singleton = null;
		Singleton s2 =  Singleton.singleton;
		//查看两个对象是否为同一个对象
		System.out.println(s1 == s2);
		*/
		Singleton s1 = Singleton.singleton;
	}

}

/*
 * 饿汉式	开发用这种方式

class Singleton{
	//1，私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	
	//2,创建本类对象
	private static Singleton singleton = new Singleton();
	
	//3，对外公共的提供访问方法
	public static Singleton getInstance() {					//获取实例
		return singleton;
	}
} */

/*
 * 懒汉式,单例的延迟加载模式
 * 	在多线程访问时，可能会创建多个对象，有安全问题

class Singleton{
	//1，私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	
	//2,声明一个引用
	private static Singleton singleton;
	
	//3，对外公共的提供访问方法
	public static Singleton getInstance() {					//获取实例
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
} */

class Singleton{
	//1，私有构造方法,其他类不能访问该构造方法
	private Singleton() {}
	
	//2,创建本类对象
	public static final Singleton singleton = new Singleton();
	
}