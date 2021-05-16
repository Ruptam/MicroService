package com.bapan.userservice.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int personId;
    private String name;
    private int age;
    private List<Contact> contacts = new ArrayList<>();

    public Person(int personId, String name, int age, List<Contact> contacts) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.contacts = contacts;
    }

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contacts=" + contacts +
                '}';
    }
}
