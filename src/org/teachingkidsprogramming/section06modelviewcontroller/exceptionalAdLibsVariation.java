package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class exceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String bodyPart = currentBodyPart();
    String story = "Today, ";
    story = "Today " + "I woke " + adverb + ". ";
    story = story + "Then I " + edverb + " ";
    story = story + "my " + bodyPart + ". ";
    MessageBox.showMessage(story);
  } //End of Main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    { // Beginning of IF STATEMENT
      MessageBox.showMessage("Invalid Input. Please enter an adverb. Try again.");
      askAdverb();
    } // End of IF STATEMENT
    if (adverb.matches("[.*\\d+.*]"))
    { // Beginning of IF STATEMENT
      MessageBox.showMessage("NUMBERS are not ADVERBS.Try again.");
      askAdverb();
    } // End of IF STATEMENT
    return adverb;
  } // End of ADVERB method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter an edverb: ");
    if (edverb.isEmpty())
    { // Beginning of IF STATEMENT
      MessageBox.showMessage("Invalid input. Please enter an edverb. Try again.");
      askEdverb();
    } // End of IF STATEMENT
    if (edverb.matches("[.*\\d+.*]"))
    { // Beginning of IF STATEMENT
      MessageBox.showMessage("NUMBERS are not EDVERBS. Try again.");
      askEdverb();
    } // End of IF STATEMENT
    return edverb;
  } // End of EDVERB method
  private static String currentBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if (bodyPart.isEmpty())
    {// Beginning of IF STATEMENT
      MessageBox.showMessage("Invalid input. Please enter a body part. Try again.");
      currentBodyPart();
    } // End of IF STATEMENT
    if (bodyPart.matches("[.*\\d+.*]"))
    { // Beginning of IF STATEMENT
      MessageBox.showMessage("NUMBERS are not BODY PARTS. Try again.");
      currentBodyPart();
    } // End of IF STATEMENT
    return bodyPart;
  } // End of BODYPART method
} // End of class
