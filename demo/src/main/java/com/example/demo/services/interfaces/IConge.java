package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.persistance.entities.Conge;


@Service
public interface IConge {
	
	List<Conge> listAllConge();
	Conge saveConge(Conge c);
	Conge updateConge(Conge c);
	Conge getCongeById(long id);
    boolean deleteConge(long id);
}
