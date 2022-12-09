package com.example.demo.services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.CongRepository;
import com.example.demo.persistance.dao.EquipeRepository;
import com.example.demo.persistance.entities.Conge;
import com.example.demo.persistance.entities.Equipe;
import com.example.demo.services.interfaces.IEquipe;

@Service
public class EquipeService implements IEquipe {

	@Autowired
	EquipeRepository equipeRepository;
	
    @Autowired
    public void setCongRepository(EquipeRepository equipeRepository){
        this.equipeRepository=equipeRepository;
    }

    
	@Override
	public List<Equipe> listAllEquipe() {
		// TODO Auto-generated method stub
		return equipeRepository.findAll();
	}

	@Override
	public Equipe saveEquipe(Equipe e) {
		// TODO Auto-generated method stub
		return equipeRepository.save(e) ;
	}

	@Override
	public Equipe updateEquipe(Equipe e) {
		// TODO Auto-generated method stub
		return equipeRepository.saveAndFlush(e);
	}

	@Override
	public Equipe getEquipeById(long id) {
		// TODO Auto-generated method stub
		return equipeRepository.getEquipeById(id);
	}

	@Override
	public boolean deleteEquipe(long id) {
		// TODO Auto-generated method stub
		equipeRepository.deleteById(id);
		return true;
	}


	@Override
	public boolean deleteAllEquipe() {
		// TODO Auto-generated method stub
		equipeRepository.deleteAll();;
		return true;
	}

}
