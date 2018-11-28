package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bean.Person;

public class Map_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Person, String> map = new HashMap<>();		//HashMap也需要自定义数据类型重写equals()和hasCode()
		map.put(new Person("Sam",23), "China");
		map.put(new Person("Sam",23), "Japan");
		map.put(new Person("Jack",23), "UK");
		map.put(new Person("Sam",20), "UK");
		
		Set<Entry<Person,String>> entries = map.entrySet();
		for (Entry<Person, String> en : entries) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
