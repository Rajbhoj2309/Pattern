package com.pattern;


public class BinaryTriangle {
	public static void main(String[] args) {
		 
		int count=1;
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.format("%d",count++ %2);
			}
			System.out.println();
		}
		/*
		 ANS-
		1
		01
		010
		1010
		10101
		*/
		
		int countt=1;
		
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.format(" "+"%d",countt++);
			}
			System.out.println();
		}
//		1
//		23
//		456
//		78910
//		1112131415
		
	}
}
