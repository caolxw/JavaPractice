package com.file;

import java.io.File;
import java.io.IOException;

/*
 * 	创建功能
 * 
 * 	如果在创建文件夹或文件的时候没有写盘符，那就会保存在默认文件夹下
 * 
 * 	重命名	public boolean renameTo(File dest);
 * 	删除		public boolean delete();
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
		System.out.println(file.delete()); 			//删除文件夹
		
		File file2 = new File("ccc");
		System.out.println(file2.delete());  		//要删除的文件夹必须是空的
	}

	public static void demo3() {
		/*
		 * 重命名
		 * 	路径名相同
		 * 	路径名不相同
		 */
		File file = new File("test.txt");
		File file2 = new File("retest.txt");		//路径名相同
		System.out.println(file.renameTo(file2));
		File file3 = new File("D:\\retext.txt"); 	//路径名不相同
		System.out.println(file2.renameTo(file3));
		
		System.out.println(file3.delete()); 		//删除的时候不走回收站
	}

	public static void demo2() {
		File dir = new File("aaa");
		System.out.println(dir.mkdir()); 						//创建单级目录
		
		File dir2 = new File("bbb.txt"); 						//文件夹也可以有后缀
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs()); 						//创建多级目录
	}

	public static void demo1() throws IOException {
		File file = new File("test.txt");
		System.out.println(file.createNewFile());				//如果没有则创建该文件 返回true
		
		File file2 = new File("zzz");							//没有添加路径和后缀也可以创建文件
		System.out.println(file2.createNewFile());
	}
	

}
