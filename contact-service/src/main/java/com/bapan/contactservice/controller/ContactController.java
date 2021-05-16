package com.bapan.contactservice.controller;

import com.bapan.contactservice.service.ContactService;
import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/{userId}")
    public ResponseEntity<?> retrieveContact(@PathVariable("userId") int userId) {
        List<Contact> contacts = contactService.retrieveContact(userId);
        if (contacts.size() > 0) {
            return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
        }
        return new ResponseEntity<String>("User Id :: " + userId + " Not Found", HttpStatus.NOT_FOUND);
    }
}
