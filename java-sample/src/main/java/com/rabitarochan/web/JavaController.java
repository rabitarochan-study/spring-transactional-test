package com.rabitarochan.web;

import com.rabitarochan.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaController {

    private final JavaService service;

    @Autowired
    public JavaController(JavaService service) {
        this.service = service;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("serviceClassName", service.getClass().getName());
        model.addAttribute("templateValue", service.getTemplate());

        return "index";
    }

}
