package com.bapan.userservice.controller;

import com.bapan.userservice.model.Contact;
import com.bapan.userservice.model.Person;
import com.bapan.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/person")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{personId}")
    public ResponseEntity<?> retrieveUser(@PathVariable("personId") int personId) {
        Person person = userService.retrieveUser(personId);
        if (person != null) {
            List<Contact> contacts = restTemplate.getForObject(
                        "http://contact-service/contact/"+personId, List.class);
            person.setContacts(contacts);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Person with ID :: "+ personId + "Not Found ", HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/hi")
    public String sayHi() {
        return "Hello World";
    }
}
