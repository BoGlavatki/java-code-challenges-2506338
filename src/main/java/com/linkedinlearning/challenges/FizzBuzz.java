package com.linkedinlearning.challenges;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;

System.out.println("Gib ein ganze Zahl ein");
number = sc.nextInt();
for(int i = 1; i < number + 151; i++){
  if((i % 3 == 0) && (i % 5 == 0)){
    System.out.println("FizzBuzz");
  }
  else if((i % 3 == 0) && !(i % 5 == 0)){
    System.out.println("Fizz");
  }
   else if(!(i % 3 == 0) && (i % 5 == 0)){
    System.out.println("Buzz");
  }
  else{
    System.out.println(i);
  }
}


  }
  
}
