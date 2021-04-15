package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Costumer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface CostumerRepository extends CrudRepository<Costumer, Integer> {

    @Query(
            value = " SELECT c.costumer_id costumerId, p.name, p.apaterno, p.amaterno, p.document, " +
                    " p.exp_document expDocument, p.address, p.phone, p.cellphone, p.email " +
                    " FROM costumers c INNER JOIN people p ON c.people_id = p.people_id " +
                    " ORDER BY c.created_at DESC ",
            nativeQuery = true
    )
    public List<Map<String, String>> getCostumerList();

    @Query(
            value = " SELECT c.costumer_id costumerId, p.people_id peopleId, p.name, p.apaterno, p.amaterno, p.document, " +
                    " p.exp_document expDocument, p.address, p.phone, p.cellphone, p.email " +
                    " FROM costumers c INNER JOIN people p ON c.people_id = p.people_id " +
                    " WHERE c.costumer_id = :costumerId ",
            nativeQuery = true
    )
    public Map<String, String> findByIdCostumer(@Param("costumerId") String costumerId);
}
