package com.pattern;

import java.util.Scanner;

public class NumberPattern4 {
	 public static void main(String args[])
	    {
	        int n, i, j;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of rows ");
	        n = sc.nextInt();

	        for (i = 1; i <= n; i++)
	        {
	            for (j = i; j <= n; j++)
	            {
	                if (i % 2 == 0)
	                    System.out.print("0");
	                else
	                    System.out.print("1");
	            }
	            System.out.println();
	        }
	        System.out.println("reverse");
	        for (i = 1; i <= n; i++)
	        {
	            for (j = 1; j <=i; j++)
	            {
	                if (i % 2 == 0)
	                    System.out.print("0");
	                else
	                    System.out.print("1");
	            }
	            System.out.println();
	        }
	    }

}
//Enter the number of rows 
//5
//11111
//0000
//111
//00
//1
//reverse
//1
//00
//111
//0000
//11111
