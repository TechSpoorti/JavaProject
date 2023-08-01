package com.kn.arrays;

public class ArraysDeclration {
	public static void main(String args[]) {
		//Array Declaration
		int[] arr;
		//Array creation
		arr=new int[5];
		//Initialisation
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//Traverse
		System.out.println("Length of the array=" +arr.length);
		for(int i=0;i<=arr.length-1; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}

}
