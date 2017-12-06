package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  //   For the whole numbers from 1 to 100, print either that number, or, 
  //    If that number is divisible by 3, then print the word 'Fizz', 
  //    If that number is divisible by 5, then print the word 'Buzz', 
  //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
  //
  public static void main(String[] args)
  {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 100; i++)
    {
      sb.append(convert(i));
    }
    System.out.print(sb);
  }
  public static String convert(int i)
  {
    if (0 == i % 15) { return "\n FizzBuzz"; }
    if (0 == i % 5) { return "\n Buzz"; }
    if (0 == i % 3) { return "\n Fizz"; }
    return "\n " + i;
  }
}
