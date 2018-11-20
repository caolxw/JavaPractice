package com.previous;
/*
 *  == 基本数据类型比较值	引用数据类型比较地址
 *  equals	只能比较引用数据类型	需要重写才具有比较引用数据类型值得功能
 */

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString_Demo demo = new ToString_Demo(1,"Sam");
		System.out.println(demo.toString());	//调用toString()方法
		System.out.println(demo);				//直接打印对象，会自动调用toString方法
		
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
	public String toString() {		//可以自动生成也可以自己重写
		return "ToString_Demo [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {		//重写equals方法
		// TODO Auto-generated method stub
		ToString_Demo demo = (ToString_Demo)obj;
		return this.name.equals(demo.name) && this.id == demo.id;
	}
	
}