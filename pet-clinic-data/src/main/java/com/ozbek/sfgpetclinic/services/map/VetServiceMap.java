package com.ozbek.sfgpetclinic.services.map;

import com.ozbek.sfgpetclinic.model.Vet;
import com.ozbek.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}