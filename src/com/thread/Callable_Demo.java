package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 线程实现方式3
 */
public class Callable_Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = pool.submit(new MyCallable(10));							//将线程放进池子里并执行
		Future<Integer> f2 = pool.submit(new MyCallable(50));
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		pool.shutdown();
	}

}

class MyCallable implements Callable<Integer>{
	private int num = 0;
	
	public MyCallable(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
}