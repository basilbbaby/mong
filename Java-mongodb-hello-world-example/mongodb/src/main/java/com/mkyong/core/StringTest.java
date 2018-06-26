package com.mkyong.core;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string:");
		String name = in.nextLine();
		int len = name.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
