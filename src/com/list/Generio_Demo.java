package com.list;

public class Generio_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<String> tool = new Tool<>();			//ָ������
		tool.setObj("string");
		System.out.println(tool.getObj());
		
		Tool<Student> tool2 = new Tool<>();
		tool2.setObj(new Student("����", 23));
		System.out.println(tool2.getObj());
		
		tool.show(23);							//�������Լ��ķ��ͣ�ֱ�Ӵ�ֵ�Ϳ��Ե���
		tool.print(true);
	}

}

class Tool<T>{
	/*
	 * ����Ϊ�Լ��������ӷ���
	 */
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {			
		this.obj = obj;
	}
	
	public<Q> void show(Q q) {			//���������������÷���һ��
										//�����һ�£���Ҫ�ڷ����������÷���
		System.out.println(q);
	}
	
	public static<Q> void print(Q q) {	//��̬�������������Լ��÷���
		System.out.println(q);
	}
}