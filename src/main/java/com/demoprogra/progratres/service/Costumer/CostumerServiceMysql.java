package com.demoprogra.progratres.service.Costumer;

import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.People;
import com.demoprogra.progratres.repository.CostumerRepository;
import com.demoprogra.progratres.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CostumerServiceMysql implements CostumerService {

    @Autowired
    private CostumerRepository costumerRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public People savePeople(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public Costumer save(Costumer costumer) {
        return costumerRepository.save(costumer);
    }

    @Override
    public List<Map<String, String>> getCostumerList() {
        return costumerRepository.getCostumerList();
    }

    @Override
    public Map<String, String> findByIdCostumer(String idCostumer) {
        return costumerRepository.findByIdCostumer(idCostumer);
    }

    @Override
    public void deleteCostumer(Costumer costumer) {
        costumerRepository.delete(costumer);
    }
}
