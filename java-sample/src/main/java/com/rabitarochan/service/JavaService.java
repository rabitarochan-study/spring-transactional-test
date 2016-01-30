package com.rabitarochan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JavaService {

    private final NamedParameterJdbcTemplate template;

    @Autowired
    public JavaService(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public NamedParameterJdbcTemplate getTemplate() {
        return this.template;
    }

}
