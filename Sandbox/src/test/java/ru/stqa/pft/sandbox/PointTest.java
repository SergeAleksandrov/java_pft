package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance(){
    Point p1 = new Point(2,2);
    Point p2 = new Point(4,4);
    Assert.assertEquals(distance(p1,p2), 2.8284271247461903);
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
}
}