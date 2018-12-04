package com.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
/*
 * ������
 */
public class SequenceInputStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		demo1();
		
		demo2();
		
		demo3();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		//���϶��������
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		//�������϶��󣬽�������洢����
		Vector<FileInputStream> vector = new Vector<>();
		vector.add(fis3);
		vector.add(fis2);
		vector.add(fis1);
		
		Enumeration<FileInputStream> en = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		sis.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		//��������������
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();						//�ڹرյ�ʱ�򣬻�Ѵ���ȥ����һ��ر�
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * �� a.txt��b.txt�����ݶ�д��c.txt
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		while((b = fis2.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		fis2.close();
	}

}
