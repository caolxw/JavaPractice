package com.list;
/*
 * 泛型接口
 */
public class Generio_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Inter<T>{
	public void show(T t);
}

class Demo implements Inter<String>{			//指定泛型 推荐使用

	@Override
	public void show(String t) {				//实现接口的方法的时候 泛型一致
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}

/*class Demo2 implements Inter<T>{				//不推荐使用

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}*/