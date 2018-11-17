package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	 public static void main(String[] args){
		 List<String> strings = Arrays.asList("sai","","Sai1","Sai2","Sai3"," ");
		 strings.toArray();
		 List<String> filtered = strings.stream().filter(n->!n.isEmpty()).collect(Collectors.toList());
		 String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		 filtered.forEach(System.out::println);
		 System.out.println(mergedString);
		 
		 List<Integer> num = Arrays.asList(1,4,2,6,7,9,4,0,1,2,44);
		 List<Integer> mapNum = num.stream().map(i->i/2).distinct().sorted().collect(Collectors.toList());
		 mapNum.forEach(System.out::println);
		 System.out.println(mapNum);
	 }
}
