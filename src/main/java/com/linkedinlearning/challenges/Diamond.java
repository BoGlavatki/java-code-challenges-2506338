package com.linkedinlearning.challenges;

import java.util.Scanner;

public class Diamond {

  public static void renderDiamond(String l){
    char lU = Character.toUpperCase(l.charAt(0));
    char ch;
    int i = lU - 65;
    int j;
    for(j = 65; j < 65 + (i+1); j++){
      ch = (char)(65+(j-65));
      if((lU-j > 0)){
        for(int t = 65; t<65 + lU-j; t++){
          System.out.print(" ");
        }
      }
      System.out.print(ch);
      if(65-j < 0){
      for(int t = 0; t < (j-65);t++){
        if(t>0){
          System.out.print(" ");
        }
        System.out.print(" ");
        }
        System.out.print(ch);
      }
   System.out.println();
    }
    for(int y = lU-1; y >= 65; y--){
      ch = (char)(65+(y-65));
        if((y >= 65)){
        for(int t = 65; t<65 + lU-y; t++){
          System.out.print(" ");
        }
      }
      System.out.print(ch);
      if(65-y < 0){
       for(int t = 0; t < (y-65);t++){
        if(t>0){
          System.out.print(" ");
        }
        System.out.print(" ");
        }
        System.out.print(ch);
      }
   System.out.println();
    }
  }
   public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("buchstabe eingeben");
String ch = sc.nextLine();
renderDiamond(ch);

  }

}
