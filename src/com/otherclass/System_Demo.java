package com.otherclass;

public class System_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		demo3();
	}

	public static void demo3() {
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);	//数组的拷贝，长度不足会用0填充
		for(int i:dest) {
			System.out.print(i+" ");
		}
	}

	public static void demo2() {
		int sum = 0;
		long start = System.currentTimeMillis();		//获取当前毫秒值
		for(int i = 0;i<1000;i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		long end  =System.currentTimeMillis();
		System.out.println(end-start);
	}

	public static void demo1() {
		for(int i=0;i<10;i++) {
			new Demo();
			System.gc();    //强制运行垃圾回收器
		}
	}

}

class Demo{					//一个源文件中不能有两个public 类，会抢占资源

	/*
	 * 重写父类的方法
	 * 这个方法不能手动调用，由系统自动调用。
	 * 用于清扫系统运行中的垃圾。（垃圾足够多时才会运行）
	 */
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("垃圾被清扫了!");
	}		
	
}