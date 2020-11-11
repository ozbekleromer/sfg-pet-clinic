package com.ozbek.sfgpetclinic.services.map;

import com.ozbek.sfgpetclinic.model.Pet;
import com.ozbek.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
public class PetSeviceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
