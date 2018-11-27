package com.bean;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {						//������ص���һ���̶�ֵ �����equals()
												//hashCode()ֵ��ͬ��ʱ�򣬻�����equals�������бȽ�
		final int prime = 31;					//1,31��������2,31�Ȳ���Ҳ��С��3,2^5 - 1 = 31		
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());		//�ַ�������д��hashCode()
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("����ִ��equals...");
		
		//��׳���ж�
		if (this == obj)					//���ö���ʹ��������ͬһ������
			return true;
		if (obj == null)					//���������null
			return false;
		if (getClass() != obj.getClass())	//���ö���ʹ��������ͬһ����
			return false;
		Person other = (Person) obj;		//����ת��
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		/*//��������������
		if (o.age == this.age) {
			return 0;
		}else if(o.age>this.age){
			return -1;
		}else {
			return 1;
		}*/
//		return this.age-o.age;								//����д��  �ᵼ��������ͬȫ������
		
		
		int num = this.age - o.age;							//�����ǱȽϵ���Ҫ����
		//String��ComparableTo()�Ѿ���д���� �����ֵ�˳������
		return num == 0 ? this.name.compareTo(o.name):num;	//�����ǱȽϵĴ�Ҫ����
		
	}
	
	
}
