package com.linkedinlearning.challenges;
import java.util.*;
public class PrimeNumberFinder {
  static List<Integer> findPrimeNumbersInInterval(int a, int b) {
    List<Integer> primeNumbers = new ArrayList<Integer>();
    for (int i = a; i < b + 1; i++) {
      if (!(i == 2) && !(i == 0) && !(i == 3) && !(i == 5) && !(i == 7) && !(i == 1) && !(i % 2 == 0) && !(i % 3 == 0)
          && !(i % 4 == 0) && !(i % 5 == 0) && !(i % 6 == 0) && !(i % 7 == 0) && !(i % 8 == 0) && !(i % 9 == 0)) {
        System.out.println("i ist primzahl: " + i);
        primeNumbers.add(i);
      } else if ((i == 2) || (i == 3) || (i == 5) || (i == 7)) {
        System.out.println("i ist primzahl: " + i);
        primeNumbers.add(i);
      } else if ((i == 0) || (i == 1)) {
        System.out.println("Durch Null darf man nicht teilen! 1 ist kein Primzahl!");
      }
    }
    return primeNumbers;
  }

  public static void main(String[] args) {

    List<Integer> primeIntegers = findPrimeNumbersInInterval(0, 88);
    for (int i = 0; i < primeIntegers.size(); i++) {
      System.out.println(primeIntegers.get(i));
    }

  }
}
