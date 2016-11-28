package com.beards.sorta;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by joshuakelley on 11/28/16.
 */
@Entity
public class Employee {
    @Id
    long id;
    String firstName;
    String lastName;
    String password;

    Employee(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Employee(String firstName, String lastName, String password){
        this.firstName = firstName;this.lastName = lastName;this.password = password;

    }

}
