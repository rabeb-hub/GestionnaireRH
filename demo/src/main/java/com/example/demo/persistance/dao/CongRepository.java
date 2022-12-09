package com.example.demo.persistance.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.Conge;



public interface CongRepository extends JpaRepository<Conge, Long> { 


}
