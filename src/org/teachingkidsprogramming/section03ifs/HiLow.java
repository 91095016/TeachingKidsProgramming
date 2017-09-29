package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int i;
    int answer = (int) (Math.random() * 100);
    //System.out.println("The answer is " + answer);
    // ^ that will tell you the answer in the console
    for (i = 0; i < 8; i++)
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
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    if (i == 8)
    {
      MessageBox.showMessage("You lost!");
    }
  }
}
