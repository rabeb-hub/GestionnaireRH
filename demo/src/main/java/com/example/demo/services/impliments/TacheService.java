package com.example.demo.services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.PersonnelRepository;
import com.example.demo.persistance.dao.TacheRepository;
import com.example.demo.persistance.entities.Equipe;
import com.example.demo.persistance.entities.RoleEquipe;
import com.example.demo.persistance.entities.Tache;
import com.example.demo.services.interfaces.ITache;

@Service
public class TacheService implements ITache {

	@Autowired
	TacheRepository tacheRepository;
	
    @Autowired
    public void setPersonnelRepository(TacheRepository tacheRepository){
        this.tacheRepository=tacheRepository;
    }

	@Override
	public List<Tache> listAllTache() {
		// TODO Auto-generated method stub
		return tacheRepository.findAll();
	}

	@Override
	public Tache saveTache(Tache tache) {
		// TODO Auto-generated method stub
		return tacheRepository.save(tache);
	}

	@Override
	public Tache updateRole(Tache tache) {
		// TODO Auto-generated method stub
		return tacheRepository.saveAndFlush(tache);
	}

	@Override
	public Tache getTacheById(long id) {
		// TODO Auto-generated method stub
		return tacheRepository.getById(id);
	}

	@Override
	public boolean deleteTache(long id) {
		// TODO Auto-generated method stub
		tacheRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean deleteAllTache() {
		// TODO Auto-generated method stub
		tacheRepository.deleteAll();
		return false;
	}


}
