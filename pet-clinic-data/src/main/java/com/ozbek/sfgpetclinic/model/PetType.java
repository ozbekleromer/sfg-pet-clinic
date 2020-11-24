package com.ozbek.sfgpetclinic.model;

/**
 * @author ozbek on 2020-11-08 23:31
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
