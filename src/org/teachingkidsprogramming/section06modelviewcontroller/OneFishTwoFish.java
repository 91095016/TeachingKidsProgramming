package org.teachingkidsprogramming.section06modelviewcontroller;

import java.util.Scanner;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//*************This Lesson is In Development*****************************//
@SuppressWarnings("unused")
public class OneFishTwoFish
{
  // Create a Scanner to make a string --#1
  Scanner string = new Scanner(System.in);
  String  name   = string.next();
  public static void main(String[] args)
  {
    makeAString();
  }
  public static void makeAString()
  {
    final String input = "1 fish 2 fish red fish blue fish,black fish,blue fish,old fish,new fish ";
    // Use your scanner with your input --#2
    // Display a new line and "We have: " and the input and then a new line --#3
    String currentAdverb = MessageBox.askForTextInput("We have: ");
    // Now, tell a story with a new Scanner instance (tellAStory recipe) --#8
  }
  //-------recipe for tellAStory------------------------------------
  private static void tellAStory(final String input)
  {
    // Use 'fish' as the base text w/your scanner [story] HINT: useDelimeter --#5
    String useDelimeter = "fish";
    // Get the next number to use in your scanner [story] HINT: nextInt --#7
    // Get the next value to use in your scanner [story] HINT: next --#9
    // Iterate over each fish [string] HINT: Iterable --#10
    // Create a new string iterator --#11
    // Create a new scanner for your input --#12
    // Use a comma to separate the strings in your story HINT: useDelimeter --#13
    // Return the result --#6
    return name;
    {
      //  Display "And then: " and the fish in the console --#14
    }
    System.out.println("");
    //------end recipe tellAStory--------------------------------------  
  }
}
