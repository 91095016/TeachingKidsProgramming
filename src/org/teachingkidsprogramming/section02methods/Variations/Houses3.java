package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses3
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("PalmDigital");
    VirtualProctor.setName("Rebecca Chang");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(height);
    drawHouseSlantRoof(height);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    drawFlatRoof();
    //drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    //drawFlatRoof();
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    //drawFlatRoof();
    //drawPointyRoof();
    drawSlantRoof();
    Tortoise.move(50);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawSlantRoof()
  {
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(30);
    Tortoise.turn(45);
  }
}