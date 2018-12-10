package com.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reflect_Demo {
/*
 * 读取配置文件
 * 	通过读取配置文件，创建新的对象
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(bReader.readLine());
		Fruit fruit = (Fruit) clazz.newInstance();				//父类引用指向子类对象
		Juicer juicer = new Juicer();
		juicer.run(fruit);
	}

}

interface Fruit{
	public void squeeze();
}

class Apple implements Fruit {

	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.println("榨出一杯苹果汁儿");
	}
	
}

class Orange implements Fruit {

	@Override
	public void squeeze() {
		// TODO Auto-generated method stub
		System.out.println("榨出一杯橘子汁儿");
	}
	
}

class Juicer {
	public void run(Fruit f) {
		f.squeeze();
	}
}