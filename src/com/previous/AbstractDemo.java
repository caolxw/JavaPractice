package com.previous;
/*
 *  abstract
 *  
 * ������
 * �����಻һ��Ҫ�г��󷽷����г��󷽷�����һ���ǳ���������ǽӿ�
 * �����಻���Ա�ʵ���� ���ǿ����ø�������ָ���������
 * �����������Ҫô�ǳ����࣬Ҫô��д�����еľ�̬����
 * 
 * abstract ֻ��������ͷ���
 * 
 * ��Ա����:
 * 	���󷽷� ǿ��Ҫ������ʵ��
 * 	�ǳ��󷽷�	����̳У���ߴ��븴����
 * 
 * 
 * ������1��
 * 	һ�����������û�г��󷽷����ɲ����Զ���Ϊ�����࣬��ʲô���壿
 * 	���ԣ�Ŀ�ģ����������ഴ���������
 * ������2��
 * 	abstract��static���ܹ���
 * 	abstract��final���ܹ���
 *	abstract��private���ܹ���
 */

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.eat();
		
		System.out.println("----------");
		
		Cat c1 = new Cat("���", 4);
		System.out.println(c1.getName()+" - "+c1.getAge());
		c1.eat();
		c1.play();
		
		System.out.println("----------");
		
		Dog d1 = new Dog("���Ѻ�",3);
		System.out.println(d1.getName()+" - "+d1.getAge());
		d1.eat();
		d1.grant();
	}

}

//������
abstract class Animal{
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public abstract void eat();	//���󷽷� û�о���ķ�����
	
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
//		this.name = name;	���Ա�˽�л�
		super(name,age);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}
	
	public void play() {
		System.out.println("è��ë����");
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
		System.out.println("������");
	}
	
	public void grant() {
		System.out.println("����");
	}
	
}