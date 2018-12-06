package com.thread;

public class Name_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		Thread_Demo2.print(1);
		
		
		demo2();
		Thread_Demo2.print(2);
	}

	public static void demo2() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"=dddd");	//获取当前正在执行的线程Thread.currentThread()
			}
		}).start();
		
		//主线程的名字
		Thread.currentThread().setName("我是主线程");	 			//设置主线程的名字
		System.out.println(Thread.currentThread().getName());
	}

	public static void demo1() {
		new Thread() {								//继承Thread类
			public void run() {						//重写run
						System.out.println(this.getName()+"=aaaa");
				}
		}.start();
	
		new Thread("芙蓉姐姐") {						//通过构造方法为线程命名
			public void run() {						//重写run
					System.out.println(this.getName()+"=bbbb");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("凤姐");
				System.out.println(this.getName()+"=cccc");
			}
		}.start();
	}

}
