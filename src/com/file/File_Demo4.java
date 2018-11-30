package com.file;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * File获取功能
 * 	String getAbsolutePath();
 * 	String getPath();
 * 	String getName();
 * 	long length();
 * 	long lastModified();
 * 	String[] list();
 * 	File[] listFiles();
 */
public class File_Demo4 {

	public static void main(String[] args) {
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
		/*
		 * 文件过滤器
		 */
		File dir = new File("C:\\Users\\61721\\Desktop\\新建文件夹");
		String[] arr = dir.list(new FilenameFilter() {				//匿名内部类
			
			@Override
			public boolean accept(File dir, String name) {	
				// TODO Auto-generated method stub
//				System.out.println(dir);
//				System.out.println(name);
				File file = new File(dir,name);
				
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void demo3() {
		/*
		 * 	判断文件下面是否有后缀为.jpg的文件，如果有，就输出文件名
		 */
		File dir = new File("C:\\Users\\61721\\Desktop\\新建文件夹");
		
		String[] arr = dir.list();
		for (String string : arr) {
			if (string.endsWith(".jpg")) {
				System.out.println(string);
			}
		}
		
		//方式二
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.getName().endsWith(".jpg") && file.isFile()) {
				System.out.println(file);
			}
		}
	}

	public static void demo2() {
		File dir = new File("D:\\Java\\Practice\\src\\com\\bean");
		String[] arr = dir.list();									//拿到文件夹下的所有文件名称
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file); 								//拿到文件夹下的所有文件的文件对象
		}
	}

	public static void demo1() {
		File file = new File("File_Demo.java");
		File file2 = new File("D:\\Java\\Practice\\src\\com\\bean\\Person.java");
		System.out.println(file.getAbsolutePath());			//获取绝对路径
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file2.getPath());				//获取构造方法中传入的路径
		System.out.println(file.getPath());
		
		System.out.println(file2.getName()); 				//获取文件或文件夹名称
		System.out.println(file.getName());
		
		System.out.println(file2.length());					//获取文件内容长度
		
		System.out.println(file2.lastModified()); 			//获取最后的修改时间
		Date date = new Date(file2.lastModified());
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//格式化
		
		System.out.println(sFormat.format(date));
	}

}
