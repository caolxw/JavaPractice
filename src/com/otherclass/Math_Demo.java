package com.otherclass;

public class Math_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));		//取绝对值
		
		/*
		 * ceil 天花板
		 * 
		 * 13.0
		 * 12.3
		 * 12.0
		 * 
		 * 向上取整，但是是double值
		 */
		System.out.println("---向上取整---");
		System.out.println(Math.ceil(12.3));
		System.out.println(Math.ceil(12.8));
		System.out.println("---向下取整---");
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.8));
		System.out.println("---取大值---");
		System.out.println(Math.max(10, 11));		//两数中的较大值
		System.out.println("---幂运算---");
		System.out.println(Math.pow(2, 3));			//2的3次方
		System.out.println("---随机数生成---");
		System.out.println(Math.random()); 			//生成[0-1）之间的随机小数
		System.out.println("---四舍五入---");
		System.out.println(Math.round(13.2f));
		System.out.println(Math.round(13.8f));
		System.out.println("---开方---");
		System.out.println(Math.sqrt(4));
		
	}

}
