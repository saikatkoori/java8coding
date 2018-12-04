package com.java8.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
	 private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	       
	      String[] noTests = scanner.nextLine().split(" ");
	      BigDecimal tests = new BigDecimal(noTests[0]);
	      for(int i=0;i<tests.intValue();i++){
	          output();
	      }
	    }
	    
	    public static int output(){
	        

	        int  intval = scanner.nextInt();
	       
	        int[] houses = new int[intval];

	        String[] houseItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	       int temp1,temp2,temp3;
	        String result = "0";

	        for (int i = 0; i < intval; i++) {
	        	int pricesItem = Integer.parseInt(houseItems[i]);
	            houses[i] = pricesItem;
	        }
	        for(int i = 0;i<houses.length;i++){
	            if(i+2 < houses.length){
	                temp1 = houses[i];
	                temp2 = houses[i+1];
	                temp3 = houses[i+2];
	                if(temp1 == temp3){
	                    result =String.valueOf(temp2);
	                    break;
	                }
	            }
	        }
	        
	        System.out.println(result);
	        return 0;
	    }
	}