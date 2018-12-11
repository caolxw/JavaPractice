package com.enumeration;

public class Enum_Demo2 {
/*
 * ö����ĳ��÷���
 * int ordinal()
 * int comparaTo(E o)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
		
		Week2[] arr = Week2.values(); 					//�õ����е�ö����
		for (Week2 week2 : arr) {
			System.out.println(week2); 					//����toString
		}
	}

public static void demo2() {
	Week2 mon = Week2.valueOf(Week2.class, "MON");		//ͨ���ֽ����ļ���ȡ����
	System.out.println(mon);
}

public static void demo1() {
	Week2 tue = Week2.TUE;
	Week2 mon = Week2.MON;
	System.out.println(mon.ordinal());
	System.out.println(tue.ordinal()); 			//ö������ɱ�ŵ�
	
	System.out.println(mon.compareTo(tue)); 	//�Ƚϵ��Ǳ��
	
	System.out.println(mon.name()); 			//��ȡʵ��������
	System.out.println(mon.toString());
}

}
