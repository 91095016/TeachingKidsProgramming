package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Rebecca");
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 10; i < 300; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(20);
    }
    //  
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
