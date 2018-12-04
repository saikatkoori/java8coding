package com.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
class Parent{
	 String name;
	 String last;
	public Parent(String name, String last){
		this.name = name;
		this.last = last;
	}

}
public class Java8Streams {

	 public static void main(String[] args){
		 List<String> strings = Arrays.asList("sai","","Sai1","Sai2","Sai3"," ");
		 
		 List<Parent> strings7 = new ArrayList<Parent>();
		 Parent parent = new Parent("a","b");
		 Parent parent2 = new Parent("a2","c");
		 Parent parent3 = new Parent("a2","d");
		 Parent parent4 = new Parent("a4","e");
		strings7.add(parent);
		strings7.add(parent2);
		strings7.add(parent3);
		strings7.add(parent4);
Map<Integer, Parent> map = new HashMap<Integer, Parent>();
map.put(key, value)
		List<String> strings5 = Lists.newArrayList("1", "2");
		Map<Parent,Parent> map = strings7.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));
		map.forEach(System.out::println);

		//System.out.println(s3);
		 List<String> filtered = strings.stream().filter(n->!n.isEmpty()).collect(Collectors.toList());
		 String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		 filtered.forEach(System.out::println);
		// System.out.println(mergedString);
		 
		 List<Integer> num = Arrays.asList(1,4,2,6,7,9,4,0,1,2,44);
		 List<Integer> mapNum = num.stream().map(i->i/2).distinct().sorted().collect(Collectors.toList());
		// mapNum.forEach(System.out::println);
		// System.out.println(mapNum);
	 }
}
