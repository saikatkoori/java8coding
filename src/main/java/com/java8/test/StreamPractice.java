package com.java8.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Person{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	private String last;
}
public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("sai");
		list.add("sai2");
		list.add("sai2");
		list.add("sai4");
		list.add("sai5");
		list.add("sai6");
		List<String> list2 = new ArrayList<String>();
		list2.add("sai");
		list2.add("sai2");
		list2.add("sai2");
		list2.add("sai4");
		list2.add("sai5");
		list2.add("sai6");
		list2.addAll(list);
		List<Person> list4 = new ArrayList<Person>();
		Person person = new Person();
		person.setLast("kat");
		person.setName("sai");
		Person person2 = new Person();
		person2.setLast("kat2");
		person2.setName("sai2");
		Person person4 = new Person();
		person4.setLast("kat2");
		person4.setName("sai2");
		Person person3 = new Person();
		person3.setLast("kat1");
		person3.setName("sai1");
		list4.add(person);
		list4.add(person2);
		list4.add(person3);
		list4.add(person4);
		List<Integer> list11 = new ArrayList<>();
		list11.add(11);
		list11.add(12);
		list11.add(13);
		list11.add(17);
		list11.add(14);list11.add(11);
		list11.add(112);
		list11.add(0);
		list11.add(31);
		list11.add(61);
		List<Integer> list11new = list11.stream().distinct().filter(e->e!=11).map(e->e*2).sorted().collect(Collectors.toList());
		int sum = list11.stream().mapToInt(i->i.intValue()).sum();
		int su2 = list11.stream().reduce(0, Integer::sum);
		System.out.println(su2);

		list11new.forEach((value)->{System.out.println(value);});
//list2.forEach((string)->{System.out.println(string.toString());});
Map<String,Person> map = list4.stream().collect(Collectors.toMap(Person::getLast, Function.identity(),(old,newval)->old));
Set<Person> set1 = list4.stream().collect(Collectors.toSet());
Set<Person> set = list4.stream().collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Person::getLast))));
map.forEach((key,value)->{System.out.println(key +""+value.getName());});
set.forEach((Person)->{System.out.println(Person.getLast() + " "+Person.getName() );});
set1.forEach((Person)->{System.out.println(Person.getLast() + " "+Person.getName() );});

	}

}
