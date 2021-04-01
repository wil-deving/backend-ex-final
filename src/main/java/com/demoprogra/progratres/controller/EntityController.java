package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.data.dto.EntityResponseDto;
import com.demoprogra.progratres.data.entity.Tester;
import com.demoprogra.progratres.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/entities")
public class EntityController {

    @Autowired
    private EntityService entityService;

}
