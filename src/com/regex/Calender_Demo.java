package com.regex;
/*
 * Calender类  是抽象类，只能类名调用
 */

import java.util.Calendar;

public class Calender_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();

	}

	public static void demo2() {
		Calendar calendar = Calendar.getInstance();	
		calendar.add(Calendar.YEAR, 1);					//对指定字段进行向前减或向后加
		
		System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日 "+getWeek(Calendar.DAY_OF_WEEK));

		calendar.set(Calendar.YEAR, 2000);				//修改指定字段
		System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日 "+getWeek(Calendar.DAY_OF_WEEK));
		
		calendar.set(2000, 8, 8);
		System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日 "+getWeek(Calendar.DAY_OF_WEEK));
	}

	public static void demo1() {
		Calendar calendar = Calendar.getInstance();		//父类引用指向子类对象
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));			//月份 -1
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));	//月中的第几天
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		//周几 周日为1 周六为7
		
		//标准化输出日期
		System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日 "+getWeek(Calendar.DAY_OF_WEEK));
	}
	
	/*
	 * 将星期存储表中进行查表
	 * 1 返回值：String
	 * 2 参数：int
	 */
	public static String getWeek(int week) {
		String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return arr[week];
	}

}
