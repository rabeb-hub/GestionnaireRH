package com.example.demo.services.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistance.dao.PersonnelRepository;
import com.example.demo.persistance.entities.Personnel;
import com.example.demo.services.interfaces.IPersonnel;
@Service
public class PersonnelService  implements IPersonnel {
	@Autowired
	PersonnelRepository personnelRepository;
	
    @Autowired
    public void setPersonnelRepository(PersonnelRepository personnelRepository){
        this.personnelRepository=personnelRepository;
    }
	@Override
	public Personnel savePersonnel(Personnel p) {
		// TODO Auto-generated method stub
		return personnelRepository.save(p);
	}

	@Override
	public Personnel updatePersonnel(Personnel p) {
		// TODO Auto-generated method stub
		return personnelRepository.saveAndFlush(p);
	}

	@Override
	public boolean deletePersonnel(long id) {
		// TODO Auto-generated method stub
		personnelRepository.deleteById(id);
		return true;
	}

	@Override
	public Personnel findPersonnelByName(String name) {
		// TODO Auto-generated method stub
		return personnelRepository.findByName(name);
	}

	@Override
	public int getQuantityOfPersonnel() {
		// TODO Auto-generated method stub
		return personnelRepository.getQuantityOfPersonnel();
	}

	@Override
	public Personnel getPersonnelById(int id) {
		// TODO Auto-generated method stub
		return personnelRepository.getPersonnelById(id);
	}
	@Override
	public List<Personnel> listAllPersonnel() {
		// TODO Auto-generated method stub
		 return personnelRepository.findAll();
	}


}
