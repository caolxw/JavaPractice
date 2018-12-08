package com.thread;
/*
 * 单例模式的一个类
 */
import java.io.IOException;

public class Runtime_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();		//获取运行时对象
//		runtime.exec("shutdown -s -t 300");			//5分钟后关机
		runtime.exec("shutdown -a");				//取消
	}

}
