package com.ozbek.sfgpetclinic.services;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
