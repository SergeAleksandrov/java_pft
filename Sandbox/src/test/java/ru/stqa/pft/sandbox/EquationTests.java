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
  @Test
  public void testLinear() {
    Equation e4 = new Equation(0, 1, 1);
    Assert.assertEquals(e4.rootNumber(), 1);
    System.out.println("The fourth result " + "= " + e4.rootNumber());
  }
  @Test
    public void testConstant() {
    Equation e5 = new Equation(0, 0, 1);
    Assert.assertEquals(e5.rootNumber(), 0);
    System.out.println("The fifth result " + "= " + e5.rootNumber());
  }
    @Test
    public void testZero() {
      Equation e6 = new Equation(0, 0, 0);
      Assert.assertEquals(e6.rootNumber(), -1);
      System.out.println("The sixth result " + "= " + e6.rootNumber());
  }

 }
