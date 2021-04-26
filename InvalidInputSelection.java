package com.test;
/*
* This is InvalidInputException class
* */
public class InvalidInputException extends Exception{
   /*
   * This is one argument constructor.
   * */
   public InvalidInputException(String input){
       super(input);
       System.out.println(input+" is not valid input");
   }

}