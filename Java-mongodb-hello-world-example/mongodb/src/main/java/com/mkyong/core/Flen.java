package com.mkyong.core;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.Scanner;

public class Flen {

	public static void main(String[] args) {

		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string");
		String ch=in.nextLine();
		
		char ch1[]=ch.toCharArray();
	
		int len=ch.length();
		System.out.println("Total length is: "+len);
		int letter=0,num=0,space=0;
		
		for(int i=0;i<ch.length();i++)
		{
			if(Character.isLetter(ch1[i]))
			{
				letter++;
			}
			if(Character.isDigit(ch1[i]))
			{
				num++;
			}
			if(Character.isSpace(ch1[i]))
			{
				space++;
			}
		}
		System.out.println(" NO of letter: "+letter+" no of numbers: "+num+" no of spcae: "+space);
	}

}
