package model;

public class Contact {

    private int contactId;
    private String email;
    private String address;
    private int userId;

    public Contact(int contactId, String email, String address) {
        this.contactId = contactId;
        this.email = email;
        this.address = address;
    }

    public Contact(int contactId, String email, String address, int userId) {
        this.contactId = contactId;
        this.email = email;
        this.address = address;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                '}';
    }
}
