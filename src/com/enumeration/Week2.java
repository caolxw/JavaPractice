package com.enumeration;
/*
 * 枚举类 Enum
 * 	枚举项必须放在最前面
 * 	枚举类的构造方法必须是私有的
 */
public enum Week2 {
	/*
	MON,TUE,WED;			//相当于第一种方式 无参数构造
	*/
	/*
	MON("星期一"),
	TUE("星期二"),
	WED("星期三");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}*/
	MON("星期一"){
		public void show() {
			System.out.println("星期一");
		}
	},
	TUE("星期二"){
		public void show() {
			System.out.println("星期二");
		}
	};
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void show();
	
	public String toString() {
		return name;
	}
}
