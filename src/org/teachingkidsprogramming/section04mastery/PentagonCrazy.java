package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      Tortoise.move(i++);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int i = 2;
    Tortoise.setPenWidth(i++);
    Tortoise.setPenWidth(1);
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Purples.Indigo);
  }
}
