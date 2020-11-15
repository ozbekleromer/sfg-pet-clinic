package com.ozbek.sfgpetclinic.services.map;

import com.ozbek.sfgpetclinic.model.Pet;
import com.ozbek.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by ozbek on 2020-11-11
 */
@Service
public class PetSeviceMap extends AbstractMapService<Pet, Long> implements PetService {

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
        return super.save(object);
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
