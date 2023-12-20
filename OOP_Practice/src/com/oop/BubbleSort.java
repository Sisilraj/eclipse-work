package com.oop;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] a = {10,30,16,5,20,7,12};
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<a.length-1;i++) {
			for(int j = 0;j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println("a: "+a+"    b:   "+b);
//		System.out.println("After swapping............");
//		
//		int t = a;
//		a=b;
//		b=t;
//		
//		System.out.println("a: "+a+"    b:   "+b);
//		
//	   int a = 5;
//       int b = 10;
//
//        System.out.println("Before swapping: a = " + a + ", b = " + b);
//
//        // Swap the values without using a temporary variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
