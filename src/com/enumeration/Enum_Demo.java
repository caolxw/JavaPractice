package com.enumeration;

public class Enum_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		
		demo2();
		
		demo3();
		
		demo4();
		
		/*
		 * ö����switch�е�Ӧ��
		 */
		Week2 mon = Week2.TUE;
		switch (mon) {
		case MON:
			System.out.println("����һ");
			break;

		case TUE:
			System.out.println("���ڶ�");
			break;
		}
	}

	public static void demo4() {
		Week2 mon = Week2.MON;
		mon.show();
	}

	public static void demo3() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	public static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon);
	}

	public static void demo1() {
		/*Week mon = Week.MON;
		Week tue = Week.TUE;
		Week wed = Week.WED;
		System.out.println(wed.getName());*/
		
		Week mon = Week.MON;
		mon.show(); 			//���뿴���࣬���п�����
	}

}
