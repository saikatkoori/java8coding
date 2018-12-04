package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Fun {

	public static void main(String[] args) {


		List<Integer> numbers = Arrays.asList(1,4,3,5,3,8,9,55,4,2,6,0);
		//eval(numbers, n->true);
		//eval(numbers,n->n%2==0);
		eval(numbers,n->n*0==2);
		
	}

	private static void eval(List<Integer> numbers, Predicate<Integer> object) {
		for(Integer l :numbers){
			if(object.test(l)){
				System.out.println(l+" ");
			}
		}
		// TODO Auto-generated method stub
		
	}

}
