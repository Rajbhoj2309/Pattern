package com.pattern;

public class NumberPattern2 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		///////////////////////////////////////////////////////////////
		System.out.println("reverse Pattern");
		for (int i = 1 ,r=5; i <=5; i++ ,r--) {
			for (int j = 5; j >=r ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		////////////////////////////////////////////////////////////////////////////
		System.out.println("both mix Pattern 1");
		for (int i = 1 ,r=5; i <=5; i++ ,r--) {
			for (int j = 5; j >=r ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 2; i <=5; i++) {
			for (int j = 5; j >=i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////////
		System.out.println("both mix Pattern 2");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1 ,r=4; i <=5; i++ ,r--) {
			for (int j = 5; j >=r ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
  