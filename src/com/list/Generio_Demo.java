package com.list;

public class Generio_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<String> tool = new Tool<>();			//指定泛型
		tool.setObj("string");
		System.out.println(tool.getObj());
		
		Tool<Student> tool2 = new Tool<>();
		tool2.setObj(new Student("张三", 23));
		System.out.println(tool2.getObj());
		
		tool.show(23);							//方法有自己的泛型，直接传值就可以调用
		tool.print(true);
	}

}

class Tool<T>{
	/*
	 * 自行为自己得类增加泛型
	 */
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {			
		this.obj = obj;
	}
	
	public<Q> void show(Q q) {			//方法泛型最好与类得泛型一致
										//如果不一致，需要在方法上声明该泛型
		System.out.println(q);
	}
	
	public static<Q> void print(Q q) {	//静态方法必须声明自己得泛型
		System.out.println(q);
	}
}