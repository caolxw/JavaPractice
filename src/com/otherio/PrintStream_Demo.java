package com.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.bean.Person;

/*
 * ��ӡ����Ĭ��ָ�����̨
 */
public class PrintStream_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		
		demo2();
	}

	public static void demo2() throws FileNotFoundException {
		/*
		 * �ַ���
		 */
		PrintWriter pWriter = new PrintWriter(new FileOutputStream("a.txt"),true);
		pWriter.println(97); 							//�Զ�ˢ������ֻ��Ե���println����
//		pWriter.write(97);								
		pWriter.print(97);								//�����Զ�ˢ��
//		pWriter.close();
	}

	public static void demo1() {
		/*
		 * �ֽ���
		 */
		PrintStream pStream = System.out;
		pStream.println(97);				//�ײ�ͨ��Integer.toString��97װ��Ϊ�ַ�����ӡ
		pStream.write(97);					//��������ҵ���Ӧ��a����ӡ
		
		Person p1 = new Person("Sam", 20);
		pStream.println(p1); 					//Ĭ�ϵ���toString()
		
		Person p2 = null;
		pStream.println(p2);  				//��ӡ�����������ͣ������null���ʹ�ӡnull
		pStream.close();
	}

}
