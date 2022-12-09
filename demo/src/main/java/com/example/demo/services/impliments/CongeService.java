package com.example.demo.services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.CongRepository;

import com.example.demo.persistance.entities.Conge;
import com.example.demo.persistance.entities.Personnel;
import com.example.demo.services.interfaces.IConge;

@Service
public class CongeService implements IConge{
	
	@Autowired
	CongRepository congRepository;
	
    @Autowired
    public void setCongRepository(CongRepository congRepository){
        this.congRepository=congRepository;
    }

	@Override
	public List<Conge> listAllConge() {
		// TODO Auto-generated method stub
		return congRepository.findAll();
	}

	@Override
	public Conge saveConge(Conge c) {
		// TODO Auto-generated method stub
		return congRepository.save(c);
	}

	@Override
	public Conge updateConge(Conge c) {
		// TODO Auto-generated method stub
		return congRepository.saveAndFlush(c);
	}

	@Override
	public boolean deleteConge(long id) {
		// TODO Auto-generated method stub
		congRepository.deleteById(id);
		return true;
	}

	@Override
	public Conge getCongeById(long id) {
		// TODO Auto-generated method stub
		return congRepository.getById(id);
	}


}
