package com.bean;

public class Student {
	
	private int id;
	private String name;
	private double yuwen;
	private double shuxue;
	private double yingyu;
	private double scoresum;
	
	public Student() {}
	public Student(int id,String name,double yuwen,double shuxue,double yingyu) {
		this.id = id;
		this.name = name;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
		this.yingyu = yingyu;
		scoresum = yuwen + shuxue + yingyu;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", yuwen=" + yuwen + ", shuxue=" + shuxue + ", yingyu=" + yingyu
				+ ", scoresum=" + scoresum + "]";
	}
	public double getScoresum() {
		return scoresum;
	}
	
	
	
	
}
