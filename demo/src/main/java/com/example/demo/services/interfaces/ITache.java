package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.persistance.entities.Equipe;
import com.example.demo.persistance.entities.RoleEquipe;
import com.example.demo.persistance.entities.Tache;

@Service
public interface ITache {
	List<Tache> listAllTache();
	Tache saveTache(Tache tache);
	Tache updateRole(Tache tache);
	Tache getTacheById(long id);
    boolean deleteTache(long id);
    boolean deleteAllTache();
}
