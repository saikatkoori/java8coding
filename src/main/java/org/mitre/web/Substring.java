package org.mitre.web;

import java.util.Arrays;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substring s = new Substring();
		String s1 = "hellobaby";
		String s2 = "babyhello";
		s.checkSubString(s1,s2);
		
	}

	private void checkSubString(String s1, String s2) {
		char c[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c);
	    Arrays.sort(c2);
	    String s3 = new String(c);
	    String s4 = new String(c2);
		System.out.println(s3);
		System.out.println(s4);
		if(s3.equals(s4)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}

}
