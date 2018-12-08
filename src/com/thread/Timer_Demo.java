package com.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/*
 * Timer计时器
 * 	指定时间安排指定的任务
 */
public class Timer_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
//		t.schedule(new MyTimerTask(), new Date(2018-1900, 11, 8, 9, 59, 20));
		//每隔三秒执行一次
		t.schedule(new MyTimerTask(), new Date(2018-1900, 11, 8, 10, 00, 50),3000);
		
		while(true) {							//一秒钟打印一次时间
			Thread.sleep(1000);
			System.out.println(new Date());		
		}
	}

}

class MyTimerTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("起床背英语单词");
	}
	
}