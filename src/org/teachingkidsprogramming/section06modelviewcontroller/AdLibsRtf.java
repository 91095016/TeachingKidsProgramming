package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb;
    public String edVerb;
    public String bodayPart;
  }
  public static void main(String[] args)
  {
    //  Create a new 'word' container your story's words (uncomment line 10) --#1.1
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb: ");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    String currentEdverb = MessageBox.askForTextInput("Enter a word with an ending of, 'ed': ");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part: ");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    Parser.parseRtfFile("view.rtf", word);
    String currentStory = "Today I woke up" + word.adverb + ". ";
    currentStory = currentStory + "Then I" + word.edVerb + ". ";
    currentStory = currentStory + "my" + word.bodayPart + ". ";
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile("stuff");
  }
}