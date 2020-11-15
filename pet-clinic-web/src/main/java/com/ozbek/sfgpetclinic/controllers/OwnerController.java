package com.ozbek.sfgpetclinic.controllers;

import com.ozbek.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by ozbek on 2020-11-11
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
