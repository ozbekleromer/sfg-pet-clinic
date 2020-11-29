package com.ozbek.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author ozbek on 2020-11-08 23:31
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

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
}
