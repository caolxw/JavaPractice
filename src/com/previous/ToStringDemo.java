package com.previous;
/*
 *  == �����������ͱȽ�ֵ	�����������ͱȽϵ�ַ
 *  equals	ֻ�ܱȽ�������������	��Ҫ��д�ž��бȽ�������������ֵ�ù���
 */

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString_Demo demo = new ToString_Demo(1,"Sam");
		System.out.println(demo.toString());	//����toString()����
		System.out.println(demo);				//ֱ�Ӵ�ӡ���󣬻��Զ�����toString����
		
		ToString_Demo demo2 = new ToString_Demo(1, "Sam");
		System.out.println(demo == demo2);			//false
		System.out.println(demo.equals(demo2));		//true
	}

}

class ToString_Demo{
	private int id;
	private String name;
	
	public ToString_Demo(){}
	public ToString_Demo(int id,String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {		//�����Զ�����Ҳ�����Լ���д
		return "ToString_Demo [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {		//��дequals����
		// TODO Auto-generated method stub
		ToString_Demo demo = (ToString_Demo)obj;
		return this.name.equals(demo.name) && this.id == demo.id;
	}
	
}