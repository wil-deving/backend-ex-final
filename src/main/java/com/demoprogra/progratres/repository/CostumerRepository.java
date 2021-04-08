package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Costumer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface CostumerRepository extends CrudRepository<Costumer, Integer> {

    @Query(
            value = " SELECT costumer_id costumerId, name, apaterno, amaterno, document, exp_document expDocument, " +
                    " address, phone, cellphone, email " +
                    " FROM costumers ",
            nativeQuery = true
    )
    public List<Map<String, String>> getCostumerList();

    @Query(
            value = " SELECT costumer_id, name, apaterno, amaterno, document, exp_document, " +
                    " address, phone, cellphone, email " +
                    " FROM costumers " +
                    " WHERE costumer_id = :costumerId ",
            nativeQuery = true
    )
    public Costumer findByIdCostumer(@Param("costumerId") String costumerId);
}
