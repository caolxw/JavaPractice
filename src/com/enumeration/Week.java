package com.enumeration;
/*
 * 自定义枚举类
 */
public abstract class Week {
	/*public static final Week MON = new Week();
	public static final Week TUE = new Week();
	public static final Week WED = new Week("星期三");*/
	
	public static final Week MON = new Week("星期一") {
		public void show() {
			System.out.println("星期一");
		}
	};
	
	private Week() {
		// 私有化构造方法
	}
	
	private String name;
	private Week(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void show();		//抽象方法必须在抽象类中
}
