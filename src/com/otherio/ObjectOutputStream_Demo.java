package com.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.bean.Person;

/*
 * 对象操作流
 * 该流可以将一个对象写出，或者读取一个对象到程序中。也就是执行了序列化和反序列化
 */
public class ObjectOutputStream_Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stu,b
		demo1();
		
		Person person = new Person("Sam",23);
		Person person2 = new Person("Jack", 24);
		Person person3 = new Person("Jason", 23);
		Person person4 = new Person("Lulu",20);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(person4);
		list.add(person3);
		list.add(person2);
		list.add(person);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
		oos.writeObject(list);						//整个集合对象一并写出
		oos.close();
	}

	public static void demo1() throws IOException, FileNotFoundException {
		/*
		 * 序列化，将对象写道文件上
		 */
		Person person1 = new Person("Sam",23);
		Person person2 = new Person("Jack", 24);
//		FileOutputStream fos = new FileOutputStream("f.txt");			//不可以传入自定义对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		oos.writeObject(person1);
		oos.writeObject(person2);
		
		oos.close();
	}

}
