package com.maersk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("manohar","krishna","praveen","manohar");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//filter,map,skip,limit,sorted,distinct,peek,flatMap
		System.out.println(names.stream().filter(e->e.startsWith("m")).collect(Collectors.toList()));
		System.out.println(names.stream().map(e->e.length()).collect(Collectors.toList()));
		System.out.println(names.stream().skip(1).limit(2).collect(Collectors.toList()));
		System.out.println(names.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList()));
		System.out.println(names.stream().distinct().collect(Collectors.toList()));
		System.out.println(names.stream().peek(System.out::println).peek(System.out::println).collect(Collectors.toList()));
		
		List<List<String>> lists = new ArrayList<List<String>>();
		lists.add(Arrays.asList("s1","s2"));
		lists.add(Arrays.asList("s3","s4"));
		System.out.println(lists);
		
		System.out.println(lists.stream().flatMap(e->e.stream()).collect(Collectors.toList()));
		
		//allMatch, anyMatch, noneMatch, findFirst, findAny, count, collect, min, max, forEach, forEachOrdered, reduce, toArray
		System.out.println(names.stream().allMatch(e->e.startsWith("m")));
		System.out.println(names.stream().anyMatch(e->e.startsWith("m")));
		System.out.println(names.stream().noneMatch(e->e.startsWith("m")));
		System.out.println(names.stream().findFirst());
		System.out.println(names.stream().findAny());
		System.out.println(names.stream().count());
		System.out.println(names.stream().collect(Collectors.toList()));
		System.out.println(names.stream().min((e1,e2)->e1.compareTo(e2)));
		System.out.println(names.stream().max((e1,e2)->e1.compareTo(e2)));
		names.stream().forEach(System.out::println);
		names.stream().forEachOrdered(System.out::println);
		System.out.println(numbers.stream().reduce(0, (result,ele)->result+ele));
		System.out.println(names.stream().reduce(0, (result,ele)->result+ele.length(), (result,ele)->result+ele));
		System.out.println(Arrays.asList(names.stream().toArray(String[]::new)));

	}

}
