package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow2
{
  public static void main(String[] args)
  {
    int i;
    int answer = (int) (Math.random() * 100);
    //System.out.println("The answer is " + answer);
    // ^ that will tell you the answer in the console
    int g = 8;
    for (i = 0; i < g; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You're Correct!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High!");
        MessageBox.showMessage("You have " + (g - i) + " left.");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too Low!");
        MessageBox.showMessage("You have " + (g - i) + " left.");
      }
    }
    if (i == 8)
    {
      MessageBox.showMessage("You lost!");
    }
  }
}
