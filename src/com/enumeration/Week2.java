package com.enumeration;
/*
 * ö���� Enum
 * 	ö������������ǰ��
 * 	ö����Ĺ��췽��������˽�е�
 */
public enum Week2 {
	/*
	MON,TUE,WED;			//�൱�ڵ�һ�ַ�ʽ �޲�������
	*/
	/*
	MON("����һ"),
	TUE("���ڶ�"),
	WED("������");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}*/
	MON("����һ"){
		public void show() {
			System.out.println("����һ");
		}
	},
	TUE("���ڶ�"){
		public void show() {
			System.out.println("���ڶ�");
		}
	};
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void show();
	
	public String toString() {
		return name;
	}
}
