package com.exception;

import com.bean.Person;

/*
 * 	����ʱ�쳣��
 * 	����ʱ�쳣��RuntimeException�༰�������ʵ��
 * 
 * 	�쳣�������
 * 	��һ�֣�try...catch...finally�������
 * 			try(����쳣)
 * 			catch(�����쳣)
 * 			finally(�ͷ���Դ)
 * 	�ڶ��֣�throws
 * 
 * 	��׿���ͻ��˿�����try{}catch(Exception e){}
 * 	ee,����˿�����һ�㶼�ǵײ㿪�����쳣�ӵײ�������
 * 
 * 	JDK7��δ������쳣��
 * 			 catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
 */
public class Exception_Demo {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		demo1();
		print(1);
		
		demo2();
		print(2);
		
		demo3();
		print(3);
	}

	public static void demo3() throws Exception {
		/*
		 * 	�׳��쳣�Ĵ���ʽ
		 */
		Person person = new Person();
		person.setAge(-17);
		System.out.println(person.getAge());
	}

	public static void demo2() {
		/*
		 * try...catch�������쳣
		 */
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		try {
//			System.out.println(a / b);			//ArithmeticException
//			System.out.println(arr[10]);		//ArrayIndexOutOfBoundsException
			arr = null;
			System.out.println(arr[0]);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("����Խ����");
		}catch (Exception e) {					//С���쳣��ǰ�� ����쳣�ź���
			// TODO: handle exception
			System.out.println("������");
		}
	}

	public static void demo1() {
		Demo demo = new Demo();
		try {
			System.out.println(demo.div(10, 10));
			System.out.println(demo.div(10, 0));
		}catch (ArithmeticException e) {		//ArithmeticException e = new ArithmeticException()
			// TODO: handle exception
			System.out.println("������ ����Ϊ0");
		}
		//try...catchִ����֮�󣬳�������ִ��
		System.out.println("����try...catch֮���ӡ�ġ�");
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end----");
	}

}

class Demo{
	/*
	 * 	��������
	 */
	public int div(int a,int b) {
		return a / b;
	}
}