package com.regex;
/*
 * Date类
 * 
 * DateFormat类：抽象类，不可以实例化
 * SimpleDateFormat类：DateFormat的子类		(重点掌握)
 * 
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		demo1();
		demo2();
	
		DateFormat dfFormat = DateFormat.getDateInstance();		//相当于父类引用指向子类对象
		
		demo3();
		demo4();
		
		//将时间字符串转换成日期对象
		String string = "2018年11月23日 14:12:00";
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = sDateFormat.parse(string);
		System.out.println(date);
	}

	public static void demo4() {
		Date date = new Date();
		//自定义格式
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sDateFormat.format(date));
	}

	public static void demo3() {
		Date date = new Date();
		SimpleDateFormat sDateFormat = new SimpleDateFormat();	//创建日期格式化多项
		System.out.println(sDateFormat.format(date));			//yyyy/MM/dd/ 上（下）午hh:mm
	}

	public static void demo2() {
		
		Date date = new Date();
		System.out.println(date.getTime());				//Date对象获取当前毫秒值
		System.out.println(System.currentTimeMillis());	//系统函数获取当前毫秒值
	}

	public static void demo1() {
		//空参构造
		Date date = new Date();
		System.out.println(date);
		//有参构造
		Date date2 = new Date(0);
		System.out.println(date2);		//1970年1月1日 算 UNIX 和C 语言的生日	电脑时区为东八区，所以为8点
	}

}
