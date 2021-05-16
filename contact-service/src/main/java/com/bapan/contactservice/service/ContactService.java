package com.bapan.contactservice.service;

import model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> retrieveContact(int userId);
}
