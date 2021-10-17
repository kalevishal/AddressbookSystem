package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner scan = new Scanner(System.in);

    public ArrayList<ContactDetails> contactList  = new ArrayList<>();

   public ArrayList<ContactDetails> contactList(ContactDetails contactdetails) {
        contactList.add(contactdetails);
        return contactList;
    }
    public void addContactDetails(){
        System.out.println("Welcome to  Address Book program.");

        System.out.println("Enter the First Name: ");
        String firstName = scan.next();
        System.out.println("Enter the Last Name: ");
        String lastName = scan.next();
        System.out.println("Enter your Address: ");
        String address = scan.next();
        System.out.println("Enter your city: ");
        String city = scan.next();
        System.out.println("Enter your state : ");
        String state = scan.next();
        System.out.println("Enter email id: ");
        String email = scan.next();
        System.out.println(" Enter phone number: ");
        String phoneNumber = scan.next();
        System.out.println("Enter zip: ");
        String zip = scan.next();

        ContactDetails contactDetails = new ContactDetails(firstName,lastName,address,city,state,email,phoneNumber,zip);
        contactDetails.add(contactDetails);
    }
    public boolean editContactDetails(String Name)
    {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {
                System.out.println("Enter the detail which needs to be updated:");

                System.out.println("1 : First Name of the contact to be edited");
                System.out.println("2 : Last Name of the contact to be edited");
                System.out.println("3 : Address of the contact to be edited");
                System.out.println("4 : City of the contact to be edited");
                System.out.println("5 : State of the contact to be edited");
                System.out.println("6 : Email of the contact to be edited");
                System.out.println("7 : Phone Number of the contact to be edited");
                System.out.println("8 : Zip of the contact to be edited");

                System.out.println("Select the index for the contact detail you want to edit ");

                int choice = scan.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("Enter First Name: ");
                        String firstName = scan.next();
                        contact.setFirstName(firstName);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter last name: ");
                        String lastName = scan.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter Address: ");
                        String address = scan.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter City: ");
                        String city = scan.next();
                        contact.setCity(city);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Enter State: ");
                        String state =scan.next();
                        contact.setState(state);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Enter Email: ");
                        String email = scan.next();
                        contact.setZip(email);
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = scan.next();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Enter Zip Code: ");
                        String zip = scan.next();
                        contact.setZip(zip);
                        break;
                    }

                }

                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    public boolean deleteContact(String name){
       int flag = 0;
       for (ContactDetails contact: contactList){
           if (contact.getFirstName().equals(name)){
               contactList.remove(contact);
               flag = 1;
               break;
           }
       }
       if (flag==1) {
           return true;
       }
       else {
               return false;

       }
    }
}