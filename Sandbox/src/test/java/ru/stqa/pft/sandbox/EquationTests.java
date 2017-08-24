package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

  @Test
  public void test0() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 0);
    System.out.println("The first result " + "= " + e.rootNumber());
  }
  @Test
  public void test1() {
    Equation e2 = new Equation(1, 2, 1);
    Assert.assertEquals(e2.rootNumber(), 1);
    System.out.println("The second result " + "= " + e2.rootNumber());
  }
  @Test
  public void test2() {
    Equation e3 = new Equation(1, 5, 6);
    Assert.assertEquals(e3.rootNumber(), 2);
    System.out.println("The third result " + "= " + e3.rootNumber());
  }

 }
