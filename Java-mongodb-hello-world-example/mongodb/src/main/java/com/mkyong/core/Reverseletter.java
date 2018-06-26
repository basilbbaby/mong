package com.mkyong.core;

import java.util.Scanner;

public class Reverseletter {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String ch=in.nextLine();
		
		StringBuffer buffer=new StringBuffer();
		String reverse[] = ch.split(" ");
        String Finalword = " ";
        int d=reverse.length;
        
        for(int y = d-1; y>=0; y--)
        {
            Finalword += reverse[y]+" ";
        }
   
        buffer.append(Finalword);
        System.out.println(buffer.reverse());
		  
		}
	}


