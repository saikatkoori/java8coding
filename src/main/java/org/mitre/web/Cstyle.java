package org.mitre.web;
//Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
//five characters, including the null character.)
public class Cstyle {
	public void style(String s){
		String s2 = new StringBuffer(s).reverse().toString();
		System.out.println(s2);
	}
	public static void main(String args[]){
		Cstyle c = new Cstyle();
		c.style("abcd");
	}
}
