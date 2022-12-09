package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.persistance.entities.Equipe;


public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    @Query(value = "select * from equipe where id= :id",nativeQuery = true)
    Equipe getEquipeById(@Param("id") long id);
    
}
