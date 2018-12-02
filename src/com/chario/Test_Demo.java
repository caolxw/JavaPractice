package com.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo1();
		FileReader_Demo.print(1);
		
		demo2();
		FileReader_Demo.print(2);
		
		demo3();
		FileReader_Demo.print(3);
		
		demo4();
		FileReader_Demo.print(4);
	}

	public static void demo4() {
		/*
		 * �Ӽ��̽���һ���ļ���·������ӡ�����ļ��������е� .java �ļ�
		 */
		printJavaFile(getFile());
	}
	
	public static File getFile() {
		System.out.println("Input a directory path:");
		Scanner scanner = new Scanner(System.in);		
		while(true) {
			String file = scanner.nextLine();
			File file2 = new File(file);
			if (!file2.exists()) {
				System.out.println("File not find!");
			}else if (file2.isFile()) {
				System.out.println("Not a directory!");
			}else {
				return file2;
			}
		}
	}
	
	/*
	 * ��ȡ�ļ����µ����� .java�ļ�
	 * 1������ֵ���� void
	 * 2�������б� File dir
	 */
	public static void printJavaFile(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				printJavaFile(file);
			}else if (file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file.getName());
			}
		}
	}

	public static void demo3() throws FileNotFoundException, IOException {
		/*
		 * ģ�����ð����
		 * 	����10�λ��ᣬִ��һ�ξ���ʾһ�������м��λ��ᣬ�������������ʾ�빺������
		 */
//		FileInputStream fis = new FileInputStream("times.txt");
//		int x = fis.read();
//		System.out.println(x);									//�������һ���ֽڵ���
		BufferedReader bReader = new BufferedReader(new FileReader("times.txt"));
		String line = bReader.readLine();
//		System.out.println(line);
		bReader.close();
		
		
		int times = Integer.parseInt(line)-1;
		if (times < 0) {
			System.out.println("�빺������");
		}else {
			System.out.println("������"+line+"�λ��ᡣ");
			FileWriter fWriter = new FileWriter("times.txt");
			fWriter.write(times + "");
			fWriter.close();
		}
	}

	public static void demo2() throws FileNotFoundException, IOException {
		/*
		 * ��ȡһ���ı���ÿ���ַ����ֵĴ��������д��times.txt��
		 */
		BufferedReader fReader = new BufferedReader(new FileReader("D:\\Java\\Practice\\src\\com\\bean\\Person.java"));
		HashMap<Character, Integer> map = new HashMap<>();
		int c;
		while((c = fReader.read()) != -1) {
			/*
			if (map.containsKey((char)c)) {
				map.put((char)c, map.get((char)c)+1);
				
			}else {
				map.put((char)c, 1);
			}
			*/
			map.put((char)c, map.containsKey((char)c) ? map.get((char)c)+1 : 1);
		}
		fReader.close();
		
//		for (char ch : map.keySet()) {
//			System.out.println(ch+" "+map.get(ch));
//		}
		
		BufferedWriter fWriter = new BufferedWriter(new FileWriter("times.txt"));
		for (char ch : map.keySet()) {
			switch (ch) {
			case '\t':
				fWriter.write("\\t = "+map.get(ch));
				break;
			case '\n' :
				fWriter.write("\\n = "+map.get(ch));
				break;
			case '\r' :
				fWriter.write("\\r = "+map.get(ch));
				break;
			case ' ' :
				fWriter.write("�ո� = "+map.get(ch));
				break;
			default:
				fWriter.write(ch+" = "+map.get(ch));
				break;
			}
			
			fWriter.newLine();
		}
		fWriter.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		/*
		 * ��һ���ı��ĵ��ϵ��ı���ת����һ�к����һ�н���...
		 * 	ע�⣺���������翪���
		 */
		BufferedReader fReader = new BufferedReader(new FileReader("yoyoyo.txt"));
		List<String> arr = new ArrayList<String>();
		String line;
		while((line = fReader.readLine()) != null) {
			arr.add(line);
		}
		fReader.close();							//�ı���ȡ��� �ر���
		
		BufferedWriter fWriter = new BufferedWriter(new FileWriter("yoyoyo.txt"));
		for(int i = arr.size()-1;i>=0;i--) {
			fWriter.write(arr.get(i));
			fWriter.newLine();
		}
		fWriter.close();
	}

}
