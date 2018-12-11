package com.enumeration;
/*
 * �Զ���ö����
 */
public abstract class Week {
	/*public static final Week MON = new Week();
	public static final Week TUE = new Week();
	public static final Week WED = new Week("������");*/
	
	public static final Week MON = new Week("����һ") {
		public void show() {
			System.out.println("����һ");
		}
	};
	
	private Week() {
		// ˽�л����췽��
	}
	
	private String name;
	private Week(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void show();		//���󷽷������ڳ�������
}
