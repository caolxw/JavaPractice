package com.previous;
/*
 * 接口
 * 	接口中的所有方法都是抽象的
 * 	接口不能被实例化
 * 
 *成员变量	只能是常量	并且是静态公共的（public static final)
 *构造方法	接口没有构造方法
 *成员方法	只能是抽象方法	(public abstract)
 *
 *多实现，单继承
 *接口与接口之间可以多继承
 */

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter inter = new Inter_Demo();	//运用多态的调用方法 实例化接口
		inter.print();
	}

}

interface Inter{
	public abstract void print();
}

class Inter_Demo implements Inter{
	
	public Inter_Demo() {}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是实现接口的demo");
	}
	
}