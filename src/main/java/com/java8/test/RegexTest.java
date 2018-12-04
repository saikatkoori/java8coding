package com.java8.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("heelo my name is sai"); 
		s.reverse();
		System.out.println(s);
		
String line ="<h1>hello sir how you doing , yes</h1>";
System.out.println(line);
Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
Matcher m = r.matcher(line);
		
while (m.find()) {
    System.out.println(m.group(2));
   
}
	}

}
