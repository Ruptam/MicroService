package com.bapan.userservice.model;

public class Contact {

    private int contactId;
    private String email;
    private String address;

    public Contact(int contactId, String email, String address) {
        this.contactId = contactId;
        this.email = email;
        this.address = address;
    }

    public Contact() {
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
