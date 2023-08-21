package com.linkedinlearning.challenges;

import java.util.*;

public class ArithmeticMean {
public double mean(Collection<Integer> numbers){
int sum = 0;

for(Integer num: numbers){
  sum += num;
}
  return sum/numbers.size();
}

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers, 3,4,5,6,3,2,1323,3335,6,7);
    ArithmeticMean am = new ArithmeticMean();
    System.out.println(am.mean(numbers));

  }
}