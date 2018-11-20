package com.previous;
/*
 *  abstract
 *  
 * 抽象类
 * 抽象类不一定要有抽象方法，有抽象方法的类一定是抽象类或者是接口
 * 抽象类不可以被实例化 但是可以用父类引用指向子类对象
 * 抽象类的子类要么是抽象类，要么重写父类中的静态方法
 * 
 * abstract 只能修饰类和方法
 * 
 * 成员方法:
 * 	抽象方法 强制要求子类实现
 * 	非抽象方法	子类继承，提高代码复用率
 * 
 * 
 * 面试题1：
 * 	一个抽象类如果没有抽象方法，可不可以定义为抽象类，有什么意义？
 * 	可以，目的：不让其他类创建本类对象
 * 面试题2：
 * 	abstract和static不能共存
 * 	abstract和final不能共存
 *	abstract和private不能共存
 */

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.eat();
		
		System.out.println("----------");
		
		Cat c1 = new Cat("吾皇", 4);
		System.out.println(c1.getName()+" - "+c1.getAge());
		c1.eat();
		c1.play();
		
		System.out.println("----------");
		
		Dog d1 = new Dog("巴匝黑",3);
		System.out.println(d1.getName()+" - "+d1.getAge());
		d1.eat();
		d1.grant();
	}

}

//抽象类
abstract class Animal{
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public abstract void eat();	//抽象方法 没有具体的方法体
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Cat extends Animal{
	
	public Cat() {}
	public Cat(String name,int age) {
//		this.name = name;	属性被私有化
		super(name,age);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}
	
	public void play() {
		System.out.println("猫玩毛线球");
	}
	
}

class Dog extends Animal{
	
	public Dog() {}
	public Dog(String name,int age) {
		super(name,age);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃肉");
	}
	
	public void grant() {
		System.out.println("看家");
	}
	
}