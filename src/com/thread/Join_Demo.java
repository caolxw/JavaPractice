package com.thread;
/*
 * 加入线程
 * 	join 当前线程展厅，等待指定的线程执行结束后，当前线程再继续
 */
public class Join_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		final Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<30; i++) {
					System.out.println(this.getName() + "...aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<20; i++) {
					if (i== 2) {
						try {
//							t1.join();						//匿名内部类使用外部变量 要求变量必须是final
							t1.join(1);						//插队指定时间 过了时间后两条线程交替执行
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(this.getName() + "...bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
