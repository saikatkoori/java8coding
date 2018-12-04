package com.java8.test;

	import java.math.BigDecimal;
	import java.util.*;
	class HackerBigDecimal{
	    public static void main(String []args){
	        //Input
	  
	        String []s={"1","3","4.5","5.6","0"};
	      

	        //Collections.sort(Arrays.asList(s));
	        Arrays.sort(s, Collections.reverseOrder());
	       
	        //Output
	        for(int i=0;i<s.length;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
	}

