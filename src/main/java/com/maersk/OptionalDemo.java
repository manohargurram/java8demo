package com.maersk;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String name = "mano";
		Optional<String> optional = Optional.ofNullable(name);

		System.out.println(optional.get());
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("empty string"));

	}

}
