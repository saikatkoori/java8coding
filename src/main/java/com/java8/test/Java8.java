package com.java8.test;

import java.util.ArrayList;
import java.util.List;import org.apache.log4j.net.SyslogAppender;

public class Java8 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("sai");
		names.add("sai1");
		names.add("sai2");
		names.add("sai3");names.add("sai4");
		
		names.forEach(System.out::println);
		
		
Java8 j = new Java8();
		Operation o = (a,b)->a+b;
		Operation m = (a,b)->a*b;
		System.out.println("addition"+ " " +j.operator(8,7,o));
		System.out.println("addition"+ " " +j.operator(8,7,m));
	}

	private int operator(int i, int j, Operation o) {
		// TODO Auto-generated method stub
		return o.operate(i, j);
	}
	

}
