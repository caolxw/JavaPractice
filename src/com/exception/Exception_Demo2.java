package com.exception;
/*
 * 	自定义异常
 * 		通过名字区分异常，方便找到问题所在
 * 	
 */
public class Exception_Demo2 {
	
	public static void main(String[] args) throws AgeOutOfBoundsException {
		Demo2 demo2 = new Demo2();
		demo2.setAge(-17);
		System.out.println(demo2.getAge());
	}
}

class AgeOutOfBoundsException extends Exception{

	public AgeOutOfBoundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class Demo2{
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfBoundsException {
		if(age > 0 && age <= 150) {
			this.age = age;
		}else {
			//抛出自定义的异常
			throw new AgeOutOfBoundsException("年龄非法");
		}
	}
	
	
}