package com.ozbek.sfgpetclinic.model;

import java.util.Set;

/**
 * @author ozbek on 2020-11-08 23:29
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
