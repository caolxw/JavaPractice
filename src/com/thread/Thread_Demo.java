package com.thread;
/*
 * 验证jvm的多线程
 */
public class Thread_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100000; i++) {
			new Demo();							//采用匿名内部类创造垃圾
		}
		
		for(int i=0; i<100000; i++) {
			System.out.println("我是主程序代码");		//主线程和垃圾回收线程抢夺资源
		}
	}

}

class Demo{
	public void finalize() {
		System.out.println("我是清扫垃圾的代码");
	}
}