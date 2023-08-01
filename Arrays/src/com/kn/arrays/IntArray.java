package com.kn.arrays;

import java.util.Scanner;

public class IntArray {
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		//Array dec
		int[] arr;
		//Array cre
		System.out.println("enter the size of the array");
		arr=new int[sc.nextInt()];
		//Array intialisation
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the data for "+(i+1)+"=");
			arr[i]=sc.nextInt();}
			//Array travesing
			/*forward
		for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);*/
		//backsward
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
			
			}
			sc.close();
		}
		
	}


