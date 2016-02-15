package com.rabitarochan.web

import com.rabitarochan.services.TransactionService
import com.rabitarochan.services.SimpleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class KotlinController {

    val simpleService: SimpleService

    val transactionService: TransactionService

    @Autowired constructor(simpleService: SimpleService, txService: TransactionService) {
        this.simpleService = simpleService
        this.transactionService = txService
    }

    @RequestMapping(value = "/")
    fun index(model: Model): String {
        model.addAttribute("simpleServiceClassName", simpleService.javaClass.name)
        model.addAttribute("simpleServiceTemplateValue", simpleService.template)
        model.addAttribute("transactionServiceClassName", transactionService.javaClass.name)
        model.addAttribute("transactionServiceTemplateValue", transactionService.template)

        return "index"
    }

}
