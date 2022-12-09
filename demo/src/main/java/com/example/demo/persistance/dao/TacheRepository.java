package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long> {

}
