package com.otherclass;

public class System_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		demo3();
	}

	public static void demo3() {
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);	//����Ŀ��������Ȳ������0���
		for(int i:dest) {
			System.out.print(i+" ");
		}
	}

	public static void demo2() {
		int sum = 0;
		long start = System.currentTimeMillis();		//��ȡ��ǰ����ֵ
		for(int i = 0;i<1000;i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		long end  =System.currentTimeMillis();
		System.out.println(end-start);
	}

	public static void demo1() {
		for(int i=0;i<10;i++) {
			new Demo();
			System.gc();    //ǿ����������������
		}
	}

}

class Demo{					//һ��Դ�ļ��в���������public �࣬����ռ��Դ

	/*
	 * ��д����ķ���
	 * ������������ֶ����ã���ϵͳ�Զ����á�
	 * ������ɨϵͳ�����е��������������㹻��ʱ�Ż����У�
	 */
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��������ɨ��!");
	}		
	
}