package com.linkedinlearning.challenges;

public class StringCalculater {

  public static int stringCalc(String numbers){
    String[] number = numbers.split(",");
    int sum = 0;
    for(String num: number){
      sum += Integer.parseInt(num);
    }
    return sum;
  }
   public static void main(String[] args) {
    String numbers = "1,2,3,4,5,10";
     System.out.println(stringCalc(numbers));
  }
}
  

