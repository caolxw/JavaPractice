package com.previous;
/*
 * final����
 * 
 * final���εķ��������Ա���д
 * final���ε��಻���Ա��̳�
 * final���εı����������޸�
 */

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int num = 10;
		System.out.println(num);
		final Father person = new Father("����",20);
		//final���εĶ�����ͨ�����캯���޸ģ������ܸı��ֵַ�����ǿ����޸�����ֵ
		//person = new Father();
		System.out.println(person.getName()+" "+person.getAge());
		
		person.setAge(24);
		person.setName("����");
		System.out.println(person.getName()+" "+person.getAge());
		
		method(10);
		method(20);
	}
	
	public static void method(final int x) {
		System.out.println(x);
	}

}

class Father{
	private String name;
	private int age;
	
	public Father() {}
	public Father(String name,int age) {
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
	public void setAge(int age) {
		this.age = age;
	}
	
	public final void print() {
		System.out.println("������final���εķ����������в�������д��");
	}
}

class Son extends Father{
	//final���εķ��������Ա���д
//	public void print() {
//		System.out.println("���ǹ���");
//	}
}
