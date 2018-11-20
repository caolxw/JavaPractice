package com.previous;
/*
 * String
 */

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringdemo();
		printline();
		equalsdemo();
		printline();
		indexdemo();
		printline();
		changedemo();
		printline();
		otherdemo();
	}
	
	public static void stringdemo() {
		byte[] arr2 = {97,98,99,100,101,102};
		System.out.println(new String(arr2));
		System.out.println(new String(arr2,2,3));	//��ȡ�ӱ��2��ʼ��3���ַ�
		
		char[] arr3 = {'a','b','c','d','e','f'};
		System.out.println(new String(arr3));		//���ַ�����ת�����ַ���
		System.out.println(new String(arr3, 3, 3));		
		printline();

		
		//�ַ���������������ʽ
		String arr4 = "text";
		System.out.println(arr4);
		String arr5 = new String("text");		//������������ һ���ڳ����� һ���ڶ��ڴ�
		System.out.println(arr5);
		System.out.println(arr4==arr5);				//false
		System.out.println(arr4.equals(arr5));		//true
		
		//ͨ��new String����������ַ��� ==��equals�ıȽ�
		String arr6 = new String("text");
		System.out.println(arr6 == arr5);			//false
		System.out.println(arr5.equals(arr6));		//true
		
		String arr7 = "t"+"e"+"x"+"t";
		String arr8 = "text";						//�ڱ����ʱ��Ͱ�text ���Ѿ������ڳ����ص���
		System.out.println(arr7 == arr8);			//true
		System.out.println(arr7.equals(arr8));		//true
		System.out.println(arr7 == arr5); 			//false
		
		String arr9 = "tex";
		String arr10 = "text";
		String arr11 = arr9+"t";
		System.out.println(arr11==arr10); 			//false
	}
	
	/*
	 * String����жϹ���
	 */
	public static void equalsdemo() {
		String s1 = "Wan";
		String s2 = "wan";
		String s3 = "I'm Wan";
		String s4 = "I";
		
		System.out.println(s1.equals(s2));				//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true	�����ִ�Сд
		System.out.println(s3.contains(s2)+" "+s3.contains(s1)); 	//false	true
		System.out.println(s3.startsWith(s4));			//�ж��Ƿ��봫����ַ�����ͷ
		System.out.println(s3.endsWith(s1));			//�ж��Ƿ��봫����ַ�������
		System.out.println(s3.isEmpty()); 				//�ж��ַ����Ƿ�Ϊ��
	}
	
	/*
	 * String ��Ļ�ȡ����
	 */
	public static void indexdemo() {
		String s1 = "����ˣ����֣�����ˣ����֣�����ˣ����֣�";
		System.out.println(s1.length());			//��ȡ�ַ�����ÿһ���ַ��ĸ���
		
		char c1 = s1.charAt(2);
		System.out.println(c1);						//����������ȡ��Ӧλ�õ��ַ� ������Χ�ᱨ��
		
		System.out.println(s1.indexOf("����"));		//�����ַ�/�ַ����ڴ��ַ����е�һ�γ��ֵ�����λ��
		System.out.println(s1.indexOf("����", 7));
		System.out.println(s1.lastIndexOf("����"));	//�����ַ�/�ַ����ڴ��ַ��������һ�γ��ֵ�����λ��
		
		System.out.println(s1.substring(7));		//��ָ������λ�ÿ�ʼ��ȡ�ַ��� ��ĩβ
		System.out.println(s1.substring(7, 18));	//��ָ������λ�ÿ�ʼ��ȡ�ַ�����ָ������λ�ý��� ����ҿ�
	}
	
	/*
	 * �ַ�����ת������
	 */
	public static void changedemo() {
		String s1 = "abc";
		byte[] arr1 = s1.getBytes();
		for(byte i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		char[] arr2 = s1.toCharArray();				//�ַ���ת��Ϊ�ַ�����
		for(char i:arr2) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		String s2 = String.valueOf(100);			//��100ת�����ַ���
		System.out.println(s2+100);
		
		ToString_Demo demo = new ToString_Demo(1, "Sam");
		s2 = String.valueOf(demo);					//������ת�����ַ�����ʱ�� ������toString()
		System.out.println(s2);
		/*
		 * toUpperCase() ת�ɴ�д
		 * toLowerCase() ת��Сд
		 */
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("def"));		//�ַ�����ƴ�� ֻ�����ַ���֮���ƴ��
		System.out.println(s1+"def");				//������������֮�����ƴ��
	}
	
	/*
	 * String ������
	 */
	public static void otherdemo() {
		String s1 = "I'm a cute panda";
		System.out.println(s1.replace("a", "e"));	//�ַ����滻
		System.out.println(s1.replace("cute", "smart"));
		
		String s2 = "	panda is so  cute  ";
		System.out.println(s2.trim());				//ȥ���ַ����׵Ŀո�
		
		String s3 = "I'm A CUTE panda";
		System.out.println(s1.compareToIgnoreCase(s3)); 	//���Դ�Сд�Ƚ��ַ�����ֵ ����int
		
	}
	public static void printline() {
		System.out.println("----------");
	}

}
