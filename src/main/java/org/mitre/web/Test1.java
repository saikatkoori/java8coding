package org.mitre.web;
//Implement an algorithm to determine if a string has all unique characters. What if you
//can not use additional data structures?
public class Test1 {
public void test(String s){
	
	for(int i =0;i<s.length();i++){
		for(int j=i+1;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j)){
				System.out.println(true);
			}else
				System.out.println(false);
		}
		
	}
}
	public static void main(String args[]){
	Test1 t = new Test1();
	t.test("helo");
	}
}
