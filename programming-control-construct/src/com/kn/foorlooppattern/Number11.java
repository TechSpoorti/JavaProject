package com.kn.foorlooppattern;

public class Number11 {

	public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++) {
	      for (int j = 1; j <=5 + 1; j++) {
	    	  
	    	  if(i>=j) {
	    		  System.out.print("1");
	    		 
	    	  }
	    	  else
	    	  {
	    		  System.out.print(" ");
	    	  }
	        System.out.print(i + 1);
	      }
	      System.out.println();
	    }
	  }

	}

