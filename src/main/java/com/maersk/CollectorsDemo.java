package com.maersk;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<String> names = Arrays.asList("manohar","krishna","praveen","manohar");

		System.out.println(names.stream().collect(Collectors.toList()));
		System.out.println(names.stream().collect(Collectors.toSet()));
		System.out.println(names.stream().collect(Collectors.toCollection(TreeSet::new)));

		//System.out.println(names.stream().collect(Collectors.toMap(e->e, e->e.length())));
		//System.out.println(names.stream().collect(Collectors.toMap(e->e, e->e.length(), (oldval,newval)->oldval+newval)));

		System.out.println(names.stream().collect(Collectors.toMap(e->e, e->e.length(), (oldval,newval)->oldval+newval, TreeMap::new)));

		System.out.println(names.stream().collect(Collectors.groupingBy(e->e.charAt(0))));
		System.out.println(names.stream().collect(Collectors.partitioningBy(e->e.startsWith("m"))));
		System.out.println(names.stream().collect(Collectors.joining(",")));

		System.out.println(names.stream().collect(Collectors.mapping(e->e.length(), Collectors.toList())));
		System.out.println(names.stream().collect(Collectors.reducing(0, e->e.length(), (result, ele)->result+ele)));
		
		System.out.println(numbers.stream().collect(Collectors.counting()));
		System.out.println(numbers.stream().collect(Collectors.summarizingInt(n->n)));
		
	}

}
