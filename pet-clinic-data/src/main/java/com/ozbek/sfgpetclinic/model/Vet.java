package com.ozbek.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ozbek on 2020-11-08 23:28
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
