package com.ozbek.sfgpetclinic.services;

import com.ozbek.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
