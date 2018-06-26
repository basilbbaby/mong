package com.mkyong.core;

import java.util.Scanner;

public class Pnum {

	public static void main(String[] args) {

		int temp, flag = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		for (int i = 2; i <= num - 1; i++) {
			temp = num % i;
			if (temp == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}

}
