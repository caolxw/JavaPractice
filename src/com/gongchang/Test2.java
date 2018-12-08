package com.gongchang;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogFactory dFactory = new DogFactory();
		Dog dog = (Dog) dFactory.createAnimal();
		dog.eat();
	}

}
