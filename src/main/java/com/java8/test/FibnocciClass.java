package com.java8.test;

public class FibnocciClass {

	 static int fibonacci(int i){
		if(i==0)return 0;
		if(i==1)return 1;
	if(i>=10)return 10;
		return fibonacci(i+1) + fibonacci(i+2);
	}
	public static void main(String[] args){
		 System.out.println(fibonacci(9));
	
	}
}
