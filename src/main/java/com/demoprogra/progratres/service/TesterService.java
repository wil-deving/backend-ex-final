package com.demoprogra.progratres.service;

import com.demoprogra.progratres.data.entity.Tester;

public interface TesterService {

    Tester save(Tester tester);

    Iterable<Tester> getTestList();

    Iterable<Tester> getTestListById(String idTest);

}
