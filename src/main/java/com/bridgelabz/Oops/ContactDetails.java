package com.bridgelabz.Oops;

 public class ContactDetails{
     private String firstName;
     private String lastName;
     private String Address;
     private String city;
     private String state;
     private int zip;
     private long phone;

     ContactDetails(String firstName, String lastName, String address, String city, String state, int zip, long phone) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.city = city;
         this.state = state;
         this.zip = zip;
         this.phone = phone;
     }
     public String getFirstName() {
         return firstName;
     }
     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getLastName() {
         return lastName;
     }
     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getAddress() {
         return Address;
     }
     public void setAddress(String address) {
         Address = address;
     }
     public String getCity() {
         return city;
     }
     public void setCity(String city) {
         this.city = city;
     }
     public String getState() {
         return state;
     }
     public void setState(String state) {
         this.state = state;
     }
     public int getZip() {
         return zip;
     }
     public void setZip(int zip) {
         this.zip = zip;
     }
     public long getPhone() {
         return phone;
     }
     public void setPhone(long phone) {
         this.phone = phone;
     }

 }


