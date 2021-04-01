package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Tester;
import org.springframework.data.repository.CrudRepository;

public interface EntityRepository extends CrudRepository<Tester, Integer> {
}
