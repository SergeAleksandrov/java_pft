package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    double l = 5;
    double a = 3;
    double b = 2;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
  }

  public static double area(double ven) {
    return ven * ven;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}