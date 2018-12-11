package com.enumeration;

public class Enum_Demo2 {
/*
 * 枚举类的常用方法
 * int ordinal()
 * int comparaTo(E o)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
		
		Week2[] arr = Week2.values(); 					//拿到所有的枚举项
		for (Week2 week2 : arr) {
			System.out.println(week2); 					//调用toString
		}
	}

public static void demo2() {
	Week2 mon = Week2.valueOf(Week2.class, "MON");		//通过字节码文件获取对象
	System.out.println(mon);
}

public static void demo1() {
	Week2 tue = Week2.TUE;
	Week2 mon = Week2.MON;
	System.out.println(mon.ordinal());
	System.out.println(tue.ordinal()); 			//枚举项都是由编号的
	
	System.out.println(mon.compareTo(tue)); 	//比较的是编号
	
	System.out.println(mon.name()); 			//获取实例的名称
	System.out.println(mon.toString());
}

}
