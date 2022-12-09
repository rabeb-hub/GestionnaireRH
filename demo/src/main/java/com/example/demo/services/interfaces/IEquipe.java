package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.persistance.entities.Equipe;
@Service
public interface IEquipe {

	List<Equipe> listAllEquipe();
    Equipe saveEquipe(Equipe e);
    Equipe updateEquipe(Equipe e);
    Equipe getEquipeById(long id);
    boolean deleteEquipe(long id);
    boolean deleteAllEquipe();
    
    
}
