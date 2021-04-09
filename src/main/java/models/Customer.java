package models;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:32 <br>
 * Project: webshop-back-end <br>
 */
public class Customer {

    private int id;
    private User userId;
    private String firstname;
    private String lastname;
    private String phoneNr;
    private String streetAddress;
    private City zipCode;

    public Customer(){}

    public Customer(int id, User userId, String firstname, String lastname,
                    String phoneNr, String streetAddress, City zipCode) {
        this.id = id;
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNr = phoneNr;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public City getZipCode() {
        return zipCode;
    }

    public void setZipCode(City zipCode) {
        this.zipCode = zipCode;
    }
}
