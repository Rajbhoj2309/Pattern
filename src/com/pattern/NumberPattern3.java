package com.pattern;

public class NumberPattern3 {
	 public static void main(String arg[])
	    {

	        int t = 1;
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                if (t == 10) {
	                    t = 0;
	                }
	                System.out.print(t++);
	            }
	            System.out.println();
	        }
	    }
}
//1
//23
//456
//7890
//12345