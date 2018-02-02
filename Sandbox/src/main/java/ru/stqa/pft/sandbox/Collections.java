package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main (String[] args){

    List <String> languages = Arrays.asList("Java", "Pathon", "C#", "Rubi");

    for (String l : languages){
      System.out.println("I will learn " + l);
    }
  }
}
