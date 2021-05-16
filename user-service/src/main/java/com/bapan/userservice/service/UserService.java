package com.bapan.userservice.service;

import com.bapan.userservice.model.Person;

public interface UserService {

    Person retrieveUser(int personId);
}
