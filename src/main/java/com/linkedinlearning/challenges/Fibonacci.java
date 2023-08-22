package com.linkedinlearning.challenges;

public class Fibonacci {
  
	  public static int fibonacci(int n){
	    int sum = 1;
	    int sum2 = 1;
	    int sum3 = 0;
	for(int i = 0; i < n - 2; i++){
	sum3 = sum + sum2;
	sum = sum2;
	sum2 = sum3;
	} return sum3;
	  }
  public static void main(String[] args) {
     System.out.println(fibonacci(12));
  }
}
