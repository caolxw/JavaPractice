package com.chario;
/*
 * װ�����ģʽ
 */
public class Wrap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperStudent student = new SuperStudent(new Student());
		student.code();
	}

}

interface Coder{
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("C");
		System.out.println("javase");
	}
	
}

class SuperStudent implements Coder{
	
	//���ѧ�����а�װ
	private Student s;					//��ȡѧ������
	
	public SuperStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void code() {
		// TODO Auto-generated method stub
		s.code(); 						//ѧ��������е�
		System.out.println("javaweb");	//����ԭ�еĹ���
		System.out.println("ssh");
		System.out.println("SQL");
	}
	
}