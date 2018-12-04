package com.java8.test;

public class TestingString {

	public static void main(String[] args){
		String test = "hello sai garu";
		String test1 ="hello sai garu";
		Integer a =1299999999;
		byte c = 127;
		String test3 = new String("hello sai garu");
		if(test==test1){
			System.out.println("== test pass");
		}
		if(test.equals(test1)){
			System.out.println("== test pass");
			
		}
	
		if(3*0.1 == 0.3){
			System.out.println("equals test pass");
		}
		System.out.println(3*0.1);
	}
}
