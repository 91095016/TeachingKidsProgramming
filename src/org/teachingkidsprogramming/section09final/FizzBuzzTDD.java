package org.teachingkidsprogramming.section09final;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTDD
{
  //   For the numbers being tested, print out either that number, or, 
  //    If that number is divisible by 3, then print the word 'Fizz', 
  //    If that number is divisible by 5, then print the word 'Buzz', 
  //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
  //
  //    Write tests using the Assert object via the TDD style
  //
  //    For more complete directions see this page
  //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  // TEST 1
  @Test
  public void test1Returns1()
  {
    String result = FizzBuzzTDD.convert(1);
    assertEquals("1", result);
  }
  public static String convert(int num)
  {
    if (num % 15 == 0)
      return "FizzBuzz";
    if (num % 3 == 0)
      return "Fizz";
    if (num % 5 == 0)
      return "Buzz";
    return num + "";
  }
  // TEST 2
  @Test
  public void test3ReturnsFizz()
  {
    String Fizz = FizzBuzzTDD.Fizz(1);
    assertEquals("1", Fizz);
  }
  public static String Fizz(int num)
  {
    if (num % 3 == 0)
      return "Fizz";
    return num + "";
  }
  // TEST 3
  @Test
  public void test5ReturnsBuzz()
  {
    String Buzz = FizzBuzzTDD.Buzz(1);
    assertEquals("1", Buzz);
  }
  public static String Buzz(int num)
  {
    if (num % 5 == 0)
      return "Buzz";
    return num + "";
  }
  // TEST 4
  @Test
  public void test15ReturnsFizzBuzz()
  {
    String FizzBuzz = FizzBuzzTDD.FizzBuzz(1);
    assertEquals("1", FizzBuzz);
  }
  public static String FizzBuzz(int num)
  {
    if (num % 15 == 0)
      return "FizzBuzz";
    return num + "";
  }
}
