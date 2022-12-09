package com.example.demo.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.persistance.entities.Personnel;
@Service
public interface IPersonnel {
	Personnel savePersonnel(Personnel p);
	Personnel updatePersonnel(Personnel p);
    boolean deletePersonnel(long id);
    Personnel findPersonnelByName(String name);
    int getQuantityOfPersonnel();
    Personnel getPersonnelById(long id);
	List<Personnel> listAllPersonnel();

}
