package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class Unicorn_Horn
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.setX(200);
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.turn(45);
    for (int i = 0; i < 100; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      length = length + 1;
      drawTriangle();
      //Tortoise.turn(360 / 60);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.turn(135);
      Tortoise.move(length);
    }
  }
}
