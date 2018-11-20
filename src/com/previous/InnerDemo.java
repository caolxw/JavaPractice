package com.previous;

/*
 * 	内部类
 * 
 * 	匿名内部类
 * 	前提：存在一个类或者接口
 * 	本质：是一个继承该类或者实现了该接口的子类匿名对象
 * 
 * 
 */
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner1 inner1 = new Outer().new Inner1();	//创建内部类对象
		inner1.print();
		
		Outer outer = new Outer();
		outer.print();
		
		//外部类名.内部类名 对象名 = 外部类名.内部类对象
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		
		Outer.Inner3.method();
		
		outer.method();
	}

}

class Outer{
	class Inner1{
		public void print() {
			System.out.println("我是内部类");
		}
	}
	
	private class Inner2{
		public void print() {
			System.out.println("我是私有内部类");
		}
	}
	
	public void print() {
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	static class Inner3{
		public void print() {
			System.out.println("我是静态内部类");
		}
		
		public static void method() {
			System.out.println("我是静态内部类的静态方法");
		}
	}
	
	public void method() {
		new InterDemo() {	//实现Inter接口
			public void print() {
				//重写接口抽象方法
				System.out.println("我是匿名内部类第一个方法");
			}
			
		}.print();
	}
	
	
}

interface InterDemo{
	public void print();
//	public void print2();	多方法建议使用有名内部类 
}

