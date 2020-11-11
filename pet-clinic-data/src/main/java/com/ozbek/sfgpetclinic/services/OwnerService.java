package com.ozbek.sfgpetclinic.services;

import com.ozbek.sfgpetclinic.model.Owner;

/**
 * created by ozbek on 2020-11-11
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
