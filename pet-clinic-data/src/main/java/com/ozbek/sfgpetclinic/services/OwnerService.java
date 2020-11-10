package com.ozbek.sfgpetclinic.services;

import com.ozbek.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findByID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
