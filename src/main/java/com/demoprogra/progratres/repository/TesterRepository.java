package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Tester;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TesterRepository extends CrudRepository<Tester, Integer> {

    /*
    @Query(
            value = "SELECT id_column_one, column_two FROM testing",
            nativeQuery = true
    )
    public Iterable<Tester> getTestList();
    */



    @Query(
            value = " SELECT tr.id_column_one, tt.column_two, tr.tester_column " +
            " FROM tester tr " +
            " INNER JOIN testing tt ON tr.id_column_one = tt.id_column_one ",
            nativeQuery = true
    )
    public Iterable<Tester> getTestList();


    @Query(
            value = " SELECT tr.id_column_one, tt.column_two, tr.tester_column " +
                    " FROM tester tr " +
                    " INNER JOIN testing tt ON tr.id_column_one = tt.id_column_one " +
                    " WHERE tt.id_column_one = :idTest ",
            nativeQuery = true
    )
    public Iterable<Tester> getTestListById(@Param("idTest") String idTest);

}
