package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.persistance.entities.Personnel;



public interface PersonnelRepository extends JpaRepository<Personnel, Long> { 
	Personnel findByName(String name);

    @Query(value = "select count(*) from personnel",nativeQuery = true)
    int getQuantityOfPersonnel();
    @Query(value = "select * from personnel where id= :id",nativeQuery = true)
    Personnel getPersonnelById(@Param("id") int id);
    
    
}
