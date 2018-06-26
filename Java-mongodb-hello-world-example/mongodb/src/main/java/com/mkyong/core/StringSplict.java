package com.mkyong.core;

import java.util.Scanner;

public class StringSplict {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String lReverse=in.nextLine();
		StringBuffer buffer=new StringBuffer();
		
		String ch[]=lReverse.split(" ");
		String rev=" ";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev +=ch[i]+" ";
		}
		buffer.append(rev);
		System.out.println(buffer.reverse());
		
	}

}
