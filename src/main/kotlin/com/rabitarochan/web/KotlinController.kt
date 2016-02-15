package com.rabitarochan.web

import com.rabitarochan.services.KotlinService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class KotlinController {

    val service: KotlinService

    @Autowired constructor(service: KotlinService) {
        this.service = service
    }

    @RequestMapping(value = "/")
    fun index(model: Model): String {
        model.addAttribute("serviceClassName", service.javaClass.getName())
        model.addAttribute("templateValue", service.template)

        return "/index"
    }

}
