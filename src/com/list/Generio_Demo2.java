package com.list;
/*
 * ���ͽӿ�
 */
public class Generio_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Inter<T>{
	public void show(T t);
}

class Demo implements Inter<String>{			//ָ������ �Ƽ�ʹ��

	@Override
	public void show(String t) {				//ʵ�ֽӿڵķ�����ʱ�� ����һ��
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}

/*class Demo2 implements Inter<T>{				//���Ƽ�ʹ��

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}*/