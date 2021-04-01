package com.demoprogra.progratres.service;

import com.demoprogra.progratres.data.entity.Tester;
import com.demoprogra.progratres.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesterServiceMysql implements TesterService {

    @Autowired
    private TesterRepository testerRepository;

    @Override
    public Tester save(Tester tester) {
        return testerRepository.save(tester);
    }

    @Override
    public Iterable<Tester> getTestList() {
        return testerRepository.getTestList();
    }

    @Override
    public Iterable<Tester> getTestListById(String idTest) {
        return testerRepository.getTestListById(idTest);
    }

}
