package com.ozbek.sfgpetclinic.services;

import com.ozbek.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public interface VetService {

    Vet findByID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
