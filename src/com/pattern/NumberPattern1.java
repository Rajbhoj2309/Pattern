package com.pattern;

public class NumberPattern1 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("reverse");
		for (int i = 1,r=5; i <=5; i++,r--) {
			for (int j =1; j<=r; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("both mix pattern 1");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = 1,r=4; i <=4; i++,r--) {
			for (int j =1; j<=r; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("both mix pattern 2");
		
		for (int i = 1,r=5; i <=5; i++,r--) {
			for (int j =1; j<=r; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 2; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//
//1
//12
//123
//1234
//12345