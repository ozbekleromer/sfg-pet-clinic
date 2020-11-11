package com.ozbek.sfgpetclinic.services.map;

import com.ozbek.sfgpetclinic.model.Owner;
import com.ozbek.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
