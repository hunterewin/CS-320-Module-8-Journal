package com.test;
/*
* This is Contact class
* */
public class Contact {
   
   private String contactID;
   private String firstName;
   private String lastName;
   private String phone;
   private String address;
  
   
   public Contact(String contactID,String firstName,String lastName,String phone,String address) throws InvalidInputException{
       if(isValidInput(contactID)){
           this.contactID=contactID;
       }else{
           throw new InvalidInputException(contactID);
       }
       if(isValidInput(firstName)){
           this.firstName=firstName;
       }else{
           throw new InvalidInputException(firstName);
       }
       if(isValidInput(lastName)){
           this.lastName=lastName;
       }else{
           throw new InvalidInputException(lastName);
       }
      
       if(phone!=null&&phone.length()==10){
           this.phone=phone;
       }else{
           throw new InvalidInputException(phone);
       }
       if(address!=null&&address.length()<=30){
           this.address=address;
       }else{
           throw new InvalidInputException(address);
       }
      
   }
   /*
   * This method will check the below things
   * 1.The given input is not null or not
   * 2.The given input is length is less than or equal to 10 or not
   *
   * If both the conditions are satisfied then it will return true
   * otherwise it will return false;
   *
   * */
   private boolean isValidInput(String input) {
      
       return input!=null&&input.length()<=10;
      
   }
  
   /*
   * getFirstName() is a getter method it will return firstName
   * */

   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   /*
   * getLastName() is a getter method it will return lastName
   * */
   public String getLastName() {
       return lastName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   /*
   * getPhone() is a getter method it will return phone
   * */
   public String getPhone() {
       return phone;
   }
   public void setPhone(String phone) {
       this.phone = phone;
   }
  
   /*
   * getAddress() is a getter method it will return address
   * */
   public String getAddress() {
       return address;
   }
   public void setAddress(String address) {
       this.address = address;
   }
  
   /*
   * getContactID() is a getter method it will return contactID
   * */
   public String getContactID() {
       return contactID;
   }
  
   
   @Override
   public String toString(){
       return "["+contactID+","+firstName+","+lastName+","+phone+","+address+"]";
   }
  

}