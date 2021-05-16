package com.bapan.userservice.service;

import com.bapan.userservice.model.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<Person> persons = Arrays.asList(
            new Person(740, "John", 52),
            new Person(741, "Peter", 47),
            new Person(742, "Andrew", 50)
    );

    @Override
    public Person retrieveUser(int personId) {
        Person person = persons.stream().filter(p -> p.getPersonId() == personId).findAny().orElse(null);
        return person;
    }
}
