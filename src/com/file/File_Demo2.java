package com.file;

import java.io.File;
import java.io.IOException;

/*
 * 	��������
 * 
 * 	����ڴ����ļ��л��ļ���ʱ��û��д�̷����Ǿͻᱣ����Ĭ���ļ�����
 * 
 * 	������	public boolean renameTo(File dest);
 * 	ɾ��		public boolean delete();
 */
public class File_Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		File_Demo.print(1);
		
		demo2();
		File_Demo.print(2);
		
		demo3();
		File_Demo.print(3);
		
		demo4();
		File_Demo.print(4);
		
	}

	public static void demo4() {
		File file = new File("aaa");
		System.out.println(file.delete()); 			//ɾ���ļ���
		
		File file2 = new File("ccc");
		System.out.println(file2.delete());  		//Ҫɾ�����ļ��б����ǿյ�
	}

	public static void demo3() {
		/*
		 * ������
		 * 	·������ͬ
		 * 	·��������ͬ
		 */
		File file = new File("test.txt");
		File file2 = new File("retest.txt");		//·������ͬ
		System.out.println(file.renameTo(file2));
		File file3 = new File("D:\\retext.txt"); 	//·��������ͬ
		System.out.println(file2.renameTo(file3));
		
		System.out.println(file3.delete()); 		//ɾ����ʱ���߻���վ
	}

	public static void demo2() {
		File dir = new File("aaa");
		System.out.println(dir.mkdir()); 						//��������Ŀ¼
		
		File dir2 = new File("bbb.txt"); 						//�ļ���Ҳ�����к�׺
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs()); 						//�����༶Ŀ¼
	}

	public static void demo1() throws IOException {
		File file = new File("test.txt");
		System.out.println(file.createNewFile());				//���û���򴴽����ļ� ����true
		
		File file2 = new File("zzz");							//û�����·���ͺ�׺Ҳ���Դ����ļ�
		System.out.println(file2.createNewFile());
	}
	

}
