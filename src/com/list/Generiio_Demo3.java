package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * ����ͨ��� <?>
 * 		�������ͣ����û����ȷ����ô����Object�Լ������Java����
 * ? extend E	�����޶� E��������
 * ? super E	�����޶� E���丸��
 */
public class Generiio_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<?> list = new ArrayList<String>();		//���ұߵķ��Ͳ�ȷ��ʱ ��߿���ָ��Ϊ?
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("����",23));
		list2.add(new Student("����",21));
		
		ArrayList<EStudent> list3 = new ArrayList<>();
		list3.add(new EStudent("����", 24));
		list3.add(new EStudent("����", 19));
		
		list2.addAll(list3);
		System.out.println(list2);
	}

}

class EStudent extends Student{
	public EStudent() {}
	public EStudent(String name,int age) {
		super(name, age);
		
	}
}