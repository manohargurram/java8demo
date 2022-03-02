package com.maersk;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Demo {

	public static void main(String[] args) {
		Encoder encoder =	Base64.getEncoder();
		String encodedStr =	encoder.encodeToString("manohar".getBytes());
		System.out.println(encodedStr);

		Decoder decoder = Base64.getDecoder();
		System.out.println(new String(decoder.decode(encodedStr)));

	}

}
