package com.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/*
 * Timer��ʱ��
 * 	ָ��ʱ�䰲��ָ��������
 */
public class Timer_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
//		t.schedule(new MyTimerTask(), new Date(2018-1900, 11, 8, 9, 59, 20));
		//ÿ������ִ��һ��
		t.schedule(new MyTimerTask(), new Date(2018-1900, 11, 8, 10, 00, 50),3000);
		
		while(true) {							//һ���Ӵ�ӡһ��ʱ��
			Thread.sleep(1000);
			System.out.println(new Date());		
		}
	}

}

class MyTimerTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�𴲱�Ӣ�ﵥ��");
	}
	
}