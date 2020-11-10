package com.ozbek.sfgpetclinic.model;

import java.io.Serializable;

/**
 * created by ozbek on 2020-11-11
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
