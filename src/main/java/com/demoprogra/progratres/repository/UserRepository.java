package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(
            value = " SELECT u.user_id userId, CONCAT(p.name, ' ', p.apaterno) agentName " +
                    " FROM users u INNER JOIN people p ON u.people_id = p.people_id " +
                    " INNER JOIN roles r ON u.rol_id = r.rol_id " +
                    " WHERE r.rol_id = 2 ",
            nativeQuery = true
    )
    public List<Map<String, String>> getAgentList();
}
