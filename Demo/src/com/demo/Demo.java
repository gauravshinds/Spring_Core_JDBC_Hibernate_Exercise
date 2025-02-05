package com.demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		
		int size = sc.nextInt();
		
		int[]arr = new int[5];
		
		System.out.println("enter element");
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<size; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("min value" + min);
		System.out.println("max value" + max);
		
		sc.close();
		

	}
	
	
	
	

}
