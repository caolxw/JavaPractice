package com.gongchang;
/*
 * 动物工厂
 * 	创建对象
 */
public class AnimalFactory {
	/*public static Dog creatDog() {
		return new Dog();
	}
	
	public static Cat createCat() {
		return new Cat();
	}
	*/
	//发现方法会很多，复用性太差
	//改进
	public static Animal createAnimal (String name) {
		if ("dog".equals(name)) {
			return new Dog();
		}else if ("cat".equals(name)) {
			return new Cat();
		}else {
			return null;
		}
	}
	
}
