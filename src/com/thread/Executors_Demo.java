package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池
 * 	public static ExecutorService new FixedThreadPool(int nThread)
 */
public class Executors_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());							//将线程放进池子里并执行
		pool.submit(new MyRunnable());
		
		pool.shutdown(); 										//关闭线程池

	}

}
