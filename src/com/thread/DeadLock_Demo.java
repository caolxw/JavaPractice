package com.thread;

public class DeadLock_Demo {
	
	private static String s1 = "������";
	private static String s2 = "������";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				
				while(true) {
					synchronized (s1) {
						System.out.println(getName()+"��ȡ"+s1+"�ȴ�"+s2);
						synchronized (s2) {
							System.out.println(getName()+"�õ�"+s2+"���ԣ�");
						}
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				
				while(true) {
					synchronized (s2) {
						System.out.println(getName()+"��ȡ"+s2+"�ȴ�"+s1);
						synchronized (s1) {
							System.out.println(getName()+"�õ�"+s1+"���ԣ�");
						}
					}
				}
			}
		}.start();
	}

}
