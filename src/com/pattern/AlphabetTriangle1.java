package com.pattern;

import java.util.Scanner;


public class AlphabetTriangle1 {
	public static void main(String[] args) {
		int line;
		int row; 
		int col;
		
		System.out.println("This is simple star pattern program ");
		char ch='A';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers of lines");
		line=sc.nextInt();
		for ( row =1; row <=line; row++) {
			for (col = 1; col <=row; col++) {
				System.out.print(""+ch);
			}
			System.out.println();
			ch++;
		}
	}

}
