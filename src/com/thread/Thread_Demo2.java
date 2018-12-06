package com.thread;
/*
 * 区别
 * 	继承Thread 由于子类重写了Thread类的run()，当调用start()时，直接找到子类的run()方法
 * 	实现Runnable 构造函数传入Runnable的引用，start()调用run()方法时判断成员变量Runnable是否为空
 * 				不为空时，编译看Runnable的run()，运行看实现Runnable的子类的run()方法
 * 
 * 比较
 * 	继承Thread 	可以直接使用thread类中的方法，代码简单
 * 				如果已经有了父类，就不能用这种方法
 * 	实现Runnable	即使自己定义的线程类有了父类，也可以实现接口
 * 				不能直接使用Thread中的方法
 */
public class Thread_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		print(1);
		demo2();
		print(2);
		
		demo3();
		print(3);
		demo4();
		print(4);
	}

	public static void demo4() {
		/*
		 * 采用匿名内部类实现线程 方式2
		 * 	实现Runnable接口 
		 */
		new Thread(new Runnable() {					//将Runnable的子类对象传递给Thread的构造方法
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<1000; i++) {
					System.out.println("ddddddd");
				}
			}
		}).start();									//开启线程
	}

	public static void demo3() {
		/*
		 * 采用匿名内部类实现线程 方式1
		 * 	继承Thread类
		 */
		new Thread() {									//继承Thread类
				public void run() {						//重写run
					for(int i=0; i<1000; i++) {
						System.out.println("ddddddd");
					}
				}
		}.start();										//开启线程
	}

	public static void demo2() {
		/*
		 *多线程实现方式2
		 *	实现Runnable接口 
		 */
		MyRunnable mRunnable = new MyRunnable();
		//Runnable target = mRunnable	
		Thread thread = new Thread(mRunnable);		//将其当作参数传递给Thread的构造函数
		thread.start();
		for(int i=0; i<1000; i++) {
			System.out.println("bb");
		}
	}

	public static void demo1() {
		/*
		 *多线程实现方式1
		 *	继承Thread类
		 */
		MyThread mThread = new MyThread();
//		mThread.run();						//并不会交替执行
		mThread.start();					//开启线程
		for(int i=0; i<1000; i++) {
			System.out.println("bb");
		}
	}
	
	public static void print(int i) {
		System.out.println("----demo"+i+" end-----");
	}

}

class MyThread extends Thread{
	
	//重写方法run
	public void run() {
		//将要执行的代码写在方法中
		for(int i=0; i<1000; i++) {
			System.out.println("aaaaaa");
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	//重写方法run
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++) {
			System.out.println("ccccccc");
		}
	}
	
}