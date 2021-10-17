package com.addressbook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadIO {
    public static void readContacts() {
        try {
            Files.lines(new File("E:\\bridgelabz prog\\AddressBookSystem\\src\\com\\addressbook\\Contacts.txt").toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long countContacts() {
        long entries = 0;
        try {
            entries = Files.lines(new File("E:\\bridgelabz prog\\AddressBookSystem\\src\\com\\addressbook\\Contacts").toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The Number of entries are: " + entries);
        return entries;
    }
}