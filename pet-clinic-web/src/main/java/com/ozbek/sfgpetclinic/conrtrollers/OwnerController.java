package com.ozbek.sfgpetclinic.conrtrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by ozbek on 2020-11-11
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {

        return "owners/index";
    }
}
