package com.jaggu.pack;

public class StringSubString {
	public static void main(String[] args) {
		String s1="Jagadeesh";
		System.out.println(s1);
		System.out.println(s1.startsWith("ga"));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("hs"));
		System.out.println(s1.endsWith("sh"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.length());
		System.out.println(s1.replace('a', 's'));
	}
}
