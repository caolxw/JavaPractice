package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 	流的异常处理
 */
public class TryFinally_Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		demo1();
		FileInputStream_Demo.print(1);
		
		demo2();
		FileInputStream_Demo.print(2);
	}

	public static void demo2() throws IOException, FileNotFoundException, Exception {
		/*
		 * jdk1.7版本
		 */
		try(
				//具备自动关闭的功能 实现了接口AutoCloseable
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
			Myclose cMyclose = new Myclose();
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * jdk1.6以及以前的版本
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			//try...finally的嵌套	目的是：能关一个关一个
			try {
				if (fis != null) {
					fis.close();
				}
			} finally {
				if (fos != null) {
					fos.close();
				}
			}
			
			
		}
	}

}

class Myclose implements AutoCloseable{
	/*
	 * (non-Javadoc)
	 * @see java.lang.AutoCloseable#close()
	 * 	自定义一个类，实现AutoCloseable接口
	 */
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("我关闭了...");
	}
	
}