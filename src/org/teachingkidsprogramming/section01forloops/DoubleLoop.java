package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      for (int j = 15; j < 4; i++)
      {
        Tortoise.turn(360 / -6);
        Tortoise.setPenWidth(17);
        Tortoise.move(8);
        Tortoise.turn(360 / 5);
      } //         End Repeat --#7.2 
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
      //    End Repeat --#3.2
      Tortoise.setX(300);
      Tortoise.setY(200);
      for (int p = 15; p < 0; i++)
      {
        Tortoise.setPenColor(PenColors.Grays.Black);
        Tortoise.move(25);
        Tortoise.turn(360 / 5);
      } //    End Repeat --#12.2
    }
  }
}
