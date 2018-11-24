package com.regex;
/*
 * Date��
 * 
 * DateFormat�ࣺ�����࣬������ʵ����
 * SimpleDateFormat�ࣺDateFormat������		(�ص�����)
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
	
		DateFormat dfFormat = DateFormat.getDateInstance();		//�൱�ڸ�������ָ���������
		
		demo3();
		demo4();
		
		//��ʱ���ַ���ת�������ڶ���
		String string = "2018��11��23�� 14:12:00";
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date date = sDateFormat.parse(string);
		System.out.println(date);
	}

	public static void demo4() {
		Date date = new Date();
		//�Զ����ʽ
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sDateFormat.format(date));
	}

	public static void demo3() {
		Date date = new Date();
		SimpleDateFormat sDateFormat = new SimpleDateFormat();	//�������ڸ�ʽ������
		System.out.println(sDateFormat.format(date));			//yyyy/MM/dd/ �ϣ��£���hh:mm
	}

	public static void demo2() {
		
		Date date = new Date();
		System.out.println(date.getTime());				//Date�����ȡ��ǰ����ֵ
		System.out.println(System.currentTimeMillis());	//ϵͳ������ȡ��ǰ����ֵ
	}

	public static void demo1() {
		//�ղι���
		Date date = new Date();
		System.out.println(date);
		//�вι���
		Date date2 = new Date(0);
		System.out.println(date2);		//1970��1��1�� �� UNIX ��C ���Ե�����	����ʱ��Ϊ������������Ϊ8��
	}

}
