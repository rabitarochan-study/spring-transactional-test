package com.rabitarochan.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Service

@Service
open class SimpleService {

    val template: NamedParameterJdbcTemplate

    @Autowired constructor(template: NamedParameterJdbcTemplate) {
        this.template = template
    }

}