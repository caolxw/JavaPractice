package com.previous;
/*
 * 继承关系
 * 父类的私有方法不能被重写
 * 方法的重写时，声明要一模一样
 * 
 * Override 重写 ：
 * Overload 重载：方法名相同，参数列表不同
 * 
 * 成员变量
 * 编译看左边，运行看左边
 * 
 *  成员方法
 * 编译看左边，运行看右边 动态绑定
 * 
 * 静态方法
 * 编译看左边，运行看左边
 * 静态与类相关，不能算作方法的重写
 */

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi1 = new Zi();
		zi1.show();
		System.out.println("----------");
		
		Fu fu = new Zi();	//父类引用指向子类对象 向上转型
		System.out.println(fu.num);
		
		fu.print();	//动态绑定
		fu.print1();
		
		Zi zi2 = (Zi)fu;	//向下转型
		zi2.show();
		System.out.println("----------");
		
		method(new Zi());
		method(new Zi2());
	}
	
	//当作参数的时候用多态最好 扩展性强
	public static void method(Fu f) {
		f.print2();
	}

}

class Fu{
	public int num = 10;
	public Fu() {
		System.out.println("Fu");
	}
	
	public void print() {
		System.out.println("Father");
	}
	
	public static void print1() {
		System.out.println("Father Static");
	}
	
	public void print2() {
		System.out.println("Father print");
	}
}

class Zi extends Fu{
	public int num = 20;
	public Zi() {
		System.out.println("Zi");
	}
	
	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
	
	public void print() {
		System.out.println("Son");
	}
	
	public static void print1() {
		System.out.println("Son Static");
	}
	
	public void print2() {
		System.out.println("Son1 print");
	}
}

class Zi2 extends Fu{
	public Zi2() {}
	public void print2() {
		System.out.println("Son2 print");
	}
}
