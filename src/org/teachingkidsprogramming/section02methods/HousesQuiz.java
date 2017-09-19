package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    small();
    medium();
    large();
    moveTheLength();
    turnTheCorner();
    drawASide();
  }
  private void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  private void turnTheCorner()
  {
    Tortoise.turn(-360 / 3);
  }
  private void moveTheLength()
  {
    Tortoise.move(length);
  }
  private void large()
  {
    length = 63;
  }
  private void medium()
  {
    length = 21;
  }
  private void small()
  {
    length = 7;
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
