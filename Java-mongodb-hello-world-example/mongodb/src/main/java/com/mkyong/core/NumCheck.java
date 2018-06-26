package com.mkyong.core;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		int c = 2;
		int flag = 0;

		while (c <= num-1) {
			if (num % c == 0) {
				flag = 1;
				break;
			}
			c++;
		}

		if (flag == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
