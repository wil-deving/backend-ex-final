package com.demoprogra.progratres.service;

import com.demoprogra.progratres.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityServiceMysql implements EntityService {

    @Autowired
    private EntityRepository entityRepository;

}
