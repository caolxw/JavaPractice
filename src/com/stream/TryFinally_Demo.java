package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 	�����쳣����
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
		 * jdk1.7�汾
		 */
		try(
				//�߱��Զ��رյĹ��� ʵ���˽ӿ�AutoCloseable
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
		 * jdk1.6�Լ���ǰ�İ汾
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
			//try...finally��Ƕ��	Ŀ���ǣ��ܹ�һ����һ��
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
	 * 	�Զ���һ���࣬ʵ��AutoCloseable�ӿ�
	 */
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�ҹر���...");
	}
	
}