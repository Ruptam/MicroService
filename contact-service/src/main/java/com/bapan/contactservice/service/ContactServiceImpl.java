package com.bapan.contactservice.service;

import model.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    private List<Contact> contacts = Arrays.asList(
            new Contact(100, "apple@gmail.com","Kolkata", 740),
            new Contact(101, "mango@gmail.com","Chennai", 740),
            new Contact(102, "watermelon@gmail.com","Delhi", 741),
            new Contact(103, "grapes@gmail.com","Mumbai", 742)
    );

    @Override
    public List<Contact> retrieveContact(int userId) {
        return contacts.stream().filter(contact -> contact.getUserId() == userId).map(contact -> {
                return contact;
        }).collect(Collectors.toList());
    }
}
