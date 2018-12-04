package com.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.bean.Person;
/*
 * 对象输入流，反序列化
 */
public class ObjectInputStream_Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

	public static void demo2() throws IOException, FileNotFoundException, ClassNotFoundException {
		//优化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();		//将整个集合对象一个提取
		
		for (Person person : list) {
			System.out.println(person);
		}
		ois.close();
	}

	public static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		
		Person person =  (Person) ois.readObject();
		Person person2 = (Person) ois.readObject();
		// EOFException 当文件读取到末尾时，出现EOFException
		
		System.out.println(person);
		System.out.println(person2);
		ois.close();
	}

}
