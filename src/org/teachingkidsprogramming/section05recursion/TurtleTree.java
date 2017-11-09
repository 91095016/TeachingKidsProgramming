package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.show();
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      Tortoise.move(length);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor()
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //            A 10 pixel long branch is lime --#20
    colors.put(10, PenColors.Greens.Lime);
    //            A 20 pixel long branch is forest green --#19
    colors.put(20, PenColors.Greens.ForestGreen);
    //            A 30 pixel long branch is dark green --#18
    colors.put(30, PenColors.Greens.DarkGreen);
    //            A 40 pixel long branch is olive --#17
    colors.put(40, PenColors.Greens.Olive);
    //            A 50 pixel long branch is sienna --#14
    colors.put(50, PenColors.Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
    colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    Tortoise.turn(60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    adjustColor();
    Tortoise.move(-1 * length);
  }
  private static void drawShorterBranch(int length)
  {
    drawBranch(length - 10);
  }
}