package com.test;
/*
* This is Test class
* */
public class Test {

   public static void main(String[] args) throws InvalidInputException {
      
       Contact contact1 =new Contact("1001","AAA","AAA1","1234567891","Hyd");
      
       ContactService contactService = new ContactService();
      
       System.out.println(contactService.addContact(contact1));
       System.out.println(contactService.updateContact("1001","Test","Test1","1234567891","Hyd"));
       System.out.println(contactService.deleteContact("1001"));
      
      

   }

}