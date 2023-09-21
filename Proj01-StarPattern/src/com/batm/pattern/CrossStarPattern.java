//CrossStarPattern.java
package com.batm.pattern;

public class CrossStarPattern {

	public static void main(String[] args) {
		
		// creating nested for loop for rows and columns
		for (int i=0; i<9; i++) {		//this will manage rows in the pattern
			for (int j=0; j<9; j++) {		// this loop will manage cloumns and print the stars in the req pattern
				if (( i==0 || i==8) || (i==j || i+j==8)) {		// logic for printing the stars
		          System.out.print(" *");
		        }//if 
		        else {
		          System.out.print("   ");
		        }//else
		    }//for2
		      System.out.println();
		}//for1
	}//main

}//class
