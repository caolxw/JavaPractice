package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳�
 * 	public static ExecutorService new FixedThreadPool(int nThread)
 */
public class Executors_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());							//���̷߳Ž������ﲢִ��
		pool.submit(new MyRunnable());
		
		pool.shutdown(); 										//�ر��̳߳�

	}

}
