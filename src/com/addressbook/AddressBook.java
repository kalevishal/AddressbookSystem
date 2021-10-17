package com.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    public static Scanner scan = new Scanner(System.in);

    public ArrayList<ContactDetails> contactList ;
    public HashMap<String, ArrayList<ContactDetails>> personByState;
    public HashMap<String, ArrayList<ContactDetails>> personByCity;

    public AddressBook() {
        personByCity = new HashMap<String, ArrayList<ContactDetails>>();
        personByState = new HashMap<String, ArrayList<ContactDetails>>();
        contactList = new ArrayList<>();
    }

    // Add Contact Details
    public void addContactDetails(){
        System.out.println("Enter the contact details:");
        System.out.println("Enter First Name");
        String firstName = scan.next();
        System.out.println("Enter last Name");
        String lastName = scan.next();
        System.out.println("Enter Address ");
        String address = scan.next();
        System.out.println("Enter City ");
        String city = scan.next();
        System.out.println("Enter State ");
        String state = scan.next();
        System.out.println("Enter  Email ");
        String email = scan.next();
        System.out.println("Enter phone Number");
        String phoneNumber = scan.next();
        System.out.println("Enter Zip code");
        String zip = scan.next();

        ContactDetails contactDetails = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);
        contactList.add(contactDetails);
        System.out.println(contactDetails);
        if(!personByState.containsKey(state)){
            personByState.put(state,new ArrayList<ContactDetails>());
        }
        personByState.get(state).add(contactDetails);

        if(!personByCity.containsKey(city)){
            personByCity.put(city,new ArrayList<ContactDetails>());
        }
        personByCity.get(city).add(contactDetails);

    }

    // Edit Contact Details
    public boolean editContactDetails(String Name)
    {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {
                System.out.println("Select an option to edit\n"
                        +"1] First Name\n"
                        +"2] Last Name\n"
                        +"3] Address\n"
                        +"4] City\n"
                        +"5] State\n"
                        +"6] Email"
                        +"7] phone Number\n"
                        +"8] ZIP code\n");

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
        return flag == 1;
    }

    //	Display Contact
    public boolean Display(String Name)
    {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {
                System.out.println(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    //	Display Address Book
    public boolean DisplayAddressBook(String Name)
    {
        int flag = 0;
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList);
            flag = 1;
        }
        return flag == 1;
    }

    // Delete Contact Details
    public boolean deleteContact(String name) {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(name))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    // Check Duplicate Entry
    public void checkDuplicate() {
        Set<String> ContactSet = new HashSet<>();
        Set<ContactDetails> filterSet = contactList.stream().filter(n -> !ContactSet.add(n.getFirstName())).collect(Collectors.toSet());

        for (ContactDetails contact : filterSet) {
            System.out.println("The Duplicate Contact is: " + contact.getFirstName() + " " + contact.getLastName());
        }
    }

    // Get Person Name by State
    public void getPersonNameByState(String State) {
        List<ContactDetails> list  = contactList.stream().filter(p ->p.getState().equals(State)).collect(Collectors.toList());
        for(ContactDetails contact: list){
            System.out.println("First Name: "+contact.getFirstName());
            System.out.println("Last Name: "+contact.getLastName());
        }
    }

    // Get Person Name by city
    public void getPersonNameByCity(String cityName) {
        List<ContactDetails> list  = contactList.stream().filter(p ->p.getCity().equals(cityName)).collect(Collectors.toList());
        for(ContactDetails contact: list){
            System.out.println("First Name: "+contact.getFirstName());
            System.out.println("Last Name: "+contact.getLastName());
        }
    }
}